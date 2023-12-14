# ListCompExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_oid: int`

```rust
schema ListCompExpression extends Expression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ListCompExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: ListCompExpression) -> *CombineElement;
```
## ListCompExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ListCompExpression) -> NumberOfLines;
```
## ListCompExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ListCompExpression) -> int;
```
## ListCompExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: ListCompExpression) -> CombineElement;
```
## ListCompExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ListCompExpression) -> int;
```
## ListCompExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ListCompExpression) -> Location;
```
## ListCompExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: ListCompExpression) -> Scope;
```
## ListCompExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ListCompExpression) -> string;
```
## ListCompExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ListCompExpression) -> int;
```
## ListCompExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ListCompExpression) -> string;
```
## ListCompExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ListCompExpression;
```
