/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as ts from "ohos-typescript";

import { NodeBase } from "./ast-node";
import * as coref from "../coref";

/**
 * The ts.SourceFile interface with internal properties and COREF properties
 */
export interface SourceFile extends ts.SourceFile, NodeBase {
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  parseDiagnostics?: any[];

  $corefFile: coref.File;
}
