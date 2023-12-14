# ConditionalPolyadicExpression

Primary key: `element_hash_id: int`

```rust
schema ConditionalPolyadicExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## ConditionalPolyadicExpression::getSize

```rust
/**
     * @brief gets the size of the element.
     * @return int
     */
```
```rust
pub fn getSize(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the element.
     * @return string
     */
```
```rust
pub fn getOpcode(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getOperand

```rust
/**
     * @brief gets the operand of the element.
     * @return Expression
     */
```
```rust
pub fn getOperand(self: ConditionalPolyadicExpression) -> *Expression;
```
## ConditionalPolyadicExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ConditionalPolyadicExpression) -> Statement;
```
## ConditionalPolyadicExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ConditionalPolyadicExpression) -> Callable;
```
## ConditionalPolyadicExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConditionalPolyadicExpression;
```
## ConditionalPolyadicExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ConditionalPolyadicExpression) -> Location;
```
## ConditionalPolyadicExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ConditionalPolyadicExpression) -> ElementParent;
```
## ConditionalPolyadicExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getOperandAt

```rust
/**
     * @brief gets the operand of the element at a given index.
     * @return Expression
     */
```
```rust
pub fn getOperandAt(self: ConditionalPolyadicExpression, index: int) -> Expression;
```
## ConditionalPolyadicExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ConditionalPolyadicExpression) -> *ElementParent;
```
## ConditionalPolyadicExpression::is\<T\>

```rust
pub fn is<T>(self: ConditionalPolyadicExpression) -> bool;
```
## ConditionalPolyadicExpression::to\<T\>

```rust
pub fn to<T>(self: ConditionalPolyadicExpression) -> <any>;
```
## ConditionalPolyadicExpression::key\_neq

```rust
pub fn key_neq(self: ConditionalPolyadicExpression, object: <any>) -> bool;
```
## ConditionalPolyadicExpression::key\_eq

```rust
pub fn key_eq(self: ConditionalPolyadicExpression, object: <any>) -> bool;
```
## ConditionalPolyadicExpression::to\_set

```rust
pub fn to_set(self: ConditionalPolyadicExpression) -> *ConditionalPolyadicExpression;
```
