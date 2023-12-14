# ArrayInitializerExpression

Primary key: `element_hash_id: int`

```rust
schema ArrayInitializerExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayInitializerExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ArrayInitializerExpression) -> *ElementParent;
```
## ArrayInitializerExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ArrayInitializerExpression) -> string;
```
## ArrayInitializerExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ArrayInitializerExpression) -> Statement;
```
## ArrayInitializerExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ArrayInitializerExpression) -> int;
```
## ArrayInitializerExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ArrayInitializerExpression) -> ElementParent;
```
## ArrayInitializerExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ArrayInitializerExpression) -> NumberOfLines;
```
## ArrayInitializerExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayInitializerExpression;
```
## ArrayInitializerExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ArrayInitializerExpression) -> int;
```
## ArrayInitializerExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ArrayInitializerExpression) -> Location;
```
## ArrayInitializerExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ArrayInitializerExpression) -> Callable;
```
## ArrayInitializerExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ArrayInitializerExpression) -> int;
```
## ArrayInitializerExpression::getInitializer

```rust
/**
     * @brief gets the ith initializer of the expression.
     * @return ArrayInitializer 
     */
```
```rust
pub fn getInitializer(self: ArrayInitializerExpression, idx: int) -> ArrayInitializer;
```
## ArrayInitializerExpression::getAnInitializer

```rust
/**
     * @brief gets the initializer of the expression, if any.
     * @return ArrayInitializer 
     */
```
```rust
pub fn getAnInitializer(self: ArrayInitializerExpression) -> *ArrayInitializer;
```
## ArrayInitializerExpression::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: ArrayInitializerExpression) -> Type;
```
## ArrayInitializerExpression::is\<T\>

```rust
pub fn is<T>(self: ArrayInitializerExpression) -> bool;
```
## ArrayInitializerExpression::to\<T\>

```rust
pub fn to<T>(self: ArrayInitializerExpression) -> <any>;
```
## ArrayInitializerExpression::key\_neq

```rust
pub fn key_neq(self: ArrayInitializerExpression, object: <any>) -> bool;
```
## ArrayInitializerExpression::key\_eq

```rust
pub fn key_eq(self: ArrayInitializerExpression, object: <any>) -> bool;
```
## ArrayInitializerExpression::to\_set

```rust
pub fn to_set(self: ArrayInitializerExpression) -> *ArrayInitializerExpression;
```
