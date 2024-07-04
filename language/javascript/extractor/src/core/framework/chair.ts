import * as path from 'path';

import * as ts from 'typescript';
import type { PackageJson } from 'type-fest';
import { camelCase } from 'lodash';

import { FrameworkCoref, FrameworkExtractorBase } from './type';
import { coref, extendedTs } from '../../model';
import * as util from '../util';

/**
 * Get router SourceFiles
 *
 * @param program
 * @param projectPath
 * @returns
 */
function getRouterSourceFiles(
  program: ts.Program,
  projectPath: string,
): ts.SourceFile[] {
  return program
    .getSourceFiles()
    .filter(
      x =>
        path
          .relative(projectPath, x.fileName)
          .match(/^app\/router(\.[jt]s|\/.+\.[jt]s)$/g) !== null,
    );
}

/**
 * Get a map of controller qualified module name and corresponding ts SourceFile
 * @param program
 * @param projectPath
 * @returns
 */
function getControllerModuleSourceFileMap(
  program: ts.Program,
  projectPath: string,
): Map<string, ts.SourceFile> {
  const controllerPathPrefixes = ['app/controller/', 'app/controllers/'].map(
    x => path.join(projectPath, x),
  );

  function convertControllerPathToModule(filePath: string): string {
    const relativePath = path.relative(projectPath, filePath);
    const pathParts = relativePath.split('.')[0].split('/').slice(2);
    return pathParts.map(x => camelCase(x)).join('.');
  }

  const controllerModuleSourceFiles = program
    .getSourceFiles()
    .map(sourceFile => ({ path: sourceFile.fileName, sourceFile }))
    .filter(x =>
      controllerPathPrefixes.some(prefix => x.path.startsWith(prefix)),
    )
    .map(x => ({
      module: convertControllerPathToModule(x.path),
      sourceFile: x.sourceFile,
    }));

  return new Map(
    controllerModuleSourceFiles.map(x => [x.module, x.sourceFile]),
  );
}

/**
 * Get a map of service qualified module name and corresponding ts SourceFile
 *
 * @param program
 * @param projectPath
 * @returns
 */
function getServiceModuleSourceFileMap(
  program: ts.Program,
  projectPath: string,
): Map<string, ts.SourceFile> {
  const servicePathPrefix = path.join(projectPath, 'app/service/');

  function convertServicePathToModule(filePath: string): string {
    const relativePath = path.relative(projectPath, filePath);
    const pathParts = relativePath.split('.')[0].split('/').slice(2);
    return pathParts.map(x => camelCase(x)).join('.');
  }

  const serviceModuleSourceFiles = program
    .getSourceFiles()
    .map(sourceFile => ({ path: sourceFile.fileName, sourceFile }))
    .filter(x => x.path.startsWith(servicePathPrefix))
    .map(x => ({
      module: convertServicePathToModule(x.path),
      sourceFile: x.sourceFile,
    }));

  return new Map(serviceModuleSourceFiles.map(x => [x.module, x.sourceFile]));
}

