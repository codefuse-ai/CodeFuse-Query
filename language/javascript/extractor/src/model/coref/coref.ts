

import * as coref from './index';

/**
 * The COREF
 */
export interface Coref {
  topLevels: coref.TopLevel[];
  tokens: coref.Token[];
  comments: coref.Comment[];
  nodes: coref.Node[];
  nodeComments: coref.NodeComment[];
  bindingElements: coref.BindingElement[];
  classLikeDeclarations: coref.ClassLikeDeclaration[];
  functionLikeDeclarations: coref.FunctionLikeDeclaration[];
  functionEnclosingNodes: coref.FunctionEnclosingNode[];
  literals: coref.Literal[];
  modifiers: coref.Modifier[];
  cfgEntryNodes: coref.SyntheticCfgNode[];
  cfgExitNodes: coref.SyntheticCfgNode[];
  symbolMap: Map<bigint, coref.Symbol>;
  nodeSymbolMap: Map<bigint, bigint>;
  shorthandAssignmentValueSymbolMap: Map<bigint, bigint>;
  callSiteMap: Map<bigint, bigint>;
  locations: coref.Location[];
  numbersOfLines: coref.NumberOfLines[];
  files: coref.File[];
}

/**
 * The COREF extracted from the single file
 */
export interface SingleFileCoref {
  topLevels: coref.TopLevel[];
  tokens: coref.Token[];
  comments: coref.Comment[];
  nodes: coref.Node[];
  nodeComments: coref.NodeComment[];
  classLikeDeclarations: coref.ClassLikeDeclaration[];
  functionLikeDeclarations: coref.FunctionLikeDeclaration[];
  functionEnclosingNodes: coref.FunctionEnclosingNode[];
  literals: coref.Literal[];
  locations: coref.Location[];
  numbersOfLines: coref.NumberOfLines[];
  files: coref.File[];
}

/**
 * The COREF of a file that contains the data related to other files.
 */
export interface CrossFileCoref {
  symbolMap: Map<bigint, coref.Symbol>;
  nodeSymbolMap: Map<bigint, bigint>;
  callSiteMap: Map<bigint, bigint>;
}
