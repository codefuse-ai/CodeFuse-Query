

import { Node } from './node';

export interface BindingElement extends Node {
  propertyNameOid?: bigint;
  nameOid: bigint;
  initializerOid?: bigint;
}