function extractRouterSymbols(
  routerSourceFile: ts.SourceFile,
  typeChecker: ts.TypeChecker,
  controllerModuleSourceFileMap: Map<string, ts.SourceFile>,
  projectPath: string,
): {
  symbolMap: Map<bigint, coref.Symbol>;
  nodeSymbolMap: Map<bigint, bigint>;
} {
  const symbolMap = new Map<bigint, coref.Symbol>();
  const nodeSymbolMap = new Map<bigint, bigint>();

  // The router method names that may use controller functions.
  // Therefore, `redirect` is not included in the array.
  const routerMethodNames = [
    // HTTP
    'head',
    'get',
    'put',
    'post',
    'patch',
    'delete',
    'del',
    'options',
    'all',
    // RPC
    'rpc',
    'rpcAndGet',
    'rpcAndPost',
  ];

  util.ensureCorefFile(routerSourceFile, projectPath);
  util.forEachNode(routerSourceFile, (tsNode: extendedTs.Node) => {
    if (!ts.isCallExpression(tsNode)) {
      return;
    }

    const expression = tsNode.expression;
    const routerMethodName = util.isAccessExpression(expression)
      ? util.getAccessExpressionPropertyName(expression)
      : undefined;

    // Process router methods that may use controller functions.
    if (!(routerMethodName && routerMethodNames.includes(routerMethodName))) {
      return;
    }

    const routerArguments = tsNode.arguments;
    const lastArgument = routerArguments[routerArguments.length - 1];
    if (!lastArgument) {
      return;
    }

    let funcQualifiedName: string | undefined = undefined;
    if (util.isAccessExpression(lastArgument)) {
      const accessExpressionText = util.getAccessExpressionText(lastArgument);
      const re = /(app\.)?controller\.(.+)/;
      funcQualifiedName = accessExpressionText.match(re)?.[2];
    } else if (ts.isStringLiteral(lastArgument)) {
      funcQualifiedName = lastArgument.text;
    }

    if (!funcQualifiedName) {
      return;
    }

    let symbol: coref.Symbol | undefined;

    if (controllerModuleSourceFileMap.has(funcQualifiedName)) {
      // router use the module default function (function qualified name === module qualified name)
      const controllerSourceFile =
        controllerModuleSourceFileMap.get(funcQualifiedName);

      controllerSourceFile?.forEachChild((childNode: ts.Node) => {
        switch (childNode.kind) {
          case ts.SyntaxKind.ExportAssignment: {
            // export default xxx;
            const exportExpression = (childNode as ts.ExportAssignment)
              .expression;
            symbol = util.createSymbol(
              exportExpression,
              typeChecker,
              projectPath,
            );
            break;
          }
          case ts.SyntaxKind.FunctionDeclaration: {
            // export default function xxx() {...}
            const modifiers = childNode.modifiers;
            if (
              modifiers?.[0].kind === ts.SyntaxKind.ExportKeyword &&
              modifiers?.[1].kind === ts.SyntaxKind.DefaultKeyword
            ) {
              symbol = util.createSymbol(childNode, typeChecker, projectPath);
            }
            break;
          }
          case ts.SyntaxKind.ExpressionStatement: {
            // module.exports = xxx
            const binaryExpression = (childNode as ts.ExpressionStatement)
              .expression as ts.BinaryExpression;
            if (
              binaryExpression?.operatorToken?.kind !==
              ts.SyntaxKind.EqualsToken
            ) {
              return;
            }

            const leftExpression = binaryExpression?.left;
            const accessExpressionText =
              util.getAccessExpressionText(leftExpression);
            if (accessExpressionText !== 'module.exports') {
              return;
            }

            const funcNode = binaryExpression.right;
            symbol = util.createSymbol(funcNode, typeChecker, projectPath);

            break;
          }
        }
      });
    } else {
      // function qualified name !== module qualified name
      const nameParts = funcQualifiedName.split('.');
      const moduleQualifiedName = nameParts.slice(0, -1).join('.');

      if (controllerModuleSourceFileMap.has(moduleQualifiedName)) {
        const funcName = nameParts[nameParts.length - 1];
        const controllerSourceFile =
          controllerModuleSourceFileMap.get(moduleQualifiedName);
        controllerSourceFile?.forEachChild((childNode: ts.Node) => {
          // TODO: other style controller functions
          if (ts.isExpressionStatement(childNode)) {
            const binaryExpression =
              childNode.expression as ts.BinaryExpression;
            if (
              binaryExpression?.operatorToken?.kind !==
              ts.SyntaxKind.EqualsToken
            ) {
              return;
            }

            const leftExpression = binaryExpression.left;

            if (!util.isAccessExpression(leftExpression)) {
              return;
            }

            const accessExpressionLeftText =
              leftExpression.expression.getText(controllerSourceFile);
            if (accessExpressionLeftText === 'exports') {
              // exports.xxx = xx
              // xx might be a function expression, arrow function, or function identifier

              const exportsPropName =
                util.getAccessExpressionPropertyName(leftExpression);
              if (exportsPropName !== funcName) {
                return;
              }

              const funcNode = binaryExpression.right;
              symbol = util.createSymbol(funcNode, typeChecker, projectPath);
            } else if (
              accessExpressionLeftText === 'module' &&
              util.getAccessExpressionPropertyName(leftExpression) === 'exports'
            ) {
              // module.exports = xxx
              // xxx might be a class expression or class identifier
              const rightNode = binaryExpression.right;
              const classLikeDeclaration = util.getClassOfExpression(
                rightNode,
                typeChecker,
              );

              if (classLikeDeclaration !== undefined) {
                symbol = createClassMemberSymbolByName(
                  classLikeDeclaration,
                  funcName,
                  typeChecker,
                  projectPath,
                );
              }
            }
          } else if (ts.isClassDeclaration(childNode)) {
            // export default class xxx {}
            if (!util.isExportDefaultDeclaration(childNode)) {
              return;
            }

            symbol = createClassMemberSymbolByName(
              childNode as ts.ClassDeclaration,
              funcName,
              typeChecker,
              projectPath,
            );
          }
        });
      }
    }

    if (symbol !== undefined) {
      const corefNode = util.ensureCorefAstNode(lastArgument);
      symbolMap.set(symbol.oid, symbol);
      nodeSymbolMap.set(corefNode.oid, symbol.oid);

      if (util.isAccessExpression(lastArgument)) {
        const funcIdentifierNode =
          util.getAccessExpressionPropertyNode(lastArgument);
        const funcIdentifierCorefNode =
          util.ensureCorefAstNode(funcIdentifierNode);
        nodeSymbolMap.set(funcIdentifierCorefNode.oid, symbol.oid);
      }
    }
  });

  return {
    symbolMap,
    nodeSymbolMap,
  };
}

