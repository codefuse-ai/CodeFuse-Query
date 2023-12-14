# DoubleLiteral

Primary key: `element_hash_id: int`

```rust
schema DoubleLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## DoubleLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: DoubleLiteral) -> string;
```
## DoubleLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: DoubleLiteral) -> string;
```
## DoubleLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: DoubleLiteral) -> Type;
```
## DoubleLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: DoubleLiteral) -> Callable;
```
## DoubleLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: DoubleLiteral) -> int;
```
## DoubleLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DoubleLiteral;
```
## DoubleLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: DoubleLiteral) -> int;
```
## DoubleLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: DoubleLiteral) -> Location;
```
## DoubleLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: DoubleLiteral) -> int;
```
## DoubleLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: DoubleLiteral) -> ElementParent;
```
## DoubleLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: DoubleLiteral) -> Statement;
```
## DoubleLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: DoubleLiteral) -> string;
```
## DoubleLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: DoubleLiteral) -> NumberOfLines;
```
## DoubleLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: DoubleLiteral) -> *ElementParent;
```
## DoubleLiteral::is\<T\>

```rust
pub fn is<T>(self: DoubleLiteral) -> bool;
```
## DoubleLiteral::to\<T\>

```rust
pub fn to<T>(self: DoubleLiteral) -> <any>;
```
## DoubleLiteral::key\_neq

```rust
pub fn key_neq(self: DoubleLiteral, object: <any>) -> bool;
```
## DoubleLiteral::key\_eq

```rust
pub fn key_eq(self: DoubleLiteral, object: <any>) -> bool;
```
## DoubleLiteral::to\_set

```rust
pub fn to_set(self: DoubleLiteral) -> *DoubleLiteral;
```
