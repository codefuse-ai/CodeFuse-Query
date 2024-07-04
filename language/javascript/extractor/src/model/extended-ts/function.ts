

import * as ts from 'typescript';

import { NodeBase } from './node';

export interface FunctionDeclaration extends ts.FunctionDeclaration, NodeBase {}

export interface MethodDeclaration extends ts.MethodDeclaration, NodeBase {}

export interface GetAccessorDeclaration
  extends ts.GetAccessorDeclaration,
    NodeBase {}

export interface SetAccessorDeclaration
  extends ts.SetAccessorDeclaration,
    NodeBase {}

export interface ConstructorDeclaration
  extends ts.ConstructorDeclaration,
    NodeBase {}

export interface FunctionExpression extends ts.FunctionExpression, NodeBase {}

export interface ArrowFunction extends ts.ArrowFunction, NodeBase {}

export type FunctionLikeDeclaration =
  | FunctionDeclaration
  | MethodDeclaration
  | GetAccessorDeclaration
  | SetAccessorDeclaration
  | ConstructorDeclaration
  | FunctionExpression
  | ArrowFunction;
