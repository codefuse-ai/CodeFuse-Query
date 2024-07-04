

import * as ts from 'typescript';

import { BaseModel } from './base-model';
import { Locatable } from './locatable';
import { Location } from './location';
import { hashToInt64 } from '../../util';

export type NodeSyntaxKind = ts.SyntaxKind;

export interface Node extends BaseModel, Locatable {
  kind: NodeSyntaxKind;
  parent_oid?: bigint;
  index?: number;
}

export function computeNodeOid(
  kind: ts.SyntaxKind,
  location: Location,
): bigint {
  const uri = `node:${kind}:${location.file.relativePath}:(${location.start.offset}-${location.end.offset})`;
  const oid = hashToInt64(uri);
  return oid;
}

export function createNode(kind: ts.SyntaxKind, location: Location): Node {
  const oid = computeNodeOid(kind, location);
  return {
    oid,
    kind,
    location,
  };
}
