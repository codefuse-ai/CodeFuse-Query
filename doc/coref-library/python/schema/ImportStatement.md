# ImportStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema ImportStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ImportStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ImportStatement) -> NumberOfLines;
```
## ImportStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: ImportStatement) -> CombineElement;
```
## ImportStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ImportStatement) -> int;
```
## ImportStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ImportStatement) -> Scope;
```
## ImportStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ImportStatement) -> string;
```
## ImportStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ImportStatement) -> int;
```
## ImportStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ImportStatement) -> *Statement;
```
## ImportStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: ImportStatement) -> *CombineElement;
```
## ImportStatement::getName

```java
/**
* @brief gets the name element of the element.
* @return CombineElement 
*/
```
```rust
pub fn getName(self: ImportStatement) -> CombineElement;
```
## ImportStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ImportStatement) -> Statement;
```
## ImportStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ImportStatement) -> int;
```
## ImportStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ImportStatement) -> string;
```
## ImportStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ImportStatement) -> Location;
```
## ImportStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ImportStatement;
```
