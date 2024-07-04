

import { PrismaClient, PrismaPromise } from '@prisma/client';

/**
 * 执行 transaction
 *
 * @param prismaClient
 * @param operations
 */
export async function transaction(
  prismaClient: PrismaClient,
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  operations: PrismaPromise<any>[],
) {
  await prismaClient.$transaction(operations);
}
