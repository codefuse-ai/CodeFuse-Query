import * as ts from 'typescript';
import { PackageJson } from 'type-fest';
import { coref, extendedTs } from '../../model';

export interface FrameworkCoref {
  symbolMap: Map<bigint, coref.Symbol>;
  nodeSymbolMap: Map<bigint, bigint>;
  callSiteMap: Map<bigint, bigint>;
}

export interface FrameworkExtractorBase {
  name: string;

  detectByPackageJson(packageJson: PackageJson): boolean;

  extractProjectCoref?(
    program: ts.Program,
    projectPath?: string,
  ): FrameworkCoref;

  extractFileCoref?(
    sourceFile: extendedTs.SourceFile,
    program: ts.Program,
    projectPath?: string | undefined,
  ): FrameworkCoref;
}
