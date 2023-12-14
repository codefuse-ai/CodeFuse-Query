# FloatingPointLiteral

Primary key: `element_hash_id: int`

```rust
schema FloatingPointLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## FloatingPointLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: FloatingPointLiteral) -> string;
```
## FloatingPointLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: FloatingPointLiteral) -> string;
```
## FloatingPointLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: FloatingPointLiteral) -> Type;
```
## FloatingPointLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: FloatingPointLiteral) -> Callable;
```
## FloatingPointLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: FloatingPointLiteral) -> int;
```
## FloatingPointLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *FloatingPointLiteral;
```
## FloatingPointLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: FloatingPointLiteral) -> int;
```
## FloatingPointLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: FloatingPointLiteral) -> Location;
```
## FloatingPointLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: FloatingPointLiteral) -> int;
```
## FloatingPointLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: FloatingPointLiteral) -> ElementParent;
```
## FloatingPointLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: FloatingPointLiteral) -> Statement;
```
## FloatingPointLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: FloatingPointLiteral) -> string;
```
## FloatingPointLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: FloatingPointLiteral) -> NumberOfLines;
```
## FloatingPointLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: FloatingPointLiteral) -> *ElementParent;
```
## FloatingPointLiteral::is\<T\>

```rust
pub fn is<T>(self: FloatingPointLiteral) -> bool;
```
## FloatingPointLiteral::to\<T\>

```rust
pub fn to<T>(self: FloatingPointLiteral) -> <any>;
```
## FloatingPointLiteral::key\_neq

```rust
pub fn key_neq(self: FloatingPointLiteral, object: <any>) -> bool;
```
## FloatingPointLiteral::key\_eq

```rust
pub fn key_eq(self: FloatingPointLiteral, object: <any>) -> bool;
```
## FloatingPointLiteral::to\_set

```rust
pub fn to_set(self: FloatingPointLiteral) -> *FloatingPointLiteral;
```
