# CallExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_oid: int`

```rust
schema CallExpression extends Expression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int
}
```
## CallExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *CombineElement;
```
## CallExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: CallExpression) -> NumberOfLines;
```
## CallExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: CallExpression) -> CombineElement;
```
## CallExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: CallExpression) -> int;
```
## CallExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: CallExpression) -> Scope;
```
## CallExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: CallExpression) -> string;
```
## CallExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: CallExpression) -> int;
```
## CallExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CallExpression;
```
## CallExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::getArgs

```java
/**
* @brief gets the arguments in the call.
* @return CombineElement
*/
```
```rust
pub fn getArgs(self: CallExpression) -> *CombineElement;
```
## CallExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: CallExpression) -> int;
```
## CallExpression::getFunctionExpression

```java
/**
* @brief gets the function expression in the call.
* @return Expression
*/
```
```rust
pub fn getFunctionExpression(self: CallExpression) -> Expression;
```
## CallExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: CallExpression) -> string;
```
