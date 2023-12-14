# BooleanLiteral

Primary key: `element_hash_id: int`

```rust
schema BooleanLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## BooleanLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: BooleanLiteral) -> Type;
```
## BooleanLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: BooleanLiteral) -> Callable;
```
## BooleanLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: BooleanLiteral) -> int;
```
## BooleanLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BooleanLiteral;
```
## BooleanLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: BooleanLiteral) -> Location;
```
## BooleanLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: BooleanLiteral) -> ElementParent;
```
## BooleanLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: BooleanLiteral) -> Statement;
```
## BooleanLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: BooleanLiteral) -> NumberOfLines;
```
## BooleanLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: BooleanLiteral) -> *ElementParent;
```
## BooleanLiteral::is\<T\>

```rust
pub fn is<T>(self: BooleanLiteral) -> bool;
```
## BooleanLiteral::to\<T\>

```rust
pub fn to<T>(self: BooleanLiteral) -> <any>;
```
## BooleanLiteral::key\_neq

```rust
pub fn key_neq(self: BooleanLiteral, object: <any>) -> bool;
```
## BooleanLiteral::key\_eq

```rust
pub fn key_eq(self: BooleanLiteral, object: <any>) -> bool;
```
## BooleanLiteral::to\_set

```rust
pub fn to_set(self: BooleanLiteral) -> *BooleanLiteral;
```
