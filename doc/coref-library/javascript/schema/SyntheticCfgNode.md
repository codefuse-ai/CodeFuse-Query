# SyntheticCfgNode

Primary key: `id: int`

```rust
schema SyntheticCfgNode {
  @primary id: int,
}
```
## SyntheticCfgNode::getAstNode

```rust
pub fn getAstNode(self: SyntheticCfgNode) -> Node;
```
## SyntheticCfgNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SyntheticCfgNode;
```
## SyntheticCfgNode::is\<T\>

```rust
pub fn is<T>(self: SyntheticCfgNode) -> bool;
```
## SyntheticCfgNode::to\<T\>

```rust
pub fn to<T>(self: SyntheticCfgNode) -> <any>;
```
## SyntheticCfgNode::key\_neq

```rust
pub fn key_neq(self: SyntheticCfgNode, object: <any>) -> bool;
```
## SyntheticCfgNode::key\_eq

```rust
pub fn key_eq(self: SyntheticCfgNode, object: <any>) -> bool;
```
## SyntheticCfgNode::to\_set

```rust
pub fn to_set(self: SyntheticCfgNode) -> *SyntheticCfgNode;
```
