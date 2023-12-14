# Expression

Primary key: `element_hash_id: int`

```rust
schema Expression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## Expression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Expression) -> string;
```
## Expression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: Expression) -> Callable;
```
## Expression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: Expression) -> int;
```
## Expression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Expression;
```
## Expression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Expression) -> Location;
```
## Expression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Expression) -> int;
```
## Expression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Expression) -> NumberOfLines;
```
## Expression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Expression) -> ElementParent;
```
## Expression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Expression) -> int;
```
## Expression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Expression) -> Statement;
```
## Expression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: Expression) -> string;
```
## Expression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Expression) -> *ElementParent;
```
## Expression::is\<T\>

```rust
pub fn is<T>(self: Expression) -> bool;
```
## Expression::to\<T\>

```rust
pub fn to<T>(self: Expression) -> <any>;
```
## Expression::key\_neq

```rust
pub fn key_neq(self: Expression, object: <any>) -> bool;
```
## Expression::key\_eq

```rust
pub fn key_eq(self: Expression, object: <any>) -> bool;
```
## Expression::to\_set

```rust
pub fn to_set(self: Expression) -> *Expression;
```
