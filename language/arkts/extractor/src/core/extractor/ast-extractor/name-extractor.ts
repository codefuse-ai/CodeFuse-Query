/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import {
  ComputedPropertyName,
  Node,
  QualifiedName,
  SyntaxKind,
} from "ohos-typescript";

import { coref } from "../../../model";
import * as util from "../../util";

export function extractName(
  id: bigint,
  node: Node,
  corefName: coref.CorefName,
) {
  const kind = node.kind;

  switch (kind) {
    case SyntaxKind.Identifier:
    case SyntaxKind.PrivateIdentifier:
      const identifier = {
        id: util.getCorefIdFromTsNodeInSameFile(node),
        name: node.getText(),
      };

      if (kind === SyntaxKind.Identifier) {
        corefName.identifiers.push(identifier);
      } else {
        corefName.privateIdentifiers.push(identifier);
      }
      return;
  }

  switch (kind) {
    case SyntaxKind.QualifiedName:
      corefName.qualifiedNames.push({
        id,
        left_id: util.getCorefIdFromTsNodeInSameFile(
          (node as QualifiedName).left,
        ),
        right_id: util.getCorefIdFromTsNodeInSameFile(
          (node as QualifiedName).right,
        ),
      });
      return;
    case SyntaxKind.ComputedPropertyName:
      corefName.computedPropertyNames.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ComputedPropertyName).expression,
        ),
      });
      return;
  }
}
