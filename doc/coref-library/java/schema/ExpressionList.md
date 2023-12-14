# ExpressionList

Primary key: `element_hash_id: int`

```rust
schema ExpressionList {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  size: int,
  printable_text: string,
}
```
## ExpressionList::getSize

```rust
pub fn getSize(self: ExpressionList) -> int;
```
## ExpressionList::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ExpressionList) -> int;
```
## ExpressionList::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ExpressionList) -> string;
```
## ExpressionList::getSubExpression

```rust
pub fn getSubExpression(self: ExpressionList, position: int) -> Expression;
```
## ExpressionList::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ExpressionList) -> ElementParent;
```
## ExpressionList::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ExpressionList) -> int;
```
## ExpressionList::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ExpressionList) -> Location;
```
## ExpressionList::getContainedExpression

```rust
pub fn getContainedExpression(self: ExpressionList) -> Expression;
```
## ExpressionList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionList;
```
## ExpressionList::is\<T\>

```rust
pub fn is<T>(self: ExpressionList) -> bool;
```
## ExpressionList::to\<T\>

```rust
pub fn to<T>(self: ExpressionList) -> <any>;
```
## ExpressionList::key\_neq

```rust
pub fn key_neq(self: ExpressionList, object: <any>) -> bool;
```
## ExpressionList::key\_eq

```rust
pub fn key_eq(self: ExpressionList, object: <any>) -> bool;
```
## ExpressionList::to\_set

```rust
pub fn to_set(self: ExpressionList) -> *ExpressionList;
```
