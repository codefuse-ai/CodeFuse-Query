# LiteralDO

Primary key: `oid: int`

```rust
schema LiteralDO {
  value: string,
  raw: string,
  expr: int,
  @primary oid: int,
}
```
## LiteralDO::getRaw

```java
/**
* @brief gets the raw of this element.
* @return string
*/
```
```rust
pub fn getRaw(self: LiteralDO) -> string;
```
## LiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: LiteralDO) -> string;
```
## LiteralDO::getExpr

```java
/**
* @brief gets the expr of this element.
* @return int
*/
```
```rust
pub fn getExpr(self: LiteralDO) -> int;
```
## LiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *LiteralDO;
```
