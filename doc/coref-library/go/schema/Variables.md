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

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: Variables) -> string;
```
## Variables::getRaw

```java
/**
* @brief gets the raw of this element.
* @return string
*/
```
```rust
pub fn getRaw(self: Variables) -> string;
```
## Variables::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Variables;
```
## Variables::getExpr

```java
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
