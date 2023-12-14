# UnaryExpression

Primary key: `element_hash_id: int`

```rust
schema UnaryExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## UnaryExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: UnaryExpression) -> *ElementParent;
```
## UnaryExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: UnaryExpression) -> string;
```
## UnaryExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: UnaryExpression) -> int;
```
## UnaryExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: UnaryExpression) -> ElementParent;
```
## UnaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *UnaryExpression;
```
## UnaryExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: UnaryExpression) -> int;
```
## UnaryExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: UnaryExpression) -> Location;
```
## UnaryExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: UnaryExpression) -> NumberOfLines;
```
## UnaryExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the unary expression
     * @return string 
     */
```
```rust
pub fn getOpcode(self: UnaryExpression) -> string;
```
## UnaryExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: UnaryExpression) -> Callable;
```
## UnaryExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: UnaryExpression) -> int;
```
## UnaryExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: UnaryExpression) -> Statement;
```
## UnaryExpression::getOperand

```rust
/**
     * @brief gets the operand expression of the unary expression.
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: UnaryExpression) -> Expression;
```
## UnaryExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: UnaryExpression) -> string;
```
## UnaryExpression::is\<T\>

```rust
pub fn is<T>(self: UnaryExpression) -> bool;
```
## UnaryExpression::to\<T\>

```rust
pub fn to<T>(self: UnaryExpression) -> <any>;
```
## UnaryExpression::key\_neq

```rust
pub fn key_neq(self: UnaryExpression, object: <any>) -> bool;
```
## UnaryExpression::key\_eq

```rust
pub fn key_eq(self: UnaryExpression, object: <any>) -> bool;
```
## UnaryExpression::to\_set

```rust
pub fn to_set(self: UnaryExpression) -> *UnaryExpression;
```
