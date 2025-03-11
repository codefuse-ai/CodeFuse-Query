/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

export interface ExtractOptions {
  src: string;
  db: string;
  blacklist?: string[];
  useGitignore?: boolean;
  extractText?: boolean;
  extractDist?: boolean;
  extractDeps?: boolean;
  dependency?: string[];
  fileSizeLimit?: number;
  paths?: string;
  packageManagerType?: string;
  debug?: boolean;
}
