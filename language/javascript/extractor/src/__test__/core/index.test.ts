

/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable @typescript-eslint/no-unused-vars */

import * as path from 'path';
import * as ts from 'typescript';

import * as expectedCoref from './expected-coref';
import { extractFile } from '../../core/extractor';
import { compilerOptions } from '../../core/extract-manager';
import { Coref } from '../../model/coref';

/**
 * 用于生成测试用例的结果
 *
 * @param object 原始对象
 * @returns 处理了 bigint 类型的 JSON 格式字符串
 */
function generateExpectedObject(object: any): string {
  function replacer(key: string, value: any) {
    if (typeof value === 'bigint') {
      return value.toString() + 'n';
    } else if (value instanceof Map) {
      return Array.from(value.entries());
    } else {
      return value;
    }
  }

  return JSON.stringify(object, replacer).replace(/"-?\d+n"/g, match =>
    match.slice(1, -1),
  );
}

/**
 * 根据测试文件路径抽取文件
 *
 * @param filePath 测试文件路径
 * @returns 抽取的 Coref 数据
 */
function extractTestFile(filePath: string): Coref | undefined {
  const program = ts.createProgram([filePath], compilerOptions);
  // 使用 getTypeChecker 确保 Node 中的属性都初始化
  program.getTypeChecker();
  const sourceFile = program.getSourceFile(filePath);

  return extractFile(sourceFile as ts.SourceFile, program);
}

describe(extractFile, () => {
  const rootPath = path.dirname(path.dirname(path.dirname(__dirname)));

  test('extractFile-meta-property', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'meta-property.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData).toEqual(expectedCoref.metaPropertyCoref);
  });

  test('extractFile-type-operator', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'type-operator.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.nodes).toEqual(expectedCoref.typeOperatorNodes);
  });

  test('extractFile-heritage-clause', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'heritage-clause.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.nodes).toEqual(expectedCoref.heritageClauseNodes);
  });

  test('extractFile-function', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'function.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.callSiteMap).toEqual(expectedCoref.callSiteMap);
    expect(corefData?.functionEnclosingNodes).toEqual(
      expectedCoref.functionFunctionEnclosingNodes,
    );
    expect(corefData?.nodes).toEqual(expectedCoref.functionNodes);
  });

  test('extractFile-for-statement', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'for-statement.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.nodes).toEqual(expectedCoref.forStatementNodes);
  });

  test('extractFile-binding-pattern', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'binding-pattern.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.nodes).toEqual(expectedCoref.bindingPatternNodes);
  });

  test('extractFile-comment', () => {
    const filePath = path.join(rootPath, 'tests', 'ts', 'comment.ts');
    const corefData = extractTestFile(filePath);

    expect(corefData?.comments).toEqual(expectedCoref.commentCoref.comments);
    expect(corefData?.nodes).toEqual(expectedCoref.commentCoref.nodes);
    expect(corefData?.nodeComments).toEqual(
      expectedCoref.commentCoref.nodeComments,
    );
  });
});
