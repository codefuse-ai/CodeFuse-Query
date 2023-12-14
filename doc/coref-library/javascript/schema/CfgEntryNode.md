# CfgEntryNode

Primary key: `oid: int`

```rust
schema CfgEntryNode {
  @primary oid: int,
  ast_node_oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *CfgEntryNode;
```
## CfgEntryNode::is\<T\>

```rust
pub fn is<T>(self: CfgEntryNode) -> bool;
```
## CfgEntryNode::to\<T\>

```rust
pub fn to<T>(self: CfgEntryNode) -> <any>;
```
## CfgEntryNode::key\_neq

```rust
pub fn key_neq(self: CfgEntryNode, object: <any>) -> bool;
```
## CfgEntryNode::key\_eq

```rust
pub fn key_eq(self: CfgEntryNode, object: <any>) -> bool;
```
## CfgEntryNode::to\_set

```rust
pub fn to_set(self: CfgEntryNode) -> *CfgEntryNode;
```
