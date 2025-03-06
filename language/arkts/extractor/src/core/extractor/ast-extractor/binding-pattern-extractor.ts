/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { CorefBindingPattern } from "../../../model/coref";
import * as util from "../../util";

export function extractBindingPattern(
  id: bigint,
  node: ts.Node,
  corefBindingPattern: CorefBindingPattern,
) {
  const kind = node.kind;

  switch (kind) {
    case SyntaxKind.BindingElement: {
      const bindingElement = node as ts.BindingElement;

      corefBindingPattern.bindingElements.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(bindingElement.name),
      });

      if (bindingElement.propertyName) {
        corefBindingPattern.bindingElementPropertyNameNodes.push({
          binding_element_id: id,
          property_name_node_id: util.getCorefIdFromTsNodeInSameFile(
            bindingElement.propertyName,
          ),
        });
      }

      if (bindingElement.dotDotDotToken) {
        corefBindingPattern.bindingElementDotDotDotTokens.push({
          binding_element_id: id,
          dot_dot_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            bindingElement.dotDotDotToken,
          ),
        });
      }

      if (bindingElement.initializer) {
        corefBindingPattern.bindingElementInitializers.push({
          binding_element_id: id,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            bindingElement.initializer,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ObjectBindingPattern:
      corefBindingPattern.objectBindingPatterns.push({ id });

      (node as ts.ObjectBindingPattern).elements.forEach((element, index) => {
        corefBindingPattern.objectBindingPatternElements.push({
          element_id: util.getCorefIdFromTsNodeInSameFile(element),
          object_binding_pattern_id: id,
          index,
        });
      });
      return;

    case SyntaxKind.ArrayBindingPattern:
      corefBindingPattern.arrayBindingPatterns.push({ id });

      (node as ts.ArrayBindingPattern).elements.forEach((element, index) => {
        corefBindingPattern.arrayBindingPatternElements.push({
          element_id: util.getCorefIdFromTsNodeInSameFile(element),
          array_binding_pattern_id: id,
          index,
        });
      });
      return;
  }
}