function createClassMemberSymbolByName(
  classLikeDeclaration: ts.ClassLikeDeclaration,
  funcName: string,
  typeChecker: ts.TypeChecker,
  projectPath: string,
) {
  const member = util.getClassMemberByName(classLikeDeclaration, funcName);
  return member
    ? util.createSymbol(member, typeChecker, projectPath)
    : undefined;
}

interface ServiceAccessExpressionInfo {
  accessExpression: ts.AccessExpression;
  serviceModuleQualifiedName: string;
  functionName: string;
  serviceSourceFile: ts.SourceFile;
}

/**
 * Get service access expression information.
 *
 * @param sourceFile
 * @param serviceModuleSourceFileMap
 * @returns
 */
function getServiceAccessExpressionInfos(
  sourceFile: ts.SourceFile,
  serviceModuleSourceFileMap: Map<string, ts.SourceFile>,
) {
  const re = /^(this\.|ctx\.|this\.ctx\.)?service\.(.+)$/;
  const serviceAccessExpressionInfos: ServiceAccessExpressionInfo[] = [];
  util.forEachNode(sourceFile, (node: ts.Node) => {
    if (
      !util.isAccessExpression(node) ||
      util.isAccessExpression(node.parent)
    ) {
      return;
    }

    const propertyAccessText = util.getAccessExpressionText(node);
    const matchArray = propertyAccessText.match(re);
    const serviceFuncQualifiedName = matchArray?.[2];
    if (!serviceFuncQualifiedName) {
      return;
    }

    const nameParts = serviceFuncQualifiedName.split('.');
    const serviceModuleQualifiedName = nameParts.slice(0, -1).join('.');
    if (!serviceModuleSourceFileMap.has(serviceModuleQualifiedName)) {
      return;
    }

    const functionName = nameParts[nameParts.length - 1];
    const serviceSourceFile = serviceModuleSourceFileMap.get(
      serviceModuleQualifiedName,
    ) as ts.SourceFile;

    serviceAccessExpressionInfos.push({
      accessExpression: node,
      serviceModuleQualifiedName,
      functionName,
      serviceSourceFile,
    });
  });

  return serviceAccessExpressionInfos;
}

/**
 * Extract the COREF for a service property access by the specified service class
 *
 * @param serviceAccessExpressionInfo
 * @param serviceClass
 * @param typeChecker
 * @param projectPath
 * @returns
 */
