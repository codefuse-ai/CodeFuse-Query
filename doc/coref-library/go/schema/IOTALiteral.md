# IOTALiteral

Primary key: `oid: int`

```rust
schema IOTALiteral {
  value: string,
  raw: string,
  expr: int,
  @primary oid: int,
}
```
## IOTALiteral::getRaw

```rust
/**
     * @brief gets the raw of this element.
     * @return string
     */
```
```rust
pub fn getRaw(self: IOTALiteral) -> string;
```
## IOTALiteral::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: IOTALiteral) -> string;
```
## IOTALiteral::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: IOTALiteral) -> int;
```
## IOTALiteral::getExpression

```rust
pub fn getExpression(self: IOTALiteral) -> Expr;
```
## IOTALiteral::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *IOTALiteral;
```
## IOTALiteral::is\<T\>

```rust
pub fn is<T>(self: IOTALiteral) -> bool;
```
## IOTALiteral::to\<T\>

```rust
pub fn to<T>(self: IOTALiteral) -> <any>;
```
## IOTALiteral::key\_neq

```rust
pub fn key_neq(self: IOTALiteral, object: <any>) -> bool;
```
## IOTALiteral::key\_eq

```rust
pub fn key_eq(self: IOTALiteral, object: <any>) -> bool;
```
## IOTALiteral::to\_set

```rust
pub fn to_set(self: IOTALiteral) -> *IOTALiteral;
```
