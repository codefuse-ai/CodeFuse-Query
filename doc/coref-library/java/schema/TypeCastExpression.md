# TypeCastExpression

Primary key: `element_hash_id: int`

```rust
schema TypeCastExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## TypeCastExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: TypeCastExpression) -> *ElementParent;
```
## TypeCastExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeCastExpression) -> string;
```
## TypeCastExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeCastExpression) -> int;
```
## TypeCastExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: TypeCastExpression) -> ElementParent;
```
## TypeCastExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: TypeCastExpression) -> NumberOfLines;
```
## TypeCastExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeCastExpression;
```
## TypeCastExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeCastExpression) -> int;
```
## TypeCastExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: TypeCastExpression) -> Location;
```
## TypeCastExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: TypeCastExpression) -> Callable;
```
## TypeCastExpression::getCastType

```rust
/**
     * @description gets the type element of the expression.
     * @return TypeElement 
     */
```
```rust
pub fn getCastType(self: TypeCastExpression) -> TypeElement;
```
## TypeCastExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeCastExpression) -> int;
```
## TypeCastExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: TypeCastExpression) -> Statement;
```
## TypeCastExpression::getOperand

```rust
/**
     * @description get the operand of the expression.
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: TypeCastExpression) -> Expression;
```
## TypeCastExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: TypeCastExpression) -> string;
```
## TypeCastExpression::is\<T\>

```rust
pub fn is<T>(self: TypeCastExpression) -> bool;
```
## TypeCastExpression::to\<T\>

```rust
pub fn to<T>(self: TypeCastExpression) -> <any>;
```
## TypeCastExpression::key\_neq

```rust
pub fn key_neq(self: TypeCastExpression, object: <any>) -> bool;
```
## TypeCastExpression::key\_eq

```rust
pub fn key_eq(self: TypeCastExpression, object: <any>) -> bool;
```
## TypeCastExpression::to\_set

```rust
pub fn to_set(self: TypeCastExpression) -> *TypeCastExpression;
```
