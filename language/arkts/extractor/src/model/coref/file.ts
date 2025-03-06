/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as path from "path";
import { hashToInt64 } from "../../util";

import { BaseModel } from "./base-model";

export interface File extends BaseModel {
  name: string;
  extension: string;
  relative_path: string;
  location_id?: bigint;
  parent_id?: bigint;
}

export function createFile(relativePath: string): File {
  const name = path.basename(relativePath);
  const extension = path.extname(name);
  const uri = `File:${relativePath}`;
  const id = hashToInt64(uri);
  return {
    id,
    name,
    extension,
    relative_path: relativePath,
  };
}
