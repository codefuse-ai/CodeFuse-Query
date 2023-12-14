# AssignmentExpression

Primary key: `element_hash_id: int`

```rust
schema AssignmentExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## AssignmentExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AssignmentExpression) -> *ElementParent;
```
## AssignmentExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AssignmentExpression) -> ElementParent;
```
## AssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AssignmentExpression;
```
## AssignmentExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AssignmentExpression) -> Location;
```
## AssignmentExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: AssignmentExpression) -> Callable;
```
## AssignmentExpression::getOpcode

```rust
/**
     * @brief gets the opcode of the binary expression
     * @return string 
     */
```
```rust
pub fn getOpcode(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AssignmentExpression) -> NumberOfLines;
```
## AssignmentExpression::getDestination

```rust
/**
     * @brief gets the operand on the left-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getDestination(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: AssignmentExpression) -> Statement;
```
## AssignmentExpression::getSource

```rust
/**
     * @brief gets the operand on the right-hand side of the binary expression.
     * @return Expression 
     */
```
```rust
pub fn getSource(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: AssignmentExpression) -> string;
```
## AssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: AssignmentExpression) -> bool;
```
## AssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: AssignmentExpression) -> <any>;
```
## AssignmentExpression::key\_neq

```rust
pub fn key_neq(self: AssignmentExpression, object: <any>) -> bool;
```
## AssignmentExpression::key\_eq

```rust
pub fn key_eq(self: AssignmentExpression, object: <any>) -> bool;
```
## AssignmentExpression::to\_set

```rust
pub fn to_set(self: AssignmentExpression) -> *AssignmentExpression;
```
