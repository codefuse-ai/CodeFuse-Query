# SuperExpression

Primary key: `element_hash_id: int`

```rust
schema SuperExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## SuperExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SuperExpression) -> *ElementParent;
```
## SuperExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SuperExpression) -> Statement;
```
## SuperExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SuperExpression) -> int;
```
## SuperExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: SuperExpression) -> ElementParent;
```
## SuperExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SuperExpression) -> NumberOfLines;
```
## SuperExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperExpression;
```
## SuperExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SuperExpression) -> int;
```
## SuperExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: SuperExpression) -> Location;
```
## SuperExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SuperExpression) -> Callable;
```
## SuperExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SuperExpression) -> int;
```
## SuperExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SuperExpression) -> string;
```
## SuperExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SuperExpression) -> string;
```
## SuperExpression::is\<T\>

```rust
pub fn is<T>(self: SuperExpression) -> bool;
```
## SuperExpression::to\<T\>

```rust
pub fn to<T>(self: SuperExpression) -> <any>;
```
## SuperExpression::key\_neq

```rust
pub fn key_neq(self: SuperExpression, object: <any>) -> bool;
```
## SuperExpression::key\_eq

```rust
pub fn key_eq(self: SuperExpression, object: <any>) -> bool;
```
## SuperExpression::to\_set

```rust
pub fn to_set(self: SuperExpression) -> *SuperExpression;
```
