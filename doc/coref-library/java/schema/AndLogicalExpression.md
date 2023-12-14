# AndLogicalExpression

Primary key: `element_hash_id: int`

```rust
schema AndLogicalExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## AndLogicalExpression::getOperand

```rust
/**
     * @brief gets an operand of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: AndLogicalExpression) -> *Expression;
```
## AndLogicalExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: AndLogicalExpression) -> Statement;
```
## AndLogicalExpression::getRightOperandExpression

```rust
/**
     * @brief gets the operand on the right-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getRightOperandExpression(self: AndLogicalExpression) -> Expression;
```
## AndLogicalExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getLeftOperandExpression

```rust
/**
     * @brief gets the operand on the left-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getLeftOperandExpression(self: AndLogicalExpression) -> Expression;
```
## AndLogicalExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AndLogicalExpression) -> NumberOfLines;
```
## AndLogicalExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the binary expression
     * @return string 
     */
```
```rust
pub fn getOpcode(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: AndLogicalExpression) -> Callable;
```
## AndLogicalExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AndLogicalExpression;
```
## AndLogicalExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AndLogicalExpression) -> Location;
```
## AndLogicalExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AndLogicalExpression) -> ElementParent;
```
## AndLogicalExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AndLogicalExpression) -> *ElementParent;
```
## AndLogicalExpression::is\<T\>

```rust
pub fn is<T>(self: AndLogicalExpression) -> bool;
```
## AndLogicalExpression::to\<T\>

```rust
pub fn to<T>(self: AndLogicalExpression) -> <any>;
```
## AndLogicalExpression::key\_neq

```rust
pub fn key_neq(self: AndLogicalExpression, object: <any>) -> bool;
```
## AndLogicalExpression::key\_eq

```rust
pub fn key_eq(self: AndLogicalExpression, object: <any>) -> bool;
```
## AndLogicalExpression::to\_set

```rust
pub fn to_set(self: AndLogicalExpression) -> *AndLogicalExpression;
```
