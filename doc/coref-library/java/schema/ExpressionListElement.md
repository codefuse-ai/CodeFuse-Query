# ExpressionListElement

Primary key: `element_hash_id: int`

```rust
schema ExpressionListElement {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ExpressionListElement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ExpressionListElement) -> string;
```
## ExpressionListElement::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ExpressionListElement) -> Statement;
```
## ExpressionListElement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ExpressionListElement) -> ElementParent;
```
## ExpressionListElement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ExpressionListElement) -> NumberOfLines;
```
## ExpressionListElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListElement;
```
## ExpressionListElement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ExpressionListElement) -> Location;
```
## ExpressionListElement::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ExpressionListElement) -> Callable;
```
## ExpressionListElement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ExpressionListElement) -> string;
```
## ExpressionListElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ExpressionListElement) -> *ElementParent;
```
## ExpressionListElement::getExpressionList

```java
/**
* @brief gets the parent of the expression list element.
* @return ExpressionList 
*/
```
```rust
pub fn getExpressionList(self: ExpressionListElement) -> ExpressionList;
```
