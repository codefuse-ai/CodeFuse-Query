/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { BaseModel } from "./base-model";

export interface Locatable extends BaseModel {
  location_id: bigint;
}
