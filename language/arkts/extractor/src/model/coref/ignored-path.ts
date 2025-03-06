/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { hashToInt64 } from "../../util";

/**
 * 路径类型枚举
 */
export enum PathKind {
  DIRECTORY,
  FILE,
}

export enum IgnoreKind {
  DOT_GITIGNORE,
  DIST_DIR,
  DIST_FILE,
  FILE_SIZE_LIMIT,
  BLACK_LIST,
}

/**
 * 忽略的路径
 */
export interface IgnoredPath {
  id: bigint;
  pathKind: PathKind;
  path: string;
  ignoreKind: IgnoreKind;
}

/**
 * 创建忽略的路径
 *
 * @param pathKind 路径类型
 * @param path 路径
 * @param message 备注信息
 * @returns  忽略的路径对象
 */
export function createIgnoredPath(
  pathKind: PathKind,
  path: string,
  ignoreKind: IgnoreKind,
): IgnoredPath {
  const uri = `IgnoredPath:${path}`;
  const id = hashToInt64(uri);

  return {
    id,
    pathKind,
    path,
    ignoreKind,
  };
}
