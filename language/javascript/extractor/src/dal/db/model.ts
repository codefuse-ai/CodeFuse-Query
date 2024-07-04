
/* eslint-disable @typescript-eslint/ban-types */
/* eslint-disable @typescript-eslint/no-explicit-any */

import * as prisma from '@prisma/client';

export type TopLevel = prisma.top_level;
export type Node = prisma.node;
export type Comment = prisma.comment;
export type NodeComment = prisma.node_comment;
export type BindingElementPropertyName = prisma.binding_element_property_name;
export type BindingElementName = prisma.binding_element_name;
export type BindingElementInitializer = prisma.binding_element_initializer;
export type ClassLikeDeclaration = prisma.class_like_declaration;
export type FunctionLikeDeclaration = prisma.function_like_declaration;
export type FunctionEnclosingNode = prisma.function_enclosing_node;
export type Literal = prisma.literal;
export type Modifier = prisma.modifier;
export type CfgEntryNode = prisma.cfg_entry_node;
export type CfgExitNode = prisma.cfg_exit_node;
export type Location = prisma.location;
export type File = prisma.file;
export type NumberOfLines = prisma.number_of_lines;
export type Symbol = prisma.symbol_;
export type NodeSymbol = prisma.node_symbol;
export type ShorthandAssignmentValueSymbol =
  prisma.shorthand_assignment_value_symbol;
export type CallSite = prisma.call_site;
export type Metadata = prisma.metadata;

export interface Coref {
  topLevels?: TopLevel[];
  nodes?: Node[];
  comments?: Comment[];
  nodeComments?: NodeComment[];
  bindingElementPropertyNames?: BindingElementPropertyName[];
  bindingElementNames?: BindingElementName[];
  bindingElementInitializers?: BindingElementInitializer[];
  classLikeDeclarations?: ClassLikeDeclaration[];
  functionLikeDeclarations?: FunctionLikeDeclaration[];
  functionEnclosingNodes?: FunctionEnclosingNode[];
  literals?: Literal[];
  modifiers?: Modifier[];
  cfgEntryNodes?: CfgEntryNode[];
  cfgExitNodes?: CfgExitNode[];
  locations?: Location[];
  files?: File[];
  numbersOfLines?: NumberOfLines[];
  symbols?: Symbol[];
  nodeSymbols?: NodeSymbol[];
  shorthandAssignmentValueSymbols?: ShorthandAssignmentValueSymbol[];
  callSites?: CallSite[];
}

type CorefProperty = keyof Coref;

const CHUNK_SIZE = 1000;

/**
 * Split one big COREF to multiple small COREFs
 *
 * @param coref the big COREF
 * @returns the split COREFs
 */
export function splitCoref(coref: Coref): Coref[] {
  const splitCorefs: Coref[] = [];
  let currentCoref: Coref = {};
  let currentLength = 0;

  for (const property of Object.keys(coref) as CorefProperty[]) {
    let corefObjects = coref[property];
    if (!(corefObjects && corefObjects.length > 0)) {
      continue;
    }

    let totalLength = currentLength + corefObjects.length;

    while (totalLength > CHUNK_SIZE) {
      let splitCoref: Coref;
      let chunkSize: number;
      if (currentLength === 0) {
        chunkSize = CHUNK_SIZE;
        splitCoref = {
          [property]: corefObjects.slice(0, chunkSize),
        };
      } else {
        splitCoref = currentCoref;
        currentCoref = {};
        currentLength = 0;

        chunkSize = CHUNK_SIZE - currentLength;
        (splitCoref[property] as any) = corefObjects.slice(0, chunkSize);
      }

      corefObjects = corefObjects.slice(chunkSize);
      splitCorefs.push(splitCoref);

      totalLength = corefObjects.length;
    }

    if (corefObjects.length > 0) {
      (currentCoref[property] as any) = corefObjects;
      currentLength = currentLength + corefObjects.length;
    }
  }

  if (currentLength > 0) {
    splitCorefs.push(currentCoref);
  }

  return splitCorefs;
}
