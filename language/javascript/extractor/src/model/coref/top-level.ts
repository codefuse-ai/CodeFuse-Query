

import { BaseModel } from './base-model';
import { Location } from './location';
import { hashToInt64 } from '../../util';

export enum TopLevelKind {
  SCRIPT,
  INLINE_SCRIPT,
  EVENT_HANDLER,
  JAVASCRIPT_URL,
}

export interface TopLevel extends BaseModel {
  kind: TopLevelKind;
  location: Location;
}

export function createTopLevel(
  kind: TopLevelKind,
  location: Location,
): TopLevel {
  const uri = `top_level:${kind}:${location.file.relativePath}:(${location.start.offset}-${location.end.offset})`;
  const oid = hashToInt64(uri);

  return {
    oid,
    kind,
    location,
  };
}
