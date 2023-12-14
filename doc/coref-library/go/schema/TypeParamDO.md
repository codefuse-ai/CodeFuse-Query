# TypeParamDO

Primary key: `oid: int`

```rust
schema TypeParamDO {
  index: int,
  parent: int,
  tp: int,
  bound: int,
  name: string,
  @primary oid: int,
}
```
## TypeParamDO::getBound

```rust
/**
     * @brief gets the bound of this element.
     * @return int
     */
```
```rust
pub fn getBound(self: TypeParamDO) -> int;
```
## TypeParamDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: TypeParamDO) -> int;
```
## TypeParamDO::getIndex

```rust
/**
     * @brief gets the index of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeParamDO) -> int;
```
## TypeParamDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: TypeParamDO) -> int;
```
## TypeParamDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: TypeParamDO) -> string;
```
## TypeParamDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeParamDO;
```
## TypeParamDO::is\<T\>

```rust
pub fn is<T>(self: TypeParamDO) -> bool;
```
## TypeParamDO::to\<T\>

```rust
pub fn to<T>(self: TypeParamDO) -> <any>;
```
## TypeParamDO::key\_neq

```rust
pub fn key_neq(self: TypeParamDO, object: <any>) -> bool;
```
## TypeParamDO::key\_eq

```rust
pub fn key_eq(self: TypeParamDO, object: <any>) -> bool;
```
## TypeParamDO::to\_set

```rust
pub fn to_set(self: TypeParamDO) -> *TypeParamDO;
```
