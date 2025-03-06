/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as prisma from "@prisma/client";
import type * as ts from "ohos-typescript";

import { extendedTs } from "../../../model";
import * as util from "../../util";

/**
 * Extract the child nodes of a ts.Node.
 */
export function extractChildNodes(parentId: bigint, tsNode: ts.Node) {
  const parentKind = tsNode.kind;

  let index = 0;
  const childNodes: prisma.ast_node[] = [];
  const childNodeLocations: prisma.location[] = [];

  util.forEachChild(tsNode, (childTsNode: ts.Node) => {
    if (childTsNode.end - childTsNode.getStart() === 0) {
      return;
    }

    const { astNode, location } = util.ensureCorefAstNodeAndLocation(
      childTsNode as extendedTs.Node,
    ) as { astNode: prisma.ast_node; location: prisma.location };

    childNodeLocations.push(location);

    astNode.parent_id = parentId;
    astNode.parent_kind = parentKind;
    astNode.index = index;
    childNodes.push(astNode);
    index++;
  });

  return {
    childNodes,
    childNodeLocations,
  };
}
