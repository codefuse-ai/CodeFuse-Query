# OrLogicalExpression

Primary key: `element_hash_id: int`

```rust
schema OrLogicalExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## OrLogicalExpression::getOperand

```rust
/**
     * @brief gets an operand of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: OrLogicalExpression) -> *Expression;
```
## OrLogicalExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: OrLogicalExpression) -> Statement;
```
## OrLogicalExpression::getRightOperandExpression

```rust
/**
     * @brief gets the operand on the right-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getRightOperandExpression(self: OrLogicalExpression) -> Expression;
```
## OrLogicalExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getLeftOperandExpression

```rust
/**
     * @brief gets the operand on the left-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getLeftOperandExpression(self: OrLogicalExpression) -> Expression;
```
## OrLogicalExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: OrLogicalExpression) -> NumberOfLines;
```
## OrLogicalExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the binary expression
     * @return string 
     */
```
```rust
pub fn getOpcode(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: OrLogicalExpression) -> Callable;
```
## OrLogicalExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *OrLogicalExpression;
```
## OrLogicalExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: OrLogicalExpression) -> Location;
```
## OrLogicalExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: OrLogicalExpression) -> ElementParent;
```
## OrLogicalExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: OrLogicalExpression) -> *ElementParent;
```
## OrLogicalExpression::is\<T\>

```rust
pub fn is<T>(self: OrLogicalExpression) -> bool;
```
## OrLogicalExpression::to\<T\>

```rust
pub fn to<T>(self: OrLogicalExpression) -> <any>;
```
## OrLogicalExpression::key\_neq

```rust
pub fn key_neq(self: OrLogicalExpression, object: <any>) -> bool;
```
## OrLogicalExpression::key\_eq

```rust
pub fn key_eq(self: OrLogicalExpression, object: <any>) -> bool;
```
## OrLogicalExpression::to\_set

```rust
pub fn to_set(self: OrLogicalExpression) -> *OrLogicalExpression;
```
