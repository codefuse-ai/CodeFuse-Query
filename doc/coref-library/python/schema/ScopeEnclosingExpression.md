# ScopeEnclosingExpression

Primary key: `expression_oid: int`

```rust
schema ScopeEnclosingExpression {
  @primary expression_oid: int,
  scope_oid: int,
}
```
## ScopeEnclosingExpression::getEnclosingScope

```rust
/**
     * @brief gets the direct enclosed scope in the relation.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ScopeEnclosingExpression) -> Scope;
```
## ScopeEnclosingExpression::getScopeOid

```rust
/**
     * @brief gets the scope oid of this element.
     * @return int
     */
```
```rust
pub fn getScopeOid(self: ScopeEnclosingExpression) -> int;
```
## ScopeEnclosingExpression::getFunction

```rust
/**
     * @brief gets the enclosed function in the relation.
     * @return Function 
     */
```
```rust
pub fn getFunction(self: ScopeEnclosingExpression) -> Function;
```
## ScopeEnclosingExpression::getModule

```rust
/**
     * @brief gets the enclosed module in the relation.
     * @return module 
     */
```
```rust
pub fn getModule(self: ScopeEnclosingExpression) -> Module;
```
## ScopeEnclosingExpression::getClass

```rust
/**
     * @brief gets the enclosed class in the relation.
     * @return Class 
     */
```
```rust
pub fn getClass(self: ScopeEnclosingExpression) -> Class;
```
## ScopeEnclosingExpression::getExpression

```rust
/**
     * @brief gets the enclosing expression in the relation.
     * @return Expression 
     */
```
```rust
pub fn getExpression(self: ScopeEnclosingExpression) -> Expression;
```
## ScopeEnclosingExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingExpression;
```
## ScopeEnclosingExpression::is\<T\>

```rust
pub fn is<T>(self: ScopeEnclosingExpression) -> bool;
```
## ScopeEnclosingExpression::to\<T\>

```rust
pub fn to<T>(self: ScopeEnclosingExpression) -> <any>;
```
## ScopeEnclosingExpression::key\_neq

```rust
pub fn key_neq(self: ScopeEnclosingExpression, object: <any>) -> bool;
```
## ScopeEnclosingExpression::key\_eq

```rust
pub fn key_eq(self: ScopeEnclosingExpression, object: <any>) -> bool;
```
## ScopeEnclosingExpression::to\_set

```rust
pub fn to_set(self: ScopeEnclosingExpression) -> *ScopeEnclosingExpression;
```
