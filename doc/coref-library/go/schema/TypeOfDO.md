# TypeOfDO

Primary key: `oid: int`

```rust
schema TypeOfDO {
  tp: int,
  expr: int,
  @primary oid: int
}
```
## TypeOfDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: TypeOfDO) -> int;
```
## TypeOfDO::getExpr

```java
/**
* @brief gets the expr of this element.
* @return int
*/
```
```rust
pub fn getExpr(self: TypeOfDO) -> int;
```
## TypeOfDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeOfDO;
```
