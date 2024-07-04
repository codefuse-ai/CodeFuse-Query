
/* eslint-disable @typescript-eslint/ban-types */
/* eslint-disable @typescript-eslint/no-explicit-any */

import { coref } from '../../model';
import {
  TopLevel,
  Node,
  Comment,
  NodeComment,
  BindingElementPropertyName,
  BindingElementName,
  BindingElementInitializer,
  ClassLikeDeclaration,
  FunctionLikeDeclaration,
  FunctionEnclosingNode,
  Literal,
  Location,
  NumberOfLines,
  File,
  Symbol,
  NodeSymbol,
  CallSite,
  Coref,
  Metadata,
  Modifier,
  CfgEntryNode,
  CfgExitNode,
  ShorthandAssignmentValueSymbol,
} from './model';

import { PrismaClient, PrismaPromise } from '@prisma/client';

/**
 * 创建 comments
 *
 * @param prismaClient
 * @param comments
 * @returns
 */
export function createComments(
  prismaClient: PrismaClient,
  comments: Comment[],
) {
  return comments.map(data =>
    prismaClient.comment.create({
      data,
    }),
  );
}

/**
 * 创建 locations
 *
 * @param prismaClient
 * @param locations
 * @returns
 */
export function createLocations(
  prismaClient: PrismaClient,
  locations: Location[],
) {
  return locations.map(data =>
    prismaClient.location.create({
      data,
    }),
  );
}

/**
 * 创建 files
 *
 * @param prismaClient
 * @param files
 * @returns
 */
export function createFiles(prismaClient: PrismaClient, files: File[]) {
  return files.map(data =>
    prismaClient.file.create({
      data,
    }),
  );
}

/**
 * 创建 nodes
 *
 * @param prismaClient
 * @param nodes
 * @returns
 */
export function createNodes(prismaClient: PrismaClient, nodes: Node[]) {
  const promises = nodes.map(data =>
    prismaClient.node.create({
      data,
    }),
  );
  return promises;
}

/**
 * 创建 class-like declarations
 *
 * @param prismaClient
 * @param classLikeDeclarations
 * @returns
 */
export function createClassLikeDeclarations(
  prismaClient: PrismaClient,
  classLikeDeclarations: ClassLikeDeclaration[],
) {
  return classLikeDeclarations.map(data =>
    prismaClient.class_like_declaration.create({
      data,
    }),
  );
}

/**
 * 创建 function-like declarations
 * @param prismaClient
 * @param functionLikeDeclarations
 * @returns
 */
export function createFunctionLikeDeclarations(
  prismaClient: PrismaClient,
  functionLikeDeclarations: FunctionLikeDeclaration[],
) {
  return functionLikeDeclarations.map(data =>
    prismaClient.function_like_declaration.create({
      data,
    }),
  );
}

/**
 * 创建 literals
 * @param prismaClient
 * @param literals
 * @returns
 */
export function createLiterals(
  prismaClient: PrismaClient,
  literals: Literal[],
) {
  return literals.map(data =>
    prismaClient.literal.create({
      data,
    }),
  );
}

/**
 * 创建节点与注释的关联关系
 *
 * @param prismaClient
 * @param nodeComments
 * @returns
 */
export function createNodeComments(
  prismaClient: PrismaClient,
  nodeComments: NodeComment[],
) {
  return nodeComments.map(data =>
    prismaClient.node_comment.create({
      data,
    }),
  );
}

/**
 * 创建函数与其包含的节点的关联关系
 *
 * @param prismaClient
 * @param functionEnclosingNodes
 * @returns
 */
export function createFunctionEnclosingNodes(
  prismaClient: PrismaClient,
  functionEnclosingNodes: FunctionEnclosingNode[],
) {
  return functionEnclosingNodes.map(data =>
    prismaClient.function_enclosing_node.create({
      data,
    }),
  );
}

/**
 * 创建 top-levels
 *
 * @param prismaClient
 * @param topLevels
 * @returns
 */
export function createTopLevels(
  prismaClient: PrismaClient,
  topLevels: TopLevel[],
) {
  return topLevels.map(data =>
    prismaClient.top_level.create({
      data,
    }),
  );
}

