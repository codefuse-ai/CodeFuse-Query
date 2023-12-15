# OrLogicalExpression

Inherit from [BooleanExpression](./BooleanExpression.md)

Primary key: `element_oid: int`

```rust
schema OrLogicalExpression extends BooleanExpression {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string
}
```
## OrLogicalExpression::getType

```java
/**
* @brief gets the type of the expression.
* @return string
*/
```
```rust
pub fn getType(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return int
*/
```
```rust
pub fn getSize(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: OrLogicalExpression) -> Scope;
```
## OrLogicalExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: OrLogicalExpression) -> CombineElement;
```
## OrLogicalExpression::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: OrLogicalExpression) -> Location;
```
## OrLogicalExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: OrLogicalExpression) -> *CombineElement;
```
## OrLogicalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *OrLogicalExpression;
```
