# LongLiteral

Primary key: `element_hash_id: int`

```rust
schema LongLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## LongLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: LongLiteral) -> string;
```
## LongLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: LongLiteral) -> string;
```
## LongLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: LongLiteral) -> Type;
```
## LongLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: LongLiteral) -> Callable;
```
## LongLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LongLiteral) -> int;
```
## LongLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LongLiteral;
```
## LongLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LongLiteral) -> int;
```
## LongLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: LongLiteral) -> Location;
```
## LongLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LongLiteral) -> int;
```
## LongLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: LongLiteral) -> ElementParent;
```
## LongLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: LongLiteral) -> Statement;
```
## LongLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LongLiteral) -> string;
```
## LongLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: LongLiteral) -> NumberOfLines;
```
## LongLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LongLiteral) -> *ElementParent;
```
## LongLiteral::is\<T\>

```rust
pub fn is<T>(self: LongLiteral) -> bool;
```
## LongLiteral::to\<T\>

```rust
pub fn to<T>(self: LongLiteral) -> <any>;
```
## LongLiteral::key\_neq

```rust
pub fn key_neq(self: LongLiteral, object: <any>) -> bool;
```
## LongLiteral::key\_eq

```rust
pub fn key_eq(self: LongLiteral, object: <any>) -> bool;
```
## LongLiteral::to\_set

```rust
pub fn to_set(self: LongLiteral) -> *LongLiteral;
```
