

import { PrismaClient, Prisma } from '@prisma/client';

const ATTACHED_DB_NAME = 'attached_db';
let tableNames: string[] | undefined;

/**
 * Merge a tmp db file
 *
 * @param prismaClient
 * @param mergedDbPath
 */
export async function mergeDb(
  prismaClient: PrismaClient,
  mergedDbPath: string,
) {
  if (tableNames === undefined) {
    const tableNameDenySet = new Set(['ignored_path', 'metadata']);
    tableNames = Object.keys(Prisma.ModelName).filter(
      tableName => !tableNameDenySet.has(tableName),
    );
  }

  const insertSqls = tableNames.map(
    tableName =>
      `insert into ${tableName} select * from ${ATTACHED_DB_NAME}.${tableName};`,
  );

  await prismaClient.$executeRawUnsafe(
    `attach '${mergedDbPath}' as ${ATTACHED_DB_NAME};`,
  );
  await prismaClient.$transaction([
    ...insertSqls.map(insertSql => prismaClient.$executeRawUnsafe(insertSql)),
  ]);
  await prismaClient.$executeRawUnsafe(`detach ${ATTACHED_DB_NAME};`);
}
