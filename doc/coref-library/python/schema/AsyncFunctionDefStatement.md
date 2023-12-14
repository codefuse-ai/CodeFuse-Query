# AsyncFunctionDefStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_oid: int`

```rust
schema AsyncFunctionDefStatement extends Statement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## AsyncFunctionDefStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: AsyncFunctionDefStatement) -> NumberOfLines;
```
## AsyncFunctionDefStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: AsyncFunctionDefStatement) -> CombineElement;
```
## AsyncFunctionDefStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: AsyncFunctionDefStatement) -> Scope;
```
## AsyncFunctionDefStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: AsyncFunctionDefStatement) -> *Statement;
```
## AsyncFunctionDefStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: AsyncFunctionDefStatement) -> *CombineElement;
```
## AsyncFunctionDefStatement::getName

```java
/**
* @brief gets the name of the function.
* @return string 
*/
```
```rust
pub fn getName(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: AsyncFunctionDefStatement) -> Statement;
```
## AsyncFunctionDefStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AsyncFunctionDefStatement) -> Location;
```
## AsyncFunctionDefStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AsyncFunctionDefStatement;
```