/**
 * 创建每个 locatable 元素对应的 number-of-lines 数据
 *
 * @param prismaClient
 * @param numbersOfLines
 * @returns
 */
export function createNumbersOfLines(
  prismaClient: PrismaClient,
  numbersOfLines: NumberOfLines[],
) {
  return numbersOfLines.map(data =>
    prismaClient.number_of_lines.create({
      data,
    }),
  );
}

/**
 * Create symbols
 *
 * @param prismaClient
 * @param symbols
 * @returns
 */
export function createSymbols(prismaClient: PrismaClient, symbols: Symbol[]) {
  return symbols.map(data =>
    prismaClient.symbol_.create({
      data,
    }),
  );
}

/**
 * Create node symbol relations
 *
 * @param prismaClient
 * @param nodeSymbols
 * @returns
 */
export function createNodeSymbols(
  prismaClient: PrismaClient,
  nodeSymbols: NodeSymbol[],
) {
  return nodeSymbols.map(data =>
    prismaClient.node_symbol.create({
      data,
    }),
  );
}

/**
 * Create shorthand assignment value symbol relations.
 *
 * @param prismaClient
 * @param shorthandAssignmentValueSymbols
 * @returns
 */
export function createShorthandAssignmentValueSymbols(
  prismaClient: PrismaClient,
  shorthandAssignmentValueSymbols: ShorthandAssignmentValueSymbol[],
) {
  return shorthandAssignmentValueSymbols.map(data =>
    prismaClient.shorthand_assignment_value_symbol.create({ data }),
  );
}

/**
 * 创建 call sites
 *
 * @param prismaClient
 * @param callSites
 * @returns
 */
export function createCallSites(
  prismaClient: PrismaClient,
  callSites: CallSite[],
) {
  return callSites.map(data =>
    prismaClient.call_site.create({
      data,
    }),
  );
}

export function createIgnoredPaths(
  prismaClient: PrismaClient,
  ignoredPaths: coref.IgnoredPath[],
) {
  return ignoredPaths.map(ignoredPath =>
    prismaClient.ignored_path.create({
      data: {
        oid: ignoredPath.oid,
        path_kind: ignoredPath.pathKind,
        path: ignoredPath.path,
        ignore_kind: ignoredPath.ignoreKind,
      },
    }),
  );
}

/**
 * Create bindingElementPropertyNames
 *
 * @param prismaClient
 * @param bindingElementPropertyNames
 * @returns
 */
export function createBindingElementPropertyNames(
  prismaClient: PrismaClient,
  bindingElementPropertyNames: BindingElementPropertyName[],
) {
  return bindingElementPropertyNames.map(data =>
    prismaClient.binding_element_property_name.create({
      data,
    }),
  );
}

/**
 * Create bindingElementNames
 *
 * @param prismaClient
 * @param bindingElementNames
 * @returns
 */
export function createBindingElementNames(
  prismaClient: PrismaClient,
  bindingElementNames: BindingElementName[],
) {
  return bindingElementNames.map(data =>
    prismaClient.binding_element_name.create({
      data,
    }),
  );
}

/**
 * Create bindingElementInitializers
 *
 * @param prismaClient
 * @param bindingElementInitializers
 * @returns
 */
export function createBindingElementInitializers(
  prismaClient: PrismaClient,
  bindingElementInitializers: BindingElementInitializer[],
) {
  return bindingElementInitializers.map(data =>
    prismaClient.binding_element_initializer.create({
      data,
    }),
  );
}

/**
 * Create cfgEntryNodes
 *
 * @param prismaClient
 * @param cfgEntryNodes
 * @returns
 */
export function createCfgEntryNodes(
  prismaClient: PrismaClient,
  cfgEntryNodes: CfgEntryNode[],
) {
  return cfgEntryNodes.map(data =>
    prismaClient.cfg_entry_node.create({
      data,
    }),
  );
}

/**
 * Create cfgExitNodes
 * @param prismaClient
 * @param cfgExitNodes
 * @returns
 */
export function createCfgExitNodes(
  prismaClient: PrismaClient,
  cfgExitNodes: CfgExitNode[],
) {
  return cfgExitNodes.map(data =>
    prismaClient.cfg_exit_node.create({
      data,
    }),
  );
}

