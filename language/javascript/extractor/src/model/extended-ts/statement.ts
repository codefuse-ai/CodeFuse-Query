

import * as ts from 'typescript';

import { NodeBase } from './node';
import * as coref from '../coref';

export interface StatementBase extends NodeBase {
  $corefModel?: coref.Statement;
}

export interface Statement extends ts.Statement, StatementBase {}

export interface ForStatement extends ts.ForStatement, StatementBase {}
