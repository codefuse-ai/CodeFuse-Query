# FieldStructDO

Primary key: `oid: int`

```rust
schema FieldStructDO {
  struct: int,
  @primary oid: int,
}
```
## FieldStructDO::getStruct

```rust
/**
     * @brief gets the struct of this element.
     * @return int
     */
```
```rust
pub fn getStruct(self: FieldStructDO) -> int;
```
## FieldStructDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *FieldStructDO;
```
## FieldStructDO::is\<T\>

```rust
pub fn is<T>(self: FieldStructDO) -> bool;
```
## FieldStructDO::to\<T\>

```rust
pub fn to<T>(self: FieldStructDO) -> <any>;
```
## FieldStructDO::key\_neq

```rust
pub fn key_neq(self: FieldStructDO, object: <any>) -> bool;
```
## FieldStructDO::key\_eq

```rust
pub fn key_eq(self: FieldStructDO, object: <any>) -> bool;
```
## FieldStructDO::to\_set

```rust
pub fn to_set(self: FieldStructDO) -> *FieldStructDO;
```
