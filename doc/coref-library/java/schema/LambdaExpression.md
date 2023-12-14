# LambdaExpression

Primary key: `element_hash_id: int`

```rust
schema LambdaExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## LambdaExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LambdaExpression) -> *ElementParent;
```
## LambdaExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LambdaExpression) -> string;
```
## LambdaExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LambdaExpression) -> int;
```
## LambdaExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: LambdaExpression) -> ElementParent;
```
## LambdaExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LambdaExpression;
```
## LambdaExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: LambdaExpression) -> Location;
```
## LambdaExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LambdaExpression) -> int;
```
## LambdaExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: LambdaExpression) -> Callable;
```
## LambdaExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LambdaExpression) -> int;
```
## LambdaExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: LambdaExpression) -> NumberOfLines;
```
## LambdaExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: LambdaExpression) -> string;
```
## LambdaExpression::getBody

```rust
/**
     * @brief gets the element representing lambda expression body, a code block or an expression.
     * @return ElementParent 
     */
```
```rust
pub fn getBody(self: LambdaExpression) -> ElementParent;
```
## LambdaExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: LambdaExpression) -> Statement;
```
## LambdaExpression::getParameter

```rust
/**
     * @brief gets the parameter of the lambda expression.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: LambdaExpression) -> *Parameter;
```
## LambdaExpression::is\<T\>

```rust
pub fn is<T>(self: LambdaExpression) -> bool;
```
## LambdaExpression::to\<T\>

```rust
pub fn to<T>(self: LambdaExpression) -> <any>;
```
## LambdaExpression::key\_neq

```rust
pub fn key_neq(self: LambdaExpression, object: <any>) -> bool;
```
## LambdaExpression::key\_eq

```rust
pub fn key_eq(self: LambdaExpression, object: <any>) -> bool;
```
## LambdaExpression::to\_set

```rust
pub fn to_set(self: LambdaExpression) -> *LambdaExpression;
```
