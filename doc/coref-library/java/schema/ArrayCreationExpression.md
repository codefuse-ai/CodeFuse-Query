# ArrayCreationExpression

Primary key: `element_hash_id: int`

```rust
schema ArrayCreationExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayCreationExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ArrayCreationExpression) -> string;
```
## ArrayCreationExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ArrayCreationExpression) -> Statement;
```
## ArrayCreationExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ArrayCreationExpression) -> ElementParent;
```
## ArrayCreationExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ArrayCreationExpression) -> NumberOfLines;
```
## ArrayCreationExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayCreationExpression;
```
## ArrayCreationExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ArrayCreationExpression) -> Location;
```
## ArrayCreationExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: ArrayCreationExpression) -> Type;
```
## ArrayCreationExpression::getInitializerExpression

```rust
/**
     * @brief gets the initializer expression of the array creation expression.
     * @return ArrayInitializerExpression
     */
```
```rust
pub fn getInitializerExpression(self: ArrayCreationExpression) -> ArrayInitializerExpression;
```
## ArrayCreationExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ArrayCreationExpression) -> Callable;
```
## ArrayCreationExpression::getAnInitializer

```rust
/**
     * @brief gets the initializer of the array creation expression.
     * @return ArrayInitializer
     */
```
```rust
pub fn getAnInitializer(self: ArrayCreationExpression) -> *ArrayInitializer;
```
## ArrayCreationExpression::getDimension

```rust
/**
     * @brief gets the dimension of the array creation expression.
     * @return Expression 
     */
```
```rust
pub fn getDimension(self: ArrayCreationExpression, idx: int) -> Expression;
```
## ArrayCreationExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ArrayCreationExpression) -> *ElementParent;
```
## ArrayCreationExpression::countArrayDimension

```rust
/**
     * @brief counts the number of the array dimension of the array creation expression, 0 means it is an empty array.
     * @return int 
     */
```
```rust
pub fn countArrayDimension(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getADimension

```rust
/**
     * @brief gets a dimension of the array creation expression.
     * @return Expression 
     */
```
```rust
pub fn getADimension(self: ArrayCreationExpression) -> *Expression;
```
## ArrayCreationExpression::is\<T\>

```rust
pub fn is<T>(self: ArrayCreationExpression) -> bool;
```
## ArrayCreationExpression::to\<T\>

```rust
pub fn to<T>(self: ArrayCreationExpression) -> <any>;
```
## ArrayCreationExpression::key\_neq

```rust
pub fn key_neq(self: ArrayCreationExpression, object: <any>) -> bool;
```
## ArrayCreationExpression::key\_eq

```rust
pub fn key_eq(self: ArrayCreationExpression, object: <any>) -> bool;
```
## ArrayCreationExpression::to\_set

```rust
pub fn to_set(self: ArrayCreationExpression) -> *ArrayCreationExpression;
```
