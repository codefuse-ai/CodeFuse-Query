

import * as ts from 'typescript';

import * as coref from '../coref';
import { NodeBase } from './node';

export interface Modifier
  extends ts.ModifierToken<ts.ModifierSyntaxKind>,
    NodeBase {
  $corefModel: coref.Modifier;
}
