# CharacterLiteral

Primary key: `element_hash_id: int`

```rust
schema CharacterLiteral {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## CharacterLiteral::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: CharacterLiteral) -> Type;
```
## CharacterLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: CharacterLiteral) -> Callable;
```
## CharacterLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: CharacterLiteral) -> int;
```
## CharacterLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CharacterLiteral;
```
## CharacterLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CharacterLiteral) -> int;
```
## CharacterLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CharacterLiteral) -> Location;
```
## CharacterLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: CharacterLiteral) -> int;
```
## CharacterLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: CharacterLiteral) -> ElementParent;
```
## CharacterLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: CharacterLiteral) -> Statement;
```
## CharacterLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: CharacterLiteral) -> NumberOfLines;
```
## CharacterLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: CharacterLiteral) -> *ElementParent;
```
## CharacterLiteral::is\<T\>

```rust
pub fn is<T>(self: CharacterLiteral) -> bool;
```
## CharacterLiteral::to\<T\>

```rust
pub fn to<T>(self: CharacterLiteral) -> <any>;
```
## CharacterLiteral::key\_neq

```rust
pub fn key_neq(self: CharacterLiteral, object: <any>) -> bool;
```
## CharacterLiteral::key\_eq

```rust
pub fn key_eq(self: CharacterLiteral, object: <any>) -> bool;
```
## CharacterLiteral::to\_set

```rust
pub fn to_set(self: CharacterLiteral) -> *CharacterLiteral;
```
