
/* eslint-disable @typescript-eslint/ban-types */

import * as ts from 'typescript';

import { BaseModel } from './base-model';
import { Node } from './node';

export interface Symbol extends BaseModel {
  name: string;
  description: string;
}

export interface NodeSymbol {
  node: Node;
  symbol: Symbol;
}

/**
 * Try to get the symbol name
 *
 * @param tsSymbol the specified ts.Symbol
 * @returns symbol name
 */
function getSymbolName(tsSymbol: ts.Symbol): string {
  // export default class A
  // symbol.name cannot get 'default' instead of 'A'
  if (tsSymbol.flags & ts.SymbolFlags.Class && tsSymbol.name === 'default') {
    const {
      valueDeclaration: { localSymbol },
    } = tsSymbol as any;
    if (localSymbol != null) {
      return localSymbol.name;
    }

    // export default class { }
    // class without a name
    return 'default';
  }

  // other cases
  return tsSymbol.name;
}

export function createSymbol(
  oid: bigint,
  tsSymbol: ts.Symbol,
  description: string,
): Symbol {
  return {
    oid,
    name: getSymbolName(tsSymbol),
    description,
  };
}
