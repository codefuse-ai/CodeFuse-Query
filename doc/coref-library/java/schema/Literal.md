# Literal

Primary key: `element_hash_id: int`

```rust
schema Literal {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## Literal::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Literal) -> *ElementParent;
```
## Literal::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: Literal) -> string;
```
## Literal::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Literal) -> Statement;
```
## Literal::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Literal) -> NumberOfLines;
```
## Literal::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Literal) -> ElementParent;
```
## Literal::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Literal) -> int;
```
## Literal::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Literal;
```
## Literal::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Literal) -> int;
```
## Literal::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Literal) -> Location;
```
## Literal::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: Literal) -> Callable;
```
## Literal::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: Literal) -> int;
```
## Literal::getValueType

```rust
/**
     * @brief gets the type of the Literal value.
     * @return string
     */
```
```rust
pub fn getValueType(self: Literal) -> Type;
```
## Literal::getValue

```rust
/**
     * @brief gets the value of the Literal.
     * @return string
     */
```
```rust
pub fn getValue(self: Literal) -> string;
```
## Literal::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Literal) -> string;
```
## Literal::is\<T\>

```rust
pub fn is<T>(self: Literal) -> bool;
```
## Literal::to\<T\>

```rust
pub fn to<T>(self: Literal) -> <any>;
```
## Literal::key\_neq

```rust
pub fn key_neq(self: Literal, object: <any>) -> bool;
```
## Literal::key\_eq

```rust
pub fn key_eq(self: Literal, object: <any>) -> bool;
```
## Literal::to\_set

```rust
pub fn to_set(self: Literal) -> *Literal;
```
