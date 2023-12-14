# ScopeEnclosignStatement

Inherit from [ScopeEnclosingStatementDO](./ScopeEnclosingStatementDO.md)

Primary key: `statement_oid: int`

```rust
schema ScopeEnclosignStatement extends ScopeEnclosingStatementDO {
  @primary statement_oid: int,
  scope_oid: int,
}
```
## ScopeEnclosignStatement::getEnclosingScope

```java
/**
* @brief gets the direct enclosed scope in the relation.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ScopeEnclosignStatement) -> Scope;
```
## ScopeEnclosignStatement::getScopeOid

```java
/**
* @brief gets the scope oid of this element.
* @return int
*/
```
```rust
pub fn getScopeOid(self: ScopeEnclosignStatement) -> int;
```
## ScopeEnclosignStatement::getStatement

```java
/**
* @brief gets the enclosing statement in the relation.
* @return Statement 
*/
```
```rust
pub fn getStatement(self: ScopeEnclosignStatement) -> Statement;
```
## ScopeEnclosignStatement::getFunction

```java
/**
* @brief gets the enclosed function in the relation.
* @return Function 
*/
```
```rust
pub fn getFunction(self: ScopeEnclosignStatement) -> Function;
```
## ScopeEnclosignStatement::getModule

```java
/**
* @brief gets the enclosed module in the relation.
* @return module 
*/
```
```rust
pub fn getModule(self: ScopeEnclosignStatement) -> Module;
```
## ScopeEnclosignStatement::getClass

```java
/**
* @brief gets the enclosed class in the relation.
* @return Class 
*/
```
```rust
pub fn getClass(self: ScopeEnclosignStatement) -> Class;
```
## ScopeEnclosignStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosignStatement;
```
