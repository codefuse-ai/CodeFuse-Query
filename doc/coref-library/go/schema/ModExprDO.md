# ModExprDO

Primary key: `oid: int`

```rust
schema ModExprDO {
  kind: int,
  idx: int,
  parent: int,
  @primary oid: int,
}
```
## ModExprDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: ModExprDO) -> int;
```
## ModExprDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: ModExprDO) -> int;
```
## ModExprDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: ModExprDO) -> int;
```
## ModExprDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ModExprDO;
```
## ModExprDO::is\<T\>

```rust
pub fn is<T>(self: ModExprDO) -> bool;
```
## ModExprDO::to\<T\>

```rust
pub fn to<T>(self: ModExprDO) -> <any>;
```
## ModExprDO::key\_neq

```rust
pub fn key_neq(self: ModExprDO, object: <any>) -> bool;
```
## ModExprDO::key\_eq

```rust
pub fn key_eq(self: ModExprDO, object: <any>) -> bool;
```
## ModExprDO::to\_set

```rust
pub fn to_set(self: ModExprDO) -> *ModExprDO;
```
