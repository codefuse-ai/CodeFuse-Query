

import * as path from 'path';
import { hashToInt64 } from '../../util';

import { BaseModel } from './base-model';

export interface File extends BaseModel {
  name: string;
  extension: string;
  relativePath: string;
  locationOid?: bigint;
}

export function createFile(relativePath: string): File {
  const name = path.basename(relativePath);
  const extension = path.extname(name);
  const oid = hashToInt64(relativePath);
  return {
    oid,
    name,
    extension,
    relativePath,
  };
}
