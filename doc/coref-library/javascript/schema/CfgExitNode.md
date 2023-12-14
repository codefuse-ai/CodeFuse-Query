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

```rust
pub fn __all__(db: JavascriptDB) -> *CfgExitNode;
```
## CfgExitNode::is\<T\>

```rust
pub fn is<T>(self: CfgExitNode) -> bool;
```
## CfgExitNode::to\<T\>

```rust
pub fn to<T>(self: CfgExitNode) -> <any>;
```
## CfgExitNode::key\_neq

```rust
pub fn key_neq(self: CfgExitNode, object: <any>) -> bool;
```
## CfgExitNode::key\_eq

```rust
pub fn key_eq(self: CfgExitNode, object: <any>) -> bool;
```
## CfgExitNode::to\_set

```rust
pub fn to_set(self: CfgExitNode) -> *CfgExitNode;
```
