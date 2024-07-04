

import * as ts from 'typescript';

import * as coref from '../coref';

export interface NodeBase {
  $corefModel?: coref.BaseModel;
  symbol?: ts.Symbol;
}

export interface Node extends ts.Node, NodeBase {}
