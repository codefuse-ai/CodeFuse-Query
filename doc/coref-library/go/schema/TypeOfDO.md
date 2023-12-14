# TypeOfDO

Primary key: `oid: int`

```rust
schema TypeOfDO {
  tp: int,
  expr: int,
  @primary oid: int,
}
```
## TypeOfDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: TypeOfDO) -> int;
```
## TypeOfDO::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: TypeOfDO) -> int;
```
## TypeOfDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeOfDO;
```
## TypeOfDO::is\<T\>

```rust
pub fn is<T>(self: TypeOfDO) -> bool;
```
## TypeOfDO::to\<T\>

```rust
pub fn to<T>(self: TypeOfDO) -> <any>;
```
## TypeOfDO::key\_neq

```rust
pub fn key_neq(self: TypeOfDO, object: <any>) -> bool;
```
## TypeOfDO::key\_eq

```rust
pub fn key_eq(self: TypeOfDO, object: <any>) -> bool;
```
## TypeOfDO::to\_set

```rust
pub fn to_set(self: TypeOfDO) -> *TypeOfDO;
```