function extractServiceAccessCorefByServiceClass(
  serviceAccessExpressionInfo: ServiceAccessExpressionInfo,
  serviceClass: ts.ClassLikeDeclaration,
  typeChecker: ts.TypeChecker,
  projectPath: string,
): {
  symbol: coref.Symbol | undefined;
  nodeSymbols: coref.NodeSymbol[];
  callSite: coref.CallSite | undefined;
} {
  const { accessExpression, functionName } = serviceAccessExpressionInfo;
  const member = util.getClassMemberByName(serviceClass, functionName);
  const tsSymbol = member && util.getSymbol(member, typeChecker);
  const declaration = tsSymbol && util.getSymbolDeclaration(tsSymbol);

  // Symbol
  const symbol =
    tsSymbol &&
    util.createSymbolFromTsSymbol(tsSymbol, typeChecker, projectPath);
  const nodeSymbols: coref.NodeSymbol[] = symbol
    ? [
        {
          node: util.ensureCorefAstNode(
            util.getAccessExpressionPropertyNode(accessExpression),
          ) as coref.Node,
          symbol,
        },
        {
          node: util.ensureCorefAstNode(accessExpression) as coref.Node,
          symbol,
        },
      ]
    : [];

  // Call site
  let callSite: coref.CallSite | undefined;
  // TODO: getter and setter
  const corefInvokeExpression = ts.isCallLikeExpression(accessExpression.parent)
    ? (util.ensureCorefAstNode(accessExpression.parent) as coref.Node)
    : undefined;
  if (corefInvokeExpression && declaration) {
    if (ts.isMethodDeclaration(declaration)) {
      callSite = {
        invokeExpression: corefInvokeExpression,
        callee: util.ensureCorefAstNode(declaration) as coref.Node,
      };
    } else if (ts.isPropertyDeclaration(declaration)) {
      const functionNode = declaration.initializer;
      if (
        functionNode &&
        (ts.isFunctionExpression(functionNode) ||
          ts.isArrowFunction(functionNode))
      ) {
        callSite = {
          invokeExpression: corefInvokeExpression,
          callee: util.ensureCorefAstNode(functionNode) as coref.Node,
        };
      }
    }
  }

  return {
    symbol,
    nodeSymbols,
    callSite,
  };
}

/**
 * Get the service class from the expression.
 *
 * @param expression
 * @param typeChecker
 * @returns
 */
function getServiceClass(
  expression: ts.Expression,
  typeChecker: ts.TypeChecker,
) {
  // Resolve service class from the expression
  const classLikeDeclaration = util.getClassOfExpression(
    expression,
    typeChecker,
  );

  if (classLikeDeclaration) {
    return classLikeDeclaration;
  }

  // Resolve service class from return value of the default function
  const functionLikeDeclaration = util.getFunctionOfExpression(
    expression,
    typeChecker,
  );

  return (
    functionLikeDeclaration &&
    functionLikeDeclaration.body?.forEachChild(funcChildNode => {
      if (ts.isReturnStatement(funcChildNode)) {
        const returnExpression = funcChildNode.expression;
        // console.log(typeChecker.getSymbolAtLocation(returnExpression as ts.Node));
        return returnExpression
          ? util.getClassOfExpression(returnExpression, typeChecker)
          : undefined;
      }
    })
  );
}

/**
 * Extract the COREF for a service property access.
 *
 * @param serviceAccessExpressionInfo
 * @param typeChecker
 * @param projectPath
 * @returns
 */
