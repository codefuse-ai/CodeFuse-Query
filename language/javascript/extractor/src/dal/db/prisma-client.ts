

import { PrismaClient } from '@prisma/client';

/**
 * 根据指定的 db 文件路径，创建 sqlite 的 prisma client
 *
 * @param dbPath db 文件路径
 * @returns prisma client
 */
export function createPrismaClient(dbPath?: string) {
  return new PrismaClient({
    datasources: {
      db: {
        url: `file:${dbPath}`,
      },
    },
  });
}
