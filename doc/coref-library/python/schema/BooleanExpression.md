# BooleanExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_oid: int`

```rust
schema BooleanExpression extends Expression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int
}
```
## BooleanExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: BooleanExpression) -> *CombineElement;
```
## BooleanExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: BooleanExpression) -> CombineElement;
```
## BooleanExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: BooleanExpression) -> int;
```
## BooleanExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: BooleanExpression) -> Location;
```
## BooleanExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: BooleanExpression) -> Scope;
```
## BooleanExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: BooleanExpression) -> string;
```
## BooleanExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: BooleanExpression) -> int;
```
## BooleanExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: BooleanExpression) -> int;
```
## BooleanExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return int
*/
```
```rust
pub fn getSize(self: BooleanExpression) -> int;
```
## BooleanExpression::getType

```java
/**
* @brief gets the type of the expression.
* @return string
*/
```
```rust
pub fn getType(self: BooleanExpression) -> string;
```
## BooleanExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *BooleanExpression;
```
