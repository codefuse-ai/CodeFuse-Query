# LogNotExpression

Primary key: `element_hash_id: int`

```rust
schema LogNotExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## LogNotExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: LogNotExpression) -> string;
```
## LogNotExpression::getOperand

```rust
/**
     * @brief gets the operand expression of the unary expression.
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: LogNotExpression) -> Expression;
```
## LogNotExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: LogNotExpression) -> Statement;
```
## LogNotExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: LogNotExpression) -> Callable;
```
## LogNotExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LogNotExpression) -> int;
```
## LogNotExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the unary expression
     * @return string 
     */
```
```rust
pub fn getOpcode(self: LogNotExpression) -> string;
```
## LogNotExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: LogNotExpression) -> NumberOfLines;
```
## LogNotExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LogNotExpression;
```
## LogNotExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: LogNotExpression) -> Location;
```
## LogNotExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LogNotExpression) -> int;
```
## LogNotExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LogNotExpression) -> int;
```
## LogNotExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: LogNotExpression) -> ElementParent;
```
## LogNotExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LogNotExpression) -> string;
```
## LogNotExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LogNotExpression) -> *ElementParent;
```
## LogNotExpression::is\<T\>

```rust
pub fn is<T>(self: LogNotExpression) -> bool;
```
## LogNotExpression::to\<T\>

```rust
pub fn to<T>(self: LogNotExpression) -> <any>;
```
## LogNotExpression::key\_neq

```rust
pub fn key_neq(self: LogNotExpression, object: <any>) -> bool;
```
## LogNotExpression::key\_eq

```rust
pub fn key_eq(self: LogNotExpression, object: <any>) -> bool;
```
## LogNotExpression::to\_set

```rust
pub fn to_set(self: LogNotExpression) -> *LogNotExpression;
```
