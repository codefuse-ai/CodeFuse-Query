# ReferenceExpression

Primary key: `element_hash_id: int`

```rust
schema ReferenceExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ReferenceExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ReferenceExpression) -> *ElementParent;
```
## ReferenceExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceExpression) -> string;
```
## ReferenceExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ReferenceExpression) -> Statement;
```
## ReferenceExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ReferenceExpression) -> NumberOfLines;
```
## ReferenceExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceExpression;
```
## ReferenceExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ReferenceExpression) -> Location;
```
## ReferenceExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ReferenceExpression) -> Callable;
```
## ReferenceExpression::getMethodAccessExpression

```rust
/**
     * @brief gets the MethodAccessExpression of the reference expression left.
     * @return MethodAccessExpression 
     */
```
```rust
pub fn getMethodAccessExpression(self: ReferenceExpression) -> MethodAccessExpression;
```
## ReferenceExpression::getIdentifier

```rust
/**
     * @brief gets the Identifier of the reference expression Right.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: ReferenceExpression) -> Identifier;
```
## ReferenceExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceExpression) -> int;
```
## ReferenceExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ReferenceExpression) -> ElementParent;
```
## ReferenceExpression::getDefinition

```rust
/**
     * @brief gets the definition of the reference expression.
     * @return ElementParent 
     */
```
```rust
pub fn getDefinition(self: ReferenceExpression) -> ElementParent;
```
## ReferenceExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ReferenceExpression) -> string;
```
## ReferenceExpression::is\<T\>

```rust
pub fn is<T>(self: ReferenceExpression) -> bool;
```
## ReferenceExpression::to\<T\>

```rust
pub fn to<T>(self: ReferenceExpression) -> <any>;
```
## ReferenceExpression::key\_neq

```rust
pub fn key_neq(self: ReferenceExpression, object: <any>) -> bool;
```
## ReferenceExpression::key\_eq

```rust
pub fn key_eq(self: ReferenceExpression, object: <any>) -> bool;
```
## ReferenceExpression::to\_set

```rust
pub fn to_set(self: ReferenceExpression) -> *ReferenceExpression;
```
