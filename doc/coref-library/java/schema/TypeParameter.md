# TypeParameter

Primary key: `element_hash_id: int`

```rust
schema TypeParameter {
  @primary element_hash_id: int,
  location_hash_id: int,
  owner_hash_id: int,
  printable_text: string,
  index_order: int,
  extends_list_hash_id: int,
  parent_hash_id: int,
}
```
## TypeParameter::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeParameter) -> string;
```
## TypeParameter::getExtendsListHashId

```rust
/**
     * @brief gets the extends list hash id of this element.
     * @return int
     */
```
```rust
pub fn getExtendsListHashId(self: TypeParameter) -> int;
```
## TypeParameter::getOwner

```rust
/**
     * @brief gets the element which is parameterized by the type parameter.
     * @return ExpressionParent 
     */
```
```rust
pub fn getOwner(self: TypeParameter) -> ElementParent;
```
## TypeParameter::getOwnerHashId

```rust
/**
     * @brief gets the owner hash id of this element.
     * @return int
     */
```
```rust
pub fn getOwnerHashId(self: TypeParameter) -> int;
```
## TypeParameter::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeParameter;
```
## TypeParameter::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: TypeParameter) -> Location;
```
## TypeParameter::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeParameter) -> int;
```
## TypeParameter::getExtendsList

```rust
/**
     * @brief gets the extends list id (reference list)of the type parameter.
     * @return ExpressionParent 
     */
```
```rust
pub fn getExtendsList(self: TypeParameter) -> ReferenceList;
```
## TypeParameter::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeParameter) -> int;
```
## TypeParameter::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ExpressionParent 
     */
```
```rust
pub fn getParent(self: TypeParameter) -> ElementParent;
```
## TypeParameter::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeParameter) -> int;
```
## TypeParameter::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: TypeParameter) -> *ElementParent;
```
## TypeParameter::is\<T\>

```rust
pub fn is<T>(self: TypeParameter) -> bool;
```
## TypeParameter::to\<T\>

```rust
pub fn to<T>(self: TypeParameter) -> <any>;
```
## TypeParameter::key\_neq

```rust
pub fn key_neq(self: TypeParameter, object: <any>) -> bool;
```
## TypeParameter::key\_eq

```rust
pub fn key_eq(self: TypeParameter, object: <any>) -> bool;
```
## TypeParameter::to\_set

```rust
pub fn to_set(self: TypeParameter) -> *TypeParameter;
```
