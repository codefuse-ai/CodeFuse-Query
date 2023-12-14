# InitFunction

Inherit from [Function](./Function.md)

Primary key: `element_oid: int`

```rust
schema InitFunction extends Function {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## InitFunction::getName

```java
/**
* @brief gets the name of the function.
* @return string 
*/
```
```rust
pub fn getName(self: InitFunction) -> string;
```
## InitFunction::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: InitFunction) -> Statement;
```
## InitFunction::getQualifiedName

```java
/**
* @brief gets the qualified name of the function.
* @return string 
*/
```
```rust
pub fn getQualifiedName(self: InitFunction) -> string;
```
## InitFunction::getArgumentByIndex

```java
/**
* @brief gets the arg by index of the function.
* @return Arg 
*/
```
```rust
pub fn getArgumentByIndex(self: InitFunction, i: int) -> Arg;
```
## InitFunction::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: InitFunction) -> string;
```
## InitFunction::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: InitFunction) -> *Statement;
```
## InitFunction::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: InitFunction) -> *CombineElement;
```
## InitFunction::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: InitFunction) -> int;
```
## InitFunction::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: InitFunction) -> string;
```
## InitFunction::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: InitFunction) -> Scope;
```
## InitFunction::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: InitFunction) -> int;
```
## InitFunction::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: InitFunction) -> CombineElement;
```
## InitFunction::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: InitFunction) -> int;
```
## InitFunction::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: InitFunction) -> NumberOfLines;
```
## InitFunction::getArguments

```java
/**
* @brief gets the arguments of the function.
* @return Arguments 
*/
```
```rust
pub fn getArguments(self: InitFunction) -> Arguments;
```
## InitFunction::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: InitFunction) -> Location;
```
## InitFunction::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *InitFunction;
```
