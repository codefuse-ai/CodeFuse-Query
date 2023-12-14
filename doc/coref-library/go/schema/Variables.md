# Variables

Primary key: `oid: int`

```rust
schema Variables {
  value: string,
  raw: string,
  expr: int,
  @primary oid: int,
}
```
## Variables::getExpression

```rust
pub fn getExpression(self: Variables) -> Expr;
```
## Variables::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: Variables) -> string;
```
## Variables::getRaw

```rust
/**
     * @brief gets the raw of this element.
     * @return string
     */
```
```rust
pub fn getRaw(self: Variables) -> string;
```
## Variables::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Variables;
```
## Variables::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: Variables) -> int;
```
## Variables::getSignature

```rust
pub fn getSignature(self: Variables) -> *string;
```
## Variables::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Variables) -> Function;
```
## Variables::getName

```rust
pub fn getName(self: Variables) -> string;
```
## Variables::is\<T\>

```rust
pub fn is<T>(self: Variables) -> bool;
```
## Variables::to\<T\>

```rust
pub fn to<T>(self: Variables) -> <any>;
```
## Variables::key\_neq

```rust
pub fn key_neq(self: Variables, object: <any>) -> bool;
```
## Variables::key\_eq

```rust
pub fn key_eq(self: Variables, object: <any>) -> bool;
```
## Variables::to\_set

```rust
pub fn to_set(self: Variables) -> *Variables;
```
