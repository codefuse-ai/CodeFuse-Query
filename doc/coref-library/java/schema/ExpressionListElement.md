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

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ExpressionListElement) -> string;
```
## ExpressionListElement::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ExpressionListElement) -> Statement;
```
## ExpressionListElement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ExpressionListElement) -> ElementParent;
```
## ExpressionListElement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ExpressionListElement) -> NumberOfLines;
```
## ExpressionListElement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListElement;
```
## ExpressionListElement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ExpressionListElement) -> Location;
```
## ExpressionListElement::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ExpressionListElement) -> Callable;
```
## ExpressionListElement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ExpressionListElement) -> int;
```
## ExpressionListElement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ExpressionListElement) -> string;
```
## ExpressionListElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ExpressionListElement) -> *ElementParent;
```
## ExpressionListElement::getExpressionList

```rust
/**
     * @brief gets the parent of the expression list element.
     * @return ExpressionList 
     */
```
```rust
pub fn getExpressionList(self: ExpressionListElement) -> ExpressionList;
```
## ExpressionListElement::is\<T\>

```rust
pub fn is<T>(self: ExpressionListElement) -> bool;
```
## ExpressionListElement::to\<T\>

```rust
pub fn to<T>(self: ExpressionListElement) -> <any>;
```
## ExpressionListElement::key\_neq

```rust
pub fn key_neq(self: ExpressionListElement, object: <any>) -> bool;
```
## ExpressionListElement::key\_eq

```rust
pub fn key_eq(self: ExpressionListElement, object: <any>) -> bool;
```
## ExpressionListElement::to\_set

```rust
pub fn to_set(self: ExpressionListElement) -> *ExpressionListElement;
```
