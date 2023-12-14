# ReferenceExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema ReferenceExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ReferenceExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ReferenceExpression) -> *ElementParent;
```
## ReferenceExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ReferenceExpression) -> string;
```
## ReferenceExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ReferenceExpression) -> Statement;
```
## ReferenceExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ReferenceExpression) -> NumberOfLines;
```
## ReferenceExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceExpression;
```
## ReferenceExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ReferenceExpression) -> Location;
```
## ReferenceExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ReferenceExpression) -> Callable;
```
## ReferenceExpression::getMethodAccessExpression

```java
/**
* @brief gets the MethodAccessExpression of the reference expression left.
* @return MethodAccessExpression 
*/
```
```rust
pub fn getMethodAccessExpression(self: ReferenceExpression) -> MethodAccessExpression;
```
## ReferenceExpression::getIdentifier

```java
/**
* @brief gets the Identifier of the reference expression Right.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: ReferenceExpression) -> Identifier;
```
## ReferenceExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ReferenceExpression) -> ElementParent;
```
## ReferenceExpression::getDefinition

```java
/**
* @brief gets the definition of the reference expression.
* @return ElementParent 
*/
```
```rust
pub fn getDefinition(self: ReferenceExpression) -> ElementParent;
```
## ReferenceExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ReferenceExpression) -> string;
```
