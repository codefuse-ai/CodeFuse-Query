# ArrayAccessExpression

Primary key: `element_hash_id: int`

```rust
schema ArrayAccessExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayAccessExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ArrayAccessExpression) -> string;
```
## ArrayAccessExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ArrayAccessExpression) -> Statement;
```
## ArrayAccessExpression::getArrayExpression

```rust
/**
     * @brief gets the array that is accessed in the array access
     * @return Expression 
     */
```
```rust
pub fn getArrayExpression(self: ArrayAccessExpression) -> Expression;
```
## ArrayAccessExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ArrayAccessExpression) -> ElementParent;
```
## ArrayAccessExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ArrayAccessExpression) -> NumberOfLines;
```
## ArrayAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayAccessExpression;
```
## ArrayAccessExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ArrayAccessExpression) -> Location;
```
## ArrayAccessExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ArrayAccessExpression) -> Callable;
```
## ArrayAccessExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ArrayAccessExpression) -> *ElementParent;
```
## ArrayAccessExpression::getIndexExpression

```rust
/**
     * @brief gets the index expression of the array access expression.
     * @return Expression 
     */
```
```rust
pub fn getIndexExpression(self: ArrayAccessExpression) -> Expression;
```
## ArrayAccessExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ArrayAccessExpression) -> string;
```
## ArrayAccessExpression::is\<T\>

```rust
pub fn is<T>(self: ArrayAccessExpression) -> bool;
```
## ArrayAccessExpression::to\<T\>

```rust
pub fn to<T>(self: ArrayAccessExpression) -> <any>;
```
## ArrayAccessExpression::key\_neq

```rust
pub fn key_neq(self: ArrayAccessExpression, object: <any>) -> bool;
```
## ArrayAccessExpression::key\_eq

```rust
pub fn key_eq(self: ArrayAccessExpression, object: <any>) -> bool;
```
## ArrayAccessExpression::to\_set

```rust
pub fn to_set(self: ArrayAccessExpression) -> *ArrayAccessExpression;
```
