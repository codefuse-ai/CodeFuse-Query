# MetricFunction

Inherit from [Function](./Function.md)

Primary key: `element_oid: int`

```rust
schema MetricFunction extends Function {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string
}
```
## MetricFunction::getName

```java
/**
* @brief gets the name of the function.
* @return string 
*/
```
```rust
pub fn getName(self: MetricFunction) -> string;
```
## MetricFunction::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MetricFunction) -> Statement;
```
## MetricFunction::getArgumentByIndex

```java
/**
* @brief gets the arg by index of the function.
* @return Arg 
*/
```
```rust
pub fn getArgumentByIndex(self: MetricFunction, i: int) -> Arg;
```
## MetricFunction::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: MetricFunction) -> string;
```
## MetricFunction::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: MetricFunction) -> *Statement;
```
## MetricFunction::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: MetricFunction) -> *CombineElement;
```
## MetricFunction::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: MetricFunction) -> int;
```
## MetricFunction::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: MetricFunction) -> string;
```
## MetricFunction::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: MetricFunction) -> Scope;
```
## MetricFunction::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: MetricFunction) -> int;
```
## MetricFunction::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: MetricFunction) -> CombineElement;
```
## MetricFunction::getQualifiedName

```java
/**
* @brief gets the qualified name of the function.
* @return string 
*/
```
```rust
pub fn getQualifiedName(self: MetricFunction) -> string;
```
## MetricFunction::getCyclomaticComplexity

```java
/**
* @brief The cyclomatic complexity of a callable is defined as the number
* of branching statements (`if`, `while`, `do`, `for`, `matchcase`, `except`)
* plus the number of branching expressions (`?`, `&&` and `||`)
* plus one.
* @return int 
*/
```
```rust
pub fn getCyclomaticComplexity(self: MetricFunction) -> int;
```
## MetricFunction::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: MetricFunction) -> int;
```
## MetricFunction::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MetricFunction) -> NumberOfLines;
```
## MetricFunction::getArguments

```java
/**
* @brief gets the arguments of the function.
* @return Arguments 
*/
```
```rust
pub fn getArguments(self: MetricFunction) -> Arguments;
```
## MetricFunction::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MetricFunction) -> Location;
```
## MetricFunction::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MetricFunction;
```
