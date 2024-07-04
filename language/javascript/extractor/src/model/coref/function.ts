

import { Node } from './node';
import { SignatureDeclaration } from './signature-declaration';

export interface FunctionLikeDeclaration extends SignatureDeclaration {}

export interface FunctionEnclosingNode {
  nodeOid: bigint;
  functionOid: bigint;
}

export interface CallSite {
  invokeExpression: Node;
  callee: Node;
}

export function createCallSite(invokeExpression: Node, callee: Node): CallSite {
  return {
    invokeExpression,
    callee,
  };
}
