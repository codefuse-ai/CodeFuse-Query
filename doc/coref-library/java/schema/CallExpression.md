# CallExpression

Primary key: `element_hash_id: int`

```rust
schema CallExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## CallExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *ElementParent;
```
## CallExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CallExpression) -> string;
```
## CallExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: CallExpression) -> Statement;
```
## CallExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: CallExpression) -> int;
```
## CallExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: CallExpression) -> Callable;
```
## CallExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: CallExpression) -> string;
```
## CallExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CallExpression) -> int;
```
## CallExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallExpression;
```
## CallExpression::getArguments

```rust
pub fn getArguments(self: CallExpression) -> *Expression;
```
## CallExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: CallExpression) -> int;
```
## CallExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: CallExpression) -> ElementParent;
```
## CallExpression::getLombokField

```rust
pub fn getLombokField(self: CallExpression) -> LombokField;
```
## CallExpression::getCallSite

```rust
pub fn getCallSite(self: CallExpression) -> ReferenceExpression;
```
## CallExpression::getMethodName

```rust
pub fn getMethodName(self: CallExpression) -> string;
```
## CallExpression::getReference

```rust
pub fn getReference(self: CallExpression) -> ReferenceExpression;
```
## CallExpression::getCallSiteDefinition

```rust
pub fn getCallSiteDefinition(self: CallExpression) -> ClassOrInterface;
```
## CallExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: CallExpression) -> NumberOfLines;
```
## CallExpression::getMethod

```rust
pub fn getMethod(self: CallExpression) -> Method;
```
## CallExpression::is\<T\>

```rust
pub fn is<T>(self: CallExpression) -> bool;
```
## CallExpression::to\<T\>

```rust
pub fn to<T>(self: CallExpression) -> <any>;
```
## CallExpression::key\_neq

```rust
pub fn key_neq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::key\_eq

```rust
pub fn key_eq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::to\_set

```rust
pub fn to_set(self: CallExpression) -> *CallExpression;
```
