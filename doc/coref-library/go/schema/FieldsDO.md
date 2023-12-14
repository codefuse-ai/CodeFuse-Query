# FieldsDO

Primary key: `oid: int`

```rust
schema FieldsDO {
  kind: int,
  parent_id: int,
  idx: int,
  @primary oid: int,
}
```
## FieldsDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: FieldsDO) -> int;
```
## FieldsDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: FieldsDO) -> int;
```
## FieldsDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: FieldsDO) -> int;
```
## FieldsDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *FieldsDO;
```
## FieldsDO::is\<T\>

```rust
pub fn is<T>(self: FieldsDO) -> bool;
```
## FieldsDO::to\<T\>

```rust
pub fn to<T>(self: FieldsDO) -> <any>;
```
## FieldsDO::key\_neq

```rust
pub fn key_neq(self: FieldsDO, object: <any>) -> bool;
```
## FieldsDO::key\_eq

```rust
pub fn key_eq(self: FieldsDO, object: <any>) -> bool;
```
## FieldsDO::to\_set

```rust
pub fn to_set(self: FieldsDO) -> *FieldsDO;
```
