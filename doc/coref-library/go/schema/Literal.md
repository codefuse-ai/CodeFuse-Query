# Literal

Inherit from [LiteralDO](./LiteralDO.md)

Primary key: `oid: int`

```rust
schema Literal extends LiteralDO {
  @primary oid: int,
  expr: int,
  raw: string,
  value: string,
}
```
## Literal::getExpr

```java
/**
* @brief gets the expr of this element.
* @return int
*/
```
```rust
pub fn getExpr(self: Literal) -> int;
```
## Literal::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: Literal) -> string;
```
## Literal::getRaw

```java
/**
* @brief gets the raw of this element.
* @return string
*/
```
```rust
pub fn getRaw(self: Literal) -> string;
```
## Literal::getExpression

```rust
pub fn getExpression(self: Literal) -> Expr;
```
## Literal::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Literal;
```
