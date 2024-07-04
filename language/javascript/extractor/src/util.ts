

import { createHash } from 'crypto';

const INT64_MIN = -9223372036854775808n;
const INT64_HEX_LENGTH = 16;

/**
 * 计算一段内容的哈希，得到64位整型的哈希值
 *
 * @param value 哈希的内容
 * @returns int64 的哈希值
 */
export function hashToInt64(value: string): bigint {
  const hash = createHash('sha1');
  hash.update(value);
  const hexHash = hash.digest('hex');

  // 截取前16位来计算 int64 的哈希
  const hexHashPrefix = hexHash.substring(0, INT64_HEX_LENGTH);
  const unsignedBigIntHash = BigInt(`0x${hexHashPrefix}`);

  // 转换为有符号的 int64
  const bigIntHash: bigint = INT64_MIN + unsignedBigIntHash;

  return bigIntHash;
}

/**
 * 限流执行 Promise 的 pool
 *
 * @param iterable
 * @param asyncFunction
 * @param poolSize
 */
export async function asyncPool<T>(
  iterable: Iterable<T>,
  asyncFunction: (value: T) => Promise<void>,
  poolSize: number,
) {
  const executingPromises: Promise<void>[] = [];
  for (const entry of iterable) {
    while (executingPromises.length >= poolSize) {
      await Promise.race(executingPromises);
    }
    const promise = asyncFunction(entry);
    executingPromises.push(promise);
    promise.then(() =>
      executingPromises.splice(executingPromises.indexOf(promise), 1),
    );
  }
  await Promise.all(executingPromises);
}
