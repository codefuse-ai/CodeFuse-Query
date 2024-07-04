

import * as ts from 'typescript';

import * as coref from '../coref';
import { NodeBase } from './node';

export interface BindingElement extends ts.BindingElement, NodeBase {
  $corefModel: coref.BindingElement;
}
