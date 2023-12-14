# FunctionDefStatement

Primary key: `element_oid: int`

```rust
schema FunctionDefStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## FunctionDefStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: FunctionDefStatement) -> NumberOfLines;
```
## FunctionDefStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: FunctionDefStatement) -> CombineElement;
```
## FunctionDefStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: FunctionDefStatement) -> Scope;
```
## FunctionDefStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: FunctionDefStatement) -> *Statement;
```
## FunctionDefStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: FunctionDefStatement) -> *CombineElement;
```
## FunctionDefStatement::getName

```java
/**
* @brief gets the name of the function.
* @return string 
*/
```
```rust
pub fn getName(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: FunctionDefStatement) -> Statement;
```
## FunctionDefStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: FunctionDefStatement) -> Location;
```
## FunctionDefStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FunctionDefStatement;
```
