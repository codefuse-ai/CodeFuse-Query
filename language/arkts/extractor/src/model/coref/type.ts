/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { type_ as Type } from "@prisma/client";

import { hashToInt64 } from "../../util";

export function createType(name: string): Type {
  const uri = `Type:${name}`;
  const id = hashToInt64(uri);

  return {
    id,
    name,
  };
}
