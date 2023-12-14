# IfExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_oid: int`

```rust
schema IfExpression extends Expression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## IfExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: IfExpression) -> *CombineElement;
```
## IfExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: IfExpression) -> NumberOfLines;
```
## IfExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: IfExpression) -> int;
```
## IfExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: IfExpression) -> CombineElement;
```
## IfExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: IfExpression) -> int;
```
## IfExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: IfExpression) -> Location;
```
## IfExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: IfExpression) -> Scope;
```
## IfExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: IfExpression) -> string;
```
## IfExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: IfExpression) -> int;
```
## IfExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: IfExpression) -> string;
```
## IfExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *IfExpression;
```
