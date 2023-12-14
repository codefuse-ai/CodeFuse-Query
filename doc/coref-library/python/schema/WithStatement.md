# WithStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema WithStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## WithStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: WithStatement) -> NumberOfLines;
```
## WithStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: WithStatement) -> CombineElement;
```
## WithStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: WithStatement) -> int;
```
## WithStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: WithStatement) -> Scope;
```
## WithStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: WithStatement) -> string;
```
## WithStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: WithStatement) -> int;
```
## WithStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: WithStatement) -> *Statement;
```
## WithStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: WithStatement) -> *CombineElement;
```
## WithStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: WithStatement) -> Statement;
```
## WithStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: WithStatement) -> int;
```
## WithStatement::getWithItem

```java
/**
* @brief gets the with item of the with statement.
* @return WithItem 
*/
```
```rust
pub fn getWithItem(self: WithStatement) -> WithItem;
```
## WithStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: WithStatement) -> string;
```
## WithStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: WithStatement) -> Location;
```
## WithStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *WithStatement;
```
