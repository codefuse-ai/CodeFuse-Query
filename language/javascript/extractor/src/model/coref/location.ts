

import { BaseModel } from './base-model';
import { Position } from './position';
import { File } from './file';
import { hashToInt64 } from '../../util';

export interface Location extends BaseModel {
  file: File;
  start: Position;
  end: Position;
  text: string;
}

export function createLocation(
  file: File,
  start: Position,
  end: Position,
  text: string,
): Location {
  const uri = `${file.relativePath}:(${start.offset}-${end.offset})`;
  const oid = hashToInt64(uri);
  return {
    oid,
    file,
    start,
    end,
    text,
  };
}
