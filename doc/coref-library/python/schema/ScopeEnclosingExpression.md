# ScopeEnclosingExpression

Inherit from [ScopeEnclosingExpressionDO](./ScopeEnclosingExpressionDO.md)

Primary key: `expression_oid: int`

```rust
schema ScopeEnclosingExpression extends ScopeEnclosingExpressionDO {
  @primary expression_oid: int,
  scope_oid: int,
}
```
## ScopeEnclosingExpression::getEnclosingScope

```java
/**
* @brief gets the direct enclosed scope in the relation.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ScopeEnclosingExpression) -> Scope;
```
## ScopeEnclosingExpression::getScopeOid

```java
/**
* @brief gets the scope oid of this element.
* @return int
*/
```
```rust
pub fn getScopeOid(self: ScopeEnclosingExpression) -> int;
```
## ScopeEnclosingExpression::getFunction

```java
/**
* @brief gets the enclosed function in the relation.
* @return Function 
*/
```
```rust
pub fn getFunction(self: ScopeEnclosingExpression) -> Function;
```
## ScopeEnclosingExpression::getModule

```java
/**
* @brief gets the enclosed module in the relation.
* @return module 
*/
```
```rust
pub fn getModule(self: ScopeEnclosingExpression) -> Module;
```
## ScopeEnclosingExpression::getClass

```java
/**
* @brief gets the enclosed class in the relation.
* @return Class 
*/
```
```rust
pub fn getClass(self: ScopeEnclosingExpression) -> Class;
```
## ScopeEnclosingExpression::getExpression

```java
/**
* @brief gets the enclosing expression in the relation.
* @return Expression 
*/
```
```rust
pub fn getExpression(self: ScopeEnclosingExpression) -> Expression;
```
## ScopeEnclosingExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingExpression;
```
