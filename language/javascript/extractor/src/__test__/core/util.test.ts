import * as ts from 'typescript';
import {
  isKeywordSyntaxKind,
  isCommentSyntaxKind,
  isJsOrTsFile,
} from '../../core/util';

describe(isKeywordSyntaxKind, () => {
  test('isKeywordSyntaxKind', () => {
    expect(isKeywordSyntaxKind(ts.SyntaxKind.FirstKeyword)).toBeTruthy();
    expect(isKeywordSyntaxKind(ts.SyntaxKind.LastKeyword)).toBeTruthy();
    expect(isKeywordSyntaxKind(ts.SyntaxKind.AsyncKeyword)).toBeTruthy();
  });
});

describe(isCommentSyntaxKind, () => {
  test('isCommentSyntaxKind', () => {
    expect(
      isCommentSyntaxKind(ts.SyntaxKind.SingleLineCommentTrivia),
    ).toBeTruthy();
    expect(isCommentSyntaxKind(ts.SyntaxKind.AsyncKeyword)).toBeFalsy();
  });
});

describe(isJsOrTsFile, () => {
  test('isJsOrTsFile', () => {
    expect(isJsOrTsFile('.ts')).toBeTruthy();
    expect(isJsOrTsFile('.jsx')).toBeTruthy();
    expect(isJsOrTsFile('.java')).toBeFalsy();
  });
});
