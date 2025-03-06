/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as prisma from "@prisma/client";
import * as ts from "ohos-typescript";

import {
  extractAstNodes,
  extractCallSites,
  extractComments,
  extractNumberOfLines,
  extractSymbols,
} from ".";
import { coref, extendedTs } from "../../model";
import type { ExtractOptions } from "../../types";
import * as util from "../util";
import { extractTypes } from "./type-extractor";

/**
 * 抽取一个文件的信息
 *
 * @param program
 * @param filePath
 * @param projectPath
 * @returns 该文件的 Coref 数据
 */
export function extractFile(
  sourceFile: extendedTs.SourceFile,
  program: ts.Program,
  projectPath?: string | undefined,
  options?: ExtractOptions,
): coref.Coref {
  const corefFile = util.ensureCorefFile(sourceFile, projectPath);

  // Comments
  const { comments, commentLocationMap, codeTokenLocations } =
    extractComments(sourceFile);

  // AST data
  const { locationMap: astLocationMap, ...corefAstData } =
    extractAstNodes(sourceFile);

  const typeChecker = program.getTypeChecker();

  // Symbols
  const { symbolMap, nodeSymbolMap, shorthandAssignmentValueSymbolMap } =
    extractSymbols(sourceFile, typeChecker, projectPath);

  // Call Sites
  const { callSiteDeclarations, callSiteImplementations } = extractCallSites(
    program,
    sourceFile,
    projectPath,
  );

  // Types
  const { typeMap, nodeTypeMap } = extractTypes(sourceFile, typeChecker);

  // Locations
  const locationMap = new Map([...commentLocationMap, ...astLocationMap]);
  const fileLocation = coref.createLocation(sourceFile, 0, sourceFile.end);
  corefFile.location_id = fileLocation.id;
  locationMap.set(fileLocation.id, fileLocation);

  const locations = Array.from(locationMap.values());

  // TODO: Set the actual parent_id for file.
  corefFile.parent_id = 0n;

  // NumberOfLines list
  const commentLocations = Array.from(commentLocationMap.values());
  const numberOfLinesList = extractNumberOfLines(
    locations,
    codeTokenLocations,
    commentLocations,
  );

  // Text
  const texts = options?.extractText
    ? locations.map(({ id, start, end }) => ({
        id,
        text: sourceFile.text.substring(start, end),
      }))
    : [];

  return {
    ...corefAstData,

    files: [sourceFile.$corefFile as prisma.file],
    locations,
    numberOfLinesList,
    texts,
    comments,

    symbolMap,
    nodeSymbolMap,
    shorthandAssignmentValueSymbolMap,

    callSiteDeclarations,
    callSiteImplementations,

    typeMap,
    nodeTypeMap,
  };
}
