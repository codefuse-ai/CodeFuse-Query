# NullLiteral

Primary key: `element_hash_id: int`

```rust
schema NullLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## NullLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: NullLiteral) -> string;
```
## NullLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: NullLiteral) -> string;
```
## NullLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: NullLiteral) -> Type;
```
## NullLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: NullLiteral) -> Callable;
```
## NullLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: NullLiteral) -> int;
```
## NullLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NullLiteral;
```
## NullLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: NullLiteral) -> int;
```
## NullLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: NullLiteral) -> Location;
```
## NullLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NullLiteral) -> int;
```
## NullLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: NullLiteral) -> ElementParent;
```
## NullLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: NullLiteral) -> Statement;
```
## NullLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: NullLiteral) -> string;
```
## NullLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: NullLiteral) -> NumberOfLines;
```
## NullLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: NullLiteral) -> *ElementParent;
```
## NullLiteral::is\<T\>

```rust
pub fn is<T>(self: NullLiteral) -> bool;
```
## NullLiteral::to\<T\>

```rust
pub fn to<T>(self: NullLiteral) -> <any>;
```
## NullLiteral::key\_neq

```rust
pub fn key_neq(self: NullLiteral, object: <any>) -> bool;
```
## NullLiteral::key\_eq

```rust
pub fn key_eq(self: NullLiteral, object: <any>) -> bool;
```
## NullLiteral::to\_set

```rust
pub fn to_set(self: NullLiteral) -> *NullLiteral;
```