/**
 * Create a metadata
 *
 * @param prismaClient
 * @param metadata
 * @returns
 */
export function createMetadata(prismaClient: PrismaClient, metadata: Metadata) {
  return prismaClient.metadata.create({
    data: metadata,
  });
}

/**
 * Create modifiers
 *
 * @param prismaClient
 * @param modifiers
 * @returns
 */
export function createModifiers(
  prismaClient: PrismaClient,
  modifiers: Modifier[],
) {
  return modifiers.map(data =>
    prismaClient.modifier.create({
      data,
    }),
  );
}

/**
 * Persist the coref data
 *
 * @param prismaClient
 * @param corefData
 * @returns
 */
export function persistCoref(prismaClient: PrismaClient, corefData: Coref) {
  let creations: PrismaPromise<any>[] = [];
  if (corefData.topLevels) {
    creations = createTopLevels(prismaClient, corefData.topLevels);
  }

  if (corefData.nodes) {
    creations = creations.concat(createNodes(prismaClient, corefData.nodes));
  }

  if (corefData.comments) {
    creations = creations.concat(
      createComments(prismaClient, corefData.comments),
    );
  }

  if (corefData.nodeComments) {
    creations = creations.concat(
      createNodeComments(prismaClient, corefData.nodeComments),
    );
  }

  if (corefData.bindingElementPropertyNames) {
    creations = creations.concat(
      createBindingElementPropertyNames(
        prismaClient,
        corefData.bindingElementPropertyNames,
      ),
    );
  }

  if (corefData.bindingElementNames) {
    creations = creations.concat(
      createBindingElementNames(prismaClient, corefData.bindingElementNames),
    );
  }

  if (corefData.bindingElementInitializers) {
    creations = creations.concat(
      createBindingElementInitializers(
        prismaClient,
        corefData.bindingElementInitializers,
      ),
    );
  }

  if (corefData.classLikeDeclarations) {
    creations = creations.concat(
      createClassLikeDeclarations(
        prismaClient,
        corefData.classLikeDeclarations,
      ),
    );
  }

  if (corefData.functionLikeDeclarations) {
    creations = creations.concat(
      createFunctionLikeDeclarations(
        prismaClient,
        corefData.functionLikeDeclarations,
      ),
    );
  }

  if (corefData.functionEnclosingNodes) {
    creations = creations.concat(
      createFunctionEnclosingNodes(
        prismaClient,
        corefData.functionEnclosingNodes,
      ),
    );
  }

  if (corefData.literals) {
    creations = creations.concat(
      createLiterals(prismaClient, corefData.literals),
    );
  }

  if (corefData.modifiers) {
    creations = creations.concat(
      createModifiers(prismaClient, corefData.modifiers),
    );
  }

  if (corefData.cfgEntryNodes) {
    creations = creations.concat(
      createCfgEntryNodes(prismaClient, corefData.cfgEntryNodes),
    );
  }

  if (corefData.cfgExitNodes) {
    creations = creations.concat(
      createCfgExitNodes(prismaClient, corefData.cfgExitNodes),
    );
  }

  if (corefData.locations) {
    creations = creations.concat(
      createLocations(prismaClient, corefData.locations),
    );
  }

  if (corefData.files) {
    creations = creations.concat(createFiles(prismaClient, corefData.files));
  }

  if (corefData.numbersOfLines) {
    creations = creations.concat(
      createNumbersOfLines(prismaClient, corefData.numbersOfLines),
    );
  }

  if (corefData.symbols) {
    creations = creations.concat(
      createSymbols(prismaClient, corefData.symbols),
    );
  }

  if (corefData.nodeSymbols) {
    creations = creations.concat(
      createNodeSymbols(prismaClient, corefData.nodeSymbols),
    );
  }

  if (corefData.shorthandAssignmentValueSymbols) {
    creations = creations.concat(
      createShorthandAssignmentValueSymbols(
        prismaClient,
        corefData.shorthandAssignmentValueSymbols,
      ),
    );
  }

  if (corefData.callSites) {
    creations = creations.concat(
      createCallSites(prismaClient, corefData.callSites),
    );
  }

  return creations;
}
