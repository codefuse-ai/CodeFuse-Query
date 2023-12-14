# ReturnStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema ReturnStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ReturnStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ReturnStatement) -> NumberOfLines;
```
## ReturnStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: ReturnStatement) -> CombineElement;
```
## ReturnStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ReturnStatement) -> int;
```
## ReturnStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ReturnStatement) -> Scope;
```
## ReturnStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ReturnStatement) -> string;
```
## ReturnStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ReturnStatement) -> int;
```
## ReturnStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: ReturnStatement) -> *CombineElement;
```
## ReturnStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ReturnStatement) -> *Statement;
```
## ReturnStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ReturnStatement) -> Statement;
```
## ReturnStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ReturnStatement) -> int;
```
## ReturnStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ReturnStatement) -> string;
```
## ReturnStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ReturnStatement) -> Location;
```
## ReturnStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ReturnStatement;
```
