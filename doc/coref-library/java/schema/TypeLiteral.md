# TypeLiteral

Primary key: `element_hash_id: int`

```rust
schema TypeLiteral {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## TypeLiteral::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeLiteral) -> string;
```
## TypeLiteral::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: TypeLiteral) -> Statement;
```
## TypeLiteral::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: TypeLiteral) -> NumberOfLines;
```
## TypeLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeLiteral;
```
## TypeLiteral::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: TypeLiteral) -> Location;
```
## TypeLiteral::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeLiteral) -> int;
```
## TypeLiteral::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: TypeLiteral) -> ElementParent;
```
## TypeLiteral::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeLiteral) -> int;
```
## TypeLiteral::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: TypeLiteral) -> Callable;
```
## TypeLiteral::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeLiteral) -> int;
```
## TypeLiteral::getValue

```rust
/**
     * @brief gets the value of the element.
     * @return string 
     */
```
```rust
pub fn getValue(self: TypeLiteral) -> string;
```
## TypeLiteral::getType

```rust
/**
     * @brief gets the reference type of the element.
     * @return Type 
     */
```
```rust
pub fn getType(self: TypeLiteral) -> Type;
```
## TypeLiteral::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: TypeLiteral) -> *ElementParent;
```
## TypeLiteral::getTypeElement

```rust
/**
     * @brief gets the type element of the element.
     * @return TypeElement 
     */
```
```rust
pub fn getTypeElement(self: TypeLiteral) -> TypeElement;
```
## TypeLiteral::is\<T\>

```rust
pub fn is<T>(self: TypeLiteral) -> bool;
```
## TypeLiteral::to\<T\>

```rust
pub fn to<T>(self: TypeLiteral) -> <any>;
```
## TypeLiteral::key\_neq

```rust
pub fn key_neq(self: TypeLiteral, object: <any>) -> bool;
```
## TypeLiteral::key\_eq

```rust
pub fn key_eq(self: TypeLiteral, object: <any>) -> bool;
```
## TypeLiteral::to\_set

```rust
pub fn to_set(self: TypeLiteral) -> *TypeLiteral;
```
