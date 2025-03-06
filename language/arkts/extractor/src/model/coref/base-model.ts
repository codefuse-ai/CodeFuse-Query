/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { SyntaxKind } from "ohos-typescript";

export interface BaseModel {
  id: bigint;
}

export interface HasKind extends BaseModel {
  kind: SyntaxKind;
}

export interface HasParent extends BaseModel {
  parent_id: bigint;
}

export interface HasIndex extends BaseModel {
  index: number;
}

export interface HasParentKind extends HasParent {
  parent_kind: SyntaxKind;
}

export interface HasNameNode extends BaseModel {
  name_node_id: bigint;
}

export interface HasOptionalNameNode extends BaseModel {
  name_node_id?: bigint;
}

export interface HasExpression extends BaseModel {
  expression_id: bigint;
}

export interface HasTypeNode extends BaseModel {
  type_node_id: bigint;
}

export interface HasOptionalTypeNode extends BaseModel {
  type_node_id?: bigint;
}

export interface HasInitializer extends BaseModel {
  initializer_id: bigint;
}

export interface HasOptionalInitializer extends BaseModel {
  initializer_id?: bigint;
}

export interface HasBody extends BaseModel {
  body_id: bigint;
}

export interface HasOptionalBody extends BaseModel {
  body_id?: bigint;
}

export interface HasOptionalQuestionToken extends BaseModel {
  question_token_id?: bigint;
}

export interface HasOptionalExclamationToken extends BaseModel {
  exclamation_token_id?: bigint;
}
