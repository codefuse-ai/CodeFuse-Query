# TypeParamDeclsDO

Primary key: `oid: int`

```rust
schema TypeParamDeclsDO {
  index: int,
  parent: int,
  @primary oid: int,
}
```
## TypeParamDeclsDO::getIndex

```rust
/**
     * @brief gets the index of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeParamDeclsDO) -> int;
```
## TypeParamDeclsDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: TypeParamDeclsDO) -> int;
```
## TypeParamDeclsDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeParamDeclsDO;
```
## TypeParamDeclsDO::is\<T\>

```rust
pub fn is<T>(self: TypeParamDeclsDO) -> bool;
```
## TypeParamDeclsDO::to\<T\>

```rust
pub fn to<T>(self: TypeParamDeclsDO) -> <any>;
```
## TypeParamDeclsDO::key\_neq

```rust
pub fn key_neq(self: TypeParamDeclsDO, object: <any>) -> bool;
```
## TypeParamDeclsDO::key\_eq

```rust
pub fn key_eq(self: TypeParamDeclsDO, object: <any>) -> bool;
```
## TypeParamDeclsDO::to\_set

```rust
pub fn to_set(self: TypeParamDeclsDO) -> *TypeParamDeclsDO;
```
