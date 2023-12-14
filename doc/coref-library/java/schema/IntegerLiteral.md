# IntegerLiteral

Primary key: `element_hash_id: int`

```rust
schema IntegerLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## IntegerLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: IntegerLiteral) -> Type;
```
## IntegerLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: IntegerLiteral) -> Callable;
```
## IntegerLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: IntegerLiteral) -> int;
```
## IntegerLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IntegerLiteral;
```
## IntegerLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: IntegerLiteral) -> int;
```
## IntegerLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: IntegerLiteral) -> Location;
```
## IntegerLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: IntegerLiteral) -> int;
```
## IntegerLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: IntegerLiteral) -> ElementParent;
```
## IntegerLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: IntegerLiteral) -> Statement;
```
## IntegerLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: IntegerLiteral) -> NumberOfLines;
```
## IntegerLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: IntegerLiteral) -> *ElementParent;
```
## IntegerLiteral::is\<T\>

```rust
pub fn is<T>(self: IntegerLiteral) -> bool;
```
## IntegerLiteral::to\<T\>

```rust
pub fn to<T>(self: IntegerLiteral) -> <any>;
```
## IntegerLiteral::key\_neq

```rust
pub fn key_neq(self: IntegerLiteral, object: <any>) -> bool;
```
## IntegerLiteral::key\_eq

```rust
pub fn key_eq(self: IntegerLiteral, object: <any>) -> bool;
```
## IntegerLiteral::to\_set

```rust
pub fn to_set(self: IntegerLiteral) -> *IntegerLiteral;
```
