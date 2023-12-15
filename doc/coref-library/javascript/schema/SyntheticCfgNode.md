# SyntheticCfgNode

Primary key: `id: int`

```rust
schema SyntheticCfgNode {
  @primary id: int
}
```
## SyntheticCfgNode::getAstNode

```rust
pub fn getAstNode(self: SyntheticCfgNode) -> Node;
```
## SyntheticCfgNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SyntheticCfgNode;
```
