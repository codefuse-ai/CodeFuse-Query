# ConstValueDO

Primary key: `oid: int`

```rust
schema ConstValueDO {
  exact: string,
  value: string,
  expr: int,
  @primary oid: int,
}
```
## ConstValueDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: ConstValueDO) -> string;
```
## ConstValueDO::getExact

```java
/**
* @brief gets the exact of this element.
* @return string
*/
```
```rust
pub fn getExact(self: ConstValueDO) -> string;
```
## ConstValueDO::getExpr

```java
/**
* @brief gets the expr of this element.
* @return int
*/
```
```rust
pub fn getExpr(self: ConstValueDO) -> int;
```
## ConstValueDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ConstValueDO;
```
