/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { coref, extendedTs } from "../../model";
import * as util from "../util";

type ReScanFunction = () => SyntaxKind;

interface ReScanItem {
  pos: number;
  callback: ReScanFunction;
}

/**
 * Extract comments and code token locations.
 *
 * @param sourceFile
 */
export function extractComments(sourceFile: extendedTs.SourceFile) {
  const code = sourceFile.text;
  const scanner = ts.createScanner(
    ts.ScriptTarget.Latest,
    /*skipTrivia*/ false,
    ts.LanguageVariant.JSX,
    code,
  );
  const reScanGreaterToken: ReScanFunction =
    scanner.reScanGreaterToken.bind(scanner);
  const reScanSlashToken: ReScanFunction =
    scanner.reScanSlashToken.bind(scanner);
  const reScanTemplateToken: ReScanFunction = scanner.reScanTemplateToken.bind(
    scanner,
  ) as ReScanFunction;

  const reScanItems: ReScanItem[] = [];

  if (
    !sourceFile.parseDiagnostics ||
    sourceFile.parseDiagnostics.length === 0
  ) {
    util.forEachNode(
      sourceFile,
      (node) => {
        if (util.shouldReScanGreaterThanToken(node)) {
          reScanItems.push({
            pos: node.getStart(sourceFile, false),
            callback: reScanGreaterToken,
          });
        } else if (util.shouldReScanSlashToken(node)) {
          reScanItems.push({
            pos: node.getStart(sourceFile, false),
            callback: reScanSlashToken,
          });
        } else if (util.shouldReScanTemplateToken(node)) {
          reScanItems.push({
            pos: node.getStart(sourceFile, false),
            callback: reScanTemplateToken,
          });
        }
      },
      true,
    );
  }

  const comments: coref.Comment[] = [];
  const commentLocationMap = new Map<bigint, coref.Location>();
  const codeTokenLocationMap = new Map<bigint, coref.Location>();

  let tokenSyntaxKind: SyntaxKind;
  let reScanItemIndex = 0;
  do {
    tokenSyntaxKind = scanner.scan();
    if (scanner.getTokenPos() === reScanItems[reScanItemIndex]?.pos) {
      reScanItems[reScanItemIndex].callback();
      reScanItemIndex++;
    }

    const start = scanner.getTokenPos();
    const text = scanner.getTokenText();
    const width = text.length;
    const end = start + width;

    // skip broken token
    if (width === 0) {
      continue;
    }

    const location = coref.createLocation(
      sourceFile,
      start,
      end,
      // text,
    );

    if (util.isCommentSyntaxKind(tokenSyntaxKind)) {
      // Handle comments
      const comment = coref.createComment(tokenSyntaxKind, location.id);
      comments.push(comment);

      commentLocationMap.set(location.id, location);
    } else if (
      ts.isTokenKind(tokenSyntaxKind) &&
      !util.isNonCodeTokenSyntaxKind(tokenSyntaxKind)
    ) {
      // Handle code tokens
      codeTokenLocationMap.set(location.id, location);
    }
  } while (tokenSyntaxKind !== SyntaxKind.EndOfFileToken);

  const codeTokenLocations = Array.from(codeTokenLocationMap.values());

  return {
    comments,
    commentLocationMap,
    codeTokenLocations,
  };
}
