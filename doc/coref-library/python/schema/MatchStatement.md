# MatchStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema MatchStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## MatchStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MatchStatement) -> NumberOfLines;
```
## MatchStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: MatchStatement) -> CombineElement;
```
## MatchStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: MatchStatement) -> int;
```
## MatchStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: MatchStatement) -> Scope;
```
## MatchStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: MatchStatement) -> string;
```
## MatchStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: MatchStatement) -> int;
```
## MatchStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: MatchStatement) -> *Statement;
```
## MatchStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: MatchStatement) -> *CombineElement;
```
## MatchStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MatchStatement) -> Statement;
```
## MatchStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: MatchStatement) -> int;
```
## MatchStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MatchStatement) -> Location;
```
## MatchStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MatchStatement;
```
## MatchStatement::getMatchCase

```java
/**
* @brief gets a case pattern in the statement.
* @return MatchCase 
*/
```
```rust
pub fn getMatchCase(self: MatchStatement) -> MatchCase;
```
## MatchStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: MatchStatement) -> string;
```
