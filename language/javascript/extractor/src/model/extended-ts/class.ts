

import * as ts from 'typescript';

import * as coref from '../coref';
import { NodeBase } from './node';

export interface ClassDeclaration extends ts.ClassDeclaration, NodeBase {
  $corefModel?: coref.Node;
}

export interface ClassExpression extends ts.ClassExpression, NodeBase {
  $corefModel?: coref.Node;
}

export type ClassLikeDeclaration = ClassDeclaration | ClassExpression;
