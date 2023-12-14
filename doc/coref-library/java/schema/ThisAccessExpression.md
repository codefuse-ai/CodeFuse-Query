# ThisAccessExpression

Primary key: `element_hash_id: int`

```rust
schema ThisAccessExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ThisAccessExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ThisAccessExpression) -> *ElementParent;
```
## ThisAccessExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ThisAccessExpression) -> Statement;
```
## ThisAccessExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ThisAccessExpression) -> int;
```
## ThisAccessExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ThisAccessExpression) -> ElementParent;
```
## ThisAccessExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ThisAccessExpression) -> NumberOfLines;
```
## ThisAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ThisAccessExpression;
```
## ThisAccessExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ThisAccessExpression) -> int;
```
## ThisAccessExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ThisAccessExpression) -> Location;
```
## ThisAccessExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ThisAccessExpression) -> Callable;
```
## ThisAccessExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ThisAccessExpression) -> int;
```
## ThisAccessExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ThisAccessExpression) -> string;
```
## ThisAccessExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ThisAccessExpression) -> string;
```
## ThisAccessExpression::is\<T\>

```rust
pub fn is<T>(self: ThisAccessExpression) -> bool;
```
## ThisAccessExpression::to\<T\>

```rust
pub fn to<T>(self: ThisAccessExpression) -> <any>;
```
## ThisAccessExpression::key\_neq

```rust
pub fn key_neq(self: ThisAccessExpression, object: <any>) -> bool;
```
## ThisAccessExpression::key\_eq

```rust
pub fn key_eq(self: ThisAccessExpression, object: <any>) -> bool;
```
## ThisAccessExpression::to\_set

```rust
pub fn to_set(self: ThisAccessExpression) -> *ThisAccessExpression;
```
