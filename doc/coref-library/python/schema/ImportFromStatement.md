# ImportFromStatement

Primary key: `element_oid: int`

```rust
schema ImportFromStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ImportFromStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ImportFromStatement) -> NumberOfLines;
```
## ImportFromStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: ImportFromStatement) -> CombineElement;
```
## ImportFromStatement::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ImportFromStatement) -> int;
```
## ImportFromStatement::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ImportFromStatement) -> Scope;
```
## ImportFromStatement::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ImportFromStatement) -> string;
```
## ImportFromStatement::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ImportFromStatement) -> int;
```
## ImportFromStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ImportFromStatement) -> *Statement;
```
## ImportFromStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: ImportFromStatement) -> *CombineElement;
```
## ImportFromStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ImportFromStatement) -> Statement;
```
## ImportFromStatement::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ImportFromStatement) -> int;
```
## ImportFromStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ImportFromStatement) -> string;
```
## ImportFromStatement::getModuleName

```java
/**
* @brief gets the module name of the import.
* @return string 
*/
```
```rust
pub fn getModuleName(self: ImportFromStatement) -> string;
```
## ImportFromStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ImportFromStatement) -> Location;
```
## ImportFromStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ImportFromStatement;
```
