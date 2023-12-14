# ScopeEnclosignStatement

Primary key: `statement_oid: int`

```rust
schema ScopeEnclosignStatement {
  @primary statement_oid: int,
  scope_oid: int,
}
```
## ScopeEnclosignStatement::getEnclosingScope

```rust
/**
     * @brief gets the direct enclosed scope in the relation.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ScopeEnclosignStatement) -> Scope;
```
## ScopeEnclosignStatement::getScopeOid

```rust
/**
     * @brief gets the scope oid of this element.
     * @return int
     */
```
```rust
pub fn getScopeOid(self: ScopeEnclosignStatement) -> int;
```
## ScopeEnclosignStatement::getStatement

```rust
/**
     * @brief gets the enclosing statement in the relation.
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: ScopeEnclosignStatement) -> Statement;
```
## ScopeEnclosignStatement::getFunction

```rust
/**
     * @brief gets the enclosed function in the relation.
     * @return Function 
     */
```
```rust
pub fn getFunction(self: ScopeEnclosignStatement) -> Function;
```
## ScopeEnclosignStatement::getModule

```rust
/**
     * @brief gets the enclosed module in the relation.
     * @return module 
     */
```
```rust
pub fn getModule(self: ScopeEnclosignStatement) -> Module;
```
## ScopeEnclosignStatement::getClass

```rust
/**
     * @brief gets the enclosed class in the relation.
     * @return Class 
     */
```
```rust
pub fn getClass(self: ScopeEnclosignStatement) -> Class;
```
## ScopeEnclosignStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosignStatement;
```
## ScopeEnclosignStatement::is\<T\>

```rust
pub fn is<T>(self: ScopeEnclosignStatement) -> bool;
```
## ScopeEnclosignStatement::to\<T\>

```rust
pub fn to<T>(self: ScopeEnclosignStatement) -> <any>;
```
## ScopeEnclosignStatement::key\_neq

```rust
pub fn key_neq(self: ScopeEnclosignStatement, object: <any>) -> bool;
```
## ScopeEnclosignStatement::key\_eq

```rust
pub fn key_eq(self: ScopeEnclosignStatement, object: <any>) -> bool;
```
## ScopeEnclosignStatement::to\_set

```rust
pub fn to_set(self: ScopeEnclosignStatement) -> *ScopeEnclosignStatement;
```
