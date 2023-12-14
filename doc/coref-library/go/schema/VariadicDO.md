# VariadicDO

Primary key: `oid: int`

```rust
schema VariadicDO {
  associated_node: int,
  @primary oid: int,
}
```
## VariadicDO::getAssociatedNode

```rust
/**
     * @brief gets the associated node of this element.
     * @return int
     */
```
```rust
pub fn getAssociatedNode(self: VariadicDO) -> int;
```
## VariadicDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *VariadicDO;
```
## VariadicDO::is\<T\>

```rust
pub fn is<T>(self: VariadicDO) -> bool;
```
## VariadicDO::to\<T\>

```rust
pub fn to<T>(self: VariadicDO) -> <any>;
```
## VariadicDO::key\_neq

```rust
pub fn key_neq(self: VariadicDO, object: <any>) -> bool;
```
## VariadicDO::key\_eq

```rust
pub fn key_eq(self: VariadicDO, object: <any>) -> bool;
```
## VariadicDO::to\_set

```rust
pub fn to_set(self: VariadicDO) -> *VariadicDO;
```
