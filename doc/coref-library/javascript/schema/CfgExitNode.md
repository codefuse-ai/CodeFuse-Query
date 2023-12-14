# CfgExitNode

Primary key: `oid: int`

```rust
schema CfgExitNode {
  @primary oid: int,
  ast_node_oid: int,
}
```
## CfgExitNode::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgExitNode) -> int;
```
## CfgExitNode::getAstNode

```rust
pub fn getAstNode(self: CfgExitNode) -> Node;
```
## CfgExitNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CfgExitNode;
```
