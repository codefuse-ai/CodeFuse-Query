# PolyadicExpression

Primary key: `element_hash_id: int`

```rust
schema PolyadicExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## PolyadicExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: PolyadicExpression) -> *ElementParent;
```
## PolyadicExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: PolyadicExpression) -> ElementParent;
```
## PolyadicExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *PolyadicExpression;
```
## PolyadicExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: PolyadicExpression) -> Location;
```
## PolyadicExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: PolyadicExpression) -> Callable;
```
## PolyadicExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getOperandAt

```rust
/**
     * @brief gets the operand of the element at a given index.
     * @return Expression
     */
```
```rust
pub fn getOperandAt(self: PolyadicExpression, index: int) -> Expression;
```
## PolyadicExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: PolyadicExpression) -> Statement;
```
## PolyadicExpression::getOperand

```rust
/**
     * @brief gets the operand of the element.
     * @return Expression
     */
```
```rust
pub fn getOperand(self: PolyadicExpression) -> *Expression;
```
## PolyadicExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the element.
     * @return string
     */
```
```rust
pub fn getOpcode(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getSize

```rust
/**
     * @brief gets the size of the element.
     * @return int
     */
```
```rust
pub fn getSize(self: PolyadicExpression) -> int;
```
## PolyadicExpression::is\<T\>

```rust
pub fn is<T>(self: PolyadicExpression) -> bool;
```
## PolyadicExpression::to\<T\>

```rust
pub fn to<T>(self: PolyadicExpression) -> <any>;
```
## PolyadicExpression::key\_neq

```rust
pub fn key_neq(self: PolyadicExpression, object: <any>) -> bool;
```
## PolyadicExpression::key\_eq

```rust
pub fn key_eq(self: PolyadicExpression, object: <any>) -> bool;
```
## PolyadicExpression::to\_set

```rust
pub fn to_set(self: PolyadicExpression) -> *PolyadicExpression;
```
