# InstanceofExpression

Primary key: `element_hash_id: int`

```rust
schema InstanceofExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## InstanceofExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: InstanceofExpression) -> string;
```
## InstanceofExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: InstanceofExpression) -> ElementParent;
```
## InstanceofExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: InstanceofExpression) -> NumberOfLines;
```
## InstanceofExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *InstanceofExpression;
```
## InstanceofExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: InstanceofExpression) -> Location;
```
## InstanceofExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: InstanceofExpression) -> *ElementParent;
```
## InstanceofExpression::getInstanceType

```rust
/**
     * @brief gets the instance type of the instanceof expression
     * @return TypeElement
     */
```
```rust
pub fn getInstanceType(self: InstanceofExpression) -> TypeElement;
```
## InstanceofExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: InstanceofExpression) -> Callable;
```
## InstanceofExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: InstanceofExpression) -> Statement;
```
## InstanceofExpression::getOperand

```rust
/**
     * @brief gets the operand expression of the instanceof expression
     * @return Expression 
     */
```
```rust
pub fn getOperand(self: InstanceofExpression) -> Expression;
```
## InstanceofExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: InstanceofExpression) -> string;
```
## InstanceofExpression::is\<T\>

```rust
pub fn is<T>(self: InstanceofExpression) -> bool;
```
## InstanceofExpression::to\<T\>

```rust
pub fn to<T>(self: InstanceofExpression) -> <any>;
```
## InstanceofExpression::key\_neq

```rust
pub fn key_neq(self: InstanceofExpression, object: <any>) -> bool;
```
## InstanceofExpression::key\_eq

```rust
pub fn key_eq(self: InstanceofExpression, object: <any>) -> bool;
```
## InstanceofExpression::to\_set

```rust
pub fn to_set(self: InstanceofExpression) -> *InstanceofExpression;
```
