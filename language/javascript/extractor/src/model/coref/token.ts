

import * as ts from 'typescript';

import { Location } from './location';
import { Node, createNode } from './node';

export type TokenSyntaxKind = ts.TokenSyntaxKind;

export interface Token extends Node {
  kind: TokenSyntaxKind;
}

export function createToken(kind: TokenSyntaxKind, location: Location): Token {
  return createNode(kind, location) as Token;
}
