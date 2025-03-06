/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { SyntaxKind } from "ohos-typescript";

import { BaseModel } from "./base-model";
import { hashToInt64 } from "../../util";

export enum TopLevelKind {
  SCRIPT = SyntaxKind.SourceFile,
  INLINE_SCRIPT = -1,
  EVENT_HANDLER = -2,
  JAVASCRIPT_URL = -3,
}

export interface TopLevel extends BaseModel {
  kind: TopLevelKind;
  location_id: bigint;
}

export function createTopLevel(
  kind: TopLevelKind,
  locationId: bigint,
): TopLevel {
  const uri = `TopLevel:${kind}:${locationId}`;
  const id = hashToInt64(uri);

  return {
    id,
    kind,
    location_id: locationId,
  };
}