function extractServiceAccessCoref(
  serviceAccessExpressionInfo: ServiceAccessExpressionInfo,
  typeChecker: ts.TypeChecker,
  projectPath: string,
): {
  symbol: coref.Symbol | undefined;
  nodeSymbols: coref.NodeSymbol[];
  callSite: coref.CallSite | undefined;
} {
  const result = serviceAccessExpressionInfo.serviceSourceFile.forEachChild(
    topNode => {
      if (ts.isExpressionStatement(topNode)) {
        // module.exports = xxxClass
        const expression = topNode.expression;
        if (util.isModuleExportsAssignExpression(expression)) {
          const serviceClass = getServiceClass(
            (expression as ts.BinaryExpression).right,
            typeChecker,
          );
          return (
            serviceClass &&
            extractServiceAccessCorefByServiceClass(
              serviceAccessExpressionInfo,
              serviceClass,
              typeChecker,
              projectPath,
            )
          );
        }
      } else if (ts.isExportAssignment(topNode)) {
        // export default xxxClass;
        const expression = topNode.expression;
        const serviceClass = getServiceClass(expression, typeChecker);
        return (
          serviceClass &&
          extractServiceAccessCorefByServiceClass(
            serviceAccessExpressionInfo,
            serviceClass,
            typeChecker,
            projectPath,
          )
        );
      } else if (ts.isClassDeclaration(topNode)) {
        // export default class xxx {}
        if (util.isExportDefaultDeclaration(topNode)) {
          return extractServiceAccessCorefByServiceClass(
            serviceAccessExpressionInfo,
            topNode,
            typeChecker,
            projectPath,
          );
        }
      }
    },
  );

  return (
    result ?? {
      symbol: undefined,
      nodeSymbols: [],
      callSite: undefined,
    }
  );
}

export interface ChairExtractor extends FrameworkExtractorBase {
  controllerModuleSourceFileMap?: Map<string, ts.SourceFile>;
  serviceModuleSourceFileMap?: Map<string, ts.SourceFile>;
}

export const chairExtractor: ChairExtractor = {
  name: 'chair',

  detectByPackageJson(packageJson: PackageJson): boolean {
    return Object.prototype.hasOwnProperty.call(
      packageJson?.dependencies ?? {},
      'chair',
    );
  },

  /**
   * Extract chair symbols
   *
   * @param program
   * @param projectPath
   * @returns
   */
  extractProjectCoref(program, projectPath?): FrameworkCoref {
    const symbolMap = new Map<bigint, coref.Symbol>();
    const nodeSymbolMap = new Map<bigint, bigint>();
    const callSiteMap = new Map<bigint, bigint>();

    const chairCoref = {
      symbolMap,
      nodeSymbolMap,
      callSiteMap,
    };

    if (!projectPath) {
      return chairCoref;
    }

    const routerSourceFiles = getRouterSourceFiles(program, projectPath);
    const controllerModuleSourceFileMap = getControllerModuleSourceFileMap(
      program,
      projectPath,
    );

    routerSourceFiles.forEach(routerSourceFile => {
      const result = extractRouterSymbols(
        routerSourceFile,
        program.getTypeChecker(),
        controllerModuleSourceFileMap,
        projectPath,
      );
      for (const [oid, symbol] of result.symbolMap.entries()) {
        symbolMap.set(oid, symbol);
      }
      for (const [node_oid, symbol_oid] of result.nodeSymbolMap.entries()) {
        nodeSymbolMap.set(node_oid, symbol_oid);
      }
    });

    return chairCoref;
  },

  extractFileCoref(sourceFile, program, projectPath?): FrameworkCoref {
    const symbolMap = new Map<bigint, coref.Symbol>();
    const nodeSymbolMap = new Map<bigint, bigint>();
    const callSiteMap = new Map<bigint, bigint>();
    const chairCoref = {
      symbolMap,
      nodeSymbolMap,
      callSiteMap,
    };

    if (!projectPath) {
      return chairCoref;
    }

    if (!this.serviceModuleSourceFileMap) {
      this.serviceModuleSourceFileMap = getServiceModuleSourceFileMap(
        program,
        projectPath,
      );
    }

    const typeChecker = program.getTypeChecker();
    const serviceAccessExpressionInfos = getServiceAccessExpressionInfos(
      sourceFile,
      this.serviceModuleSourceFileMap,
    );
    serviceAccessExpressionInfos.forEach(serviceAccessExpressionInfo => {
      const { symbol, nodeSymbols, callSite } = extractServiceAccessCoref(
        serviceAccessExpressionInfo,
        typeChecker,
        projectPath,
      );

      if (symbol) {
        symbolMap.set(symbol.oid, symbol);
      }

      nodeSymbols.forEach(nodeSymbol => {
        nodeSymbolMap.set(nodeSymbol.node.oid, nodeSymbol.symbol.oid);
      });

      if (callSite) {
        callSiteMap.set(callSite.invokeExpression.oid, callSite.callee.oid);
      }
    });

    return chairCoref;
  },
};
