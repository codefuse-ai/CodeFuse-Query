# Function

Primary key: `element_oid: int`

```rust
schema Function {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## Function::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Function) -> NumberOfLines;
```
## Function::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Function) -> CombineElement;
```
## Function::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Function) -> int;
```
## Function::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: Function) -> Scope;
```
## Function::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Function) -> string;
```
## Function::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Function) -> int;
```
## Function::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Function) -> *CombineElement;
```
## Function::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: Function) -> *Statement;
```
## Function::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Function) -> int;
```
## Function::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Function) -> string;
```
## Function::getArgumentByIndex

```java
/**
* @brief gets the arg by index of the function.
* @return Arg 
*/
```
```rust
pub fn getArgumentByIndex(self: Function, i: int) -> Arg;
```
## Function::getQualifiedName

```java
/**
* @brief gets the qualified name of the function.
* @return string 
*/
```
```rust
pub fn getQualifiedName(self: Function) -> string;
```
## Function::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Function) -> Location;
```
## Function::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Function;
```
## Function::getArguments

```java
/**
* @brief gets the arguments of the function.
* @return Arguments 
*/
```
```rust
pub fn getArguments(self: Function) -> Arguments;
```
## Function::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: Function) -> Statement;
```
## Function::getName

```java
/**
* @brief gets the name of the function.
* @return string 
*/
```
```rust
pub fn getName(self: Function) -> string;
```
