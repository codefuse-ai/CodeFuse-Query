# TryStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema TryStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## TryStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: TryStatement) -> NumberOfLines;
```
## TryStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: TryStatement) -> CombineElement;
```
## TryStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: TryStatement) -> int;
```
## TryStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: TryStatement) -> Scope;
```
## TryStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: TryStatement) -> string;
```
## TryStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: TryStatement) -> int;
```
## TryStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *CombineElement;
```
## TryStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: TryStatement) -> *Statement;
```
## TryStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: TryStatement) -> Statement;
```
## TryStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: TryStatement) -> int;
```
## TryStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: TryStatement) -> string;
```
## TryStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *TryStatement;
```
