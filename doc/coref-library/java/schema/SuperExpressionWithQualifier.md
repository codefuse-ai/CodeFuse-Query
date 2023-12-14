# SuperExpressionWithQualifier

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionWithQualifier {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## SuperExpressionWithQualifier::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SuperExpressionWithQualifier) -> string;
```
## SuperExpressionWithQualifier::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SuperExpressionWithQualifier) -> Callable;
```
## SuperExpressionWithQualifier::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SuperExpressionWithQualifier) -> NumberOfLines;
```
## SuperExpressionWithQualifier::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: SuperExpressionWithQualifier) -> ElementParent;
```
## SuperExpressionWithQualifier::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SuperExpressionWithQualifier) -> Statement;
```
## SuperExpressionWithQualifier::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionWithQualifier;
```
## SuperExpressionWithQualifier::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: SuperExpressionWithQualifier) -> Location;
```
## SuperExpressionWithQualifier::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SuperExpressionWithQualifier) -> string;
```
## SuperExpressionWithQualifier::getQualifier

```rust
/**
     * @brief gets the Qualifier of the expression, if any.
     * @return ReferenceElement 
     */
```
```rust
pub fn getQualifier(self: SuperExpressionWithQualifier) -> ReferenceElement;
```
## SuperExpressionWithQualifier::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SuperExpressionWithQualifier) -> *ElementParent;
```
## SuperExpressionWithQualifier::is\<T\>

```rust
pub fn is<T>(self: SuperExpressionWithQualifier) -> bool;
```
## SuperExpressionWithQualifier::to\<T\>

```rust
pub fn to<T>(self: SuperExpressionWithQualifier) -> <any>;
```
## SuperExpressionWithQualifier::key\_neq

```rust
pub fn key_neq(self: SuperExpressionWithQualifier, object: <any>) -> bool;
```
## SuperExpressionWithQualifier::key\_eq

```rust
pub fn key_eq(self: SuperExpressionWithQualifier, object: <any>) -> bool;
```
## SuperExpressionWithQualifier::to\_set

```rust
pub fn to_set(self: SuperExpressionWithQualifier) -> *SuperExpressionWithQualifier;
```
