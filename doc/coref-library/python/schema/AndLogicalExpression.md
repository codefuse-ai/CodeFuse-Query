# AndLogicalExpression

Inherit from [BooleanExpression](./BooleanExpression.md)

Primary key: `element_oid: int`

```rust
schema AndLogicalExpression extends BooleanExpression {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string
}
```
## AndLogicalExpression::getType

```java
/**
* @brief gets the type of the expression.
* @return string
*/
```
```rust
pub fn getType(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return int
*/
```
```rust
pub fn getSize(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: AndLogicalExpression) -> Scope;
```
## AndLogicalExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: AndLogicalExpression) -> CombineElement;
```
## AndLogicalExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AndLogicalExpression) -> Location;
```
## AndLogicalExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: AndLogicalExpression) -> *CombineElement;
```
## AndLogicalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AndLogicalExpression;
```
