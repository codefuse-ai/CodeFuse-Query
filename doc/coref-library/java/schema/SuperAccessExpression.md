# SuperAccessExpression

Primary key: `element_hash_id: int`

```rust
schema SuperAccessExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## SuperAccessExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SuperAccessExpression) -> *ElementParent;
```
## SuperAccessExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SuperAccessExpression) -> string;
```
## SuperAccessExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SuperAccessExpression) -> Statement;
```
## SuperAccessExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: SuperAccessExpression) -> ElementParent;
```
## SuperAccessExpression::getMethod

```rust
pub fn getMethod(self: SuperAccessExpression) -> Method;
```
## SuperAccessExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SuperAccessExpression) -> NumberOfLines;
```
## SuperAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperAccessExpression;
```
## SuperAccessExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: SuperAccessExpression) -> Location;
```
## SuperAccessExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SuperAccessExpression) -> Callable;
```
## SuperAccessExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SuperAccessExpression) -> string;
```
## SuperAccessExpression::is\<T\>

```rust
pub fn is<T>(self: SuperAccessExpression) -> bool;
```
## SuperAccessExpression::to\<T\>

```rust
pub fn to<T>(self: SuperAccessExpression) -> <any>;
```
## SuperAccessExpression::key\_neq

```rust
pub fn key_neq(self: SuperAccessExpression, object: <any>) -> bool;
```
## SuperAccessExpression::key\_eq

```rust
pub fn key_eq(self: SuperAccessExpression, object: <any>) -> bool;
```
## SuperAccessExpression::to\_set

```rust
pub fn to_set(self: SuperAccessExpression) -> *SuperAccessExpression;
```
