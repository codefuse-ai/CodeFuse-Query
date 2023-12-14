# CallableEnclosingExpression

Primary key: `expression_hash_id: int`

```rust
schema CallableEnclosingExpression {
  @primary expression_hash_id: int,
  callable_hash_id: int,
}
```
## CallableEnclosingExpression::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: CallableEnclosingExpression) -> int;
```
## CallableEnclosingExpression::getCallable

```rust
/**
     * @brief gets the callable of the expression.
     * @return Callable 
     */
```
```rust
pub fn getCallable(self: CallableEnclosingExpression) -> Callable;
```
## CallableEnclosingExpression::getExpression

```rust
/**
     * @brief gets the expression in the callable.
     * @return Expression 
     */
```
```rust
pub fn getExpression(self: CallableEnclosingExpression) -> Expression;
```
## CallableEnclosingExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingExpression;
```
## CallableEnclosingExpression::is\<T\>

```rust
pub fn is<T>(self: CallableEnclosingExpression) -> bool;
```
## CallableEnclosingExpression::to\<T\>

```rust
pub fn to<T>(self: CallableEnclosingExpression) -> <any>;
```
## CallableEnclosingExpression::key\_neq

```rust
pub fn key_neq(self: CallableEnclosingExpression, object: <any>) -> bool;
```
## CallableEnclosingExpression::key\_eq

```rust
pub fn key_eq(self: CallableEnclosingExpression, object: <any>) -> bool;
```
## CallableEnclosingExpression::to\_set

```rust
pub fn to_set(self: CallableEnclosingExpression) -> *CallableEnclosingExpression;
```
