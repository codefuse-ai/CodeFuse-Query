

import * as ts from 'typescript';

import * as coref from '../coref';

/**
 * The ts.SourceFile interface with internal properties and COREF properties
 */
export interface SourceFile extends ts.SourceFile {
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  parseDiagnostics?: any[];

  $file?: coref.File;
  $corefModel?: coref.TopLevel;
}
