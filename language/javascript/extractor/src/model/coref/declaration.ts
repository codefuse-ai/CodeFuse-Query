

import { Node } from './node';

export interface Declaration extends Node {}

export interface NamedDeclaration extends Declaration {
  name?: string;
}
