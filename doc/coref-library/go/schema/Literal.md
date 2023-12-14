# Literal

Primary key: `oid: int`

```rust
schema Literal {
  @primary oid: int,
  expr: int,
  raw: string,
  value: string,
}
```
## Literal::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: Literal) -> int;
```
## Literal::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: Literal) -> string;
```
## Literal::getRaw

```rust
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

```rust
pub fn __all__(db: GoDB) -> *Literal;
```
## Literal::is\<T\>

```rust
pub fn is<T>(self: Literal) -> bool;
```
## Literal::to\<T\>

```rust
pub fn to<T>(self: Literal) -> <any>;
```
## Literal::key\_neq

```rust
pub fn key_neq(self: Literal, object: <any>) -> bool;
```
## Literal::key\_eq

```rust
pub fn key_eq(self: Literal, object: <any>) -> bool;
```
## Literal::to\_set

```rust
pub fn to_set(self: Literal) -> *Literal;
```
