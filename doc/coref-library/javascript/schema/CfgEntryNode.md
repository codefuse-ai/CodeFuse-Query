# CfgEntryNode

Inherit from [CfgEntryNodeDO](./CfgEntryNodeDO.md)

Primary key: `oid: int`

```rust
schema CfgEntryNode extends CfgEntryNodeDO {
  @primary oid: int,
  ast_node_oid: int
}
```
## CfgEntryNode::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgEntryNode) -> int;
```
## CfgEntryNode::getAstNode

```rust
pub fn getAstNode(self: CfgEntryNode) -> Node;
```
## CfgEntryNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CfgEntryNode;
```
