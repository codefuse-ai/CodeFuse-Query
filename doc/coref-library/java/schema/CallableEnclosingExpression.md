# CallableEnclosingExpression

Primary key: `expression_hash_id: int`

```rust
schema CallableEnclosingExpression {
  @primary expression_hash_id: int,
  callable_hash_id: int,
}
```
## CallableEnclosingExpression::getCallableHashId

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: CallableEnclosingExpression) -> int;
```
## CallableEnclosingExpression::getCallable

```java
/**
* @brief gets the callable of the expression.
* @return Callable 
*/
```
```rust
pub fn getCallable(self: CallableEnclosingExpression) -> Callable;
```
## CallableEnclosingExpression::getExpression

```java
/**
* @brief gets the expression in the callable.
* @return Expression 
*/
```
```rust
pub fn getExpression(self: CallableEnclosingExpression) -> Expression;
```
## CallableEnclosingExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingExpression;
```
