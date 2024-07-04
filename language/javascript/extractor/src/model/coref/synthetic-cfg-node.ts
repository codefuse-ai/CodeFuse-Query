

import { hashToInt64 } from '../../util';

export interface SyntheticCfgNode {
  oid: bigint;
  astNodeOid: bigint;
}

export const enum SyntheticCfgNodeKind {
  Entry,
  Exit,
}

/**
 * Create a synthetic CFG node, which is a entry or exit node.
 *
 * @param astNodeOid
 * @param kind
 * @returns
 */
function createSyntheticCfgNode(
  astNodeOid: bigint,
  kind: SyntheticCfgNodeKind,
): SyntheticCfgNode {
  const kindName = kind === SyntheticCfgNodeKind.Entry ? 'entry' : 'exit';
  const uri = `cfg:${kindName}:${astNodeOid}`;
  const oid = hashToInt64(uri);
  return {
    oid,
    astNodeOid,
  };
}

/**
 * Create a CFG entry node
 *
 * @param astNodeOid
 * @returns
 */
export function createCfgEntryNode(astNodeOid: bigint) {
  return createSyntheticCfgNode(astNodeOid, SyntheticCfgNodeKind.Entry);
}

/**
 * Create a CFG exit node
 *
 * @param astNodeOid
 * @returns
 */
export function createCfgExitNode(astNodeOid: bigint) {
  return createSyntheticCfgNode(astNodeOid, SyntheticCfgNodeKind.Exit);
}
