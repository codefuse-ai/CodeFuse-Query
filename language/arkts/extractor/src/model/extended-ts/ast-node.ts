/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as ts from "ohos-typescript";

import * as coref from "../coref";

export interface NodeBase {
  $corefAstNode: coref.AstNode | coref.TopLevel;
  $corefLocation: coref.Location;
}

export interface Node extends ts.Node, NodeBase {}
