# VariadicDO

Primary key: `oid: int`

```rust
schema VariadicDO {
  associated_node: int,
  @primary oid: int
}
```
## VariadicDO::getAssociatedNode

```java
/**
* @brief gets the associated node of this element.
* @return int
*/
```
```rust
pub fn getAssociatedNode(self: VariadicDO) -> int;
```
## VariadicDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *VariadicDO;
```
