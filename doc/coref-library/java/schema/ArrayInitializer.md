# ArrayInitializer

Primary key: `element_hash_id: int`

```rust
schema ArrayInitializer {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayInitializer::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ArrayInitializer) -> *ElementParent;
```
## ArrayInitializer::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ArrayInitializer) -> string;
```
## ArrayInitializer::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ArrayInitializer) -> Statement;
```
## ArrayInitializer::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ArrayInitializer) -> ElementParent;
```
## ArrayInitializer::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ArrayInitializer) -> NumberOfLines;
```
## ArrayInitializer::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayInitializer;
```
## ArrayInitializer::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ArrayInitializer) -> Location;
```
## ArrayInitializer::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ArrayInitializer) -> Callable;
```
## ArrayInitializer::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getInitializerExpression

```rust
/**
     * @brief gets the initializer expression.
     * @return ArrayInitializerExpression 
     */
```
```rust
pub fn getInitializerExpression(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ArrayInitializer) -> string;
```
## ArrayInitializer::is\<T\>

```rust
pub fn is<T>(self: ArrayInitializer) -> bool;
```
## ArrayInitializer::to\<T\>

```rust
pub fn to<T>(self: ArrayInitializer) -> <any>;
```
## ArrayInitializer::key\_neq

```rust
pub fn key_neq(self: ArrayInitializer, object: <any>) -> bool;
```
## ArrayInitializer::key\_eq

```rust
pub fn key_eq(self: ArrayInitializer, object: <any>) -> bool;
```
## ArrayInitializer::to\_set

```rust
pub fn to_set(self: ArrayInitializer) -> *ArrayInitializer;
```
