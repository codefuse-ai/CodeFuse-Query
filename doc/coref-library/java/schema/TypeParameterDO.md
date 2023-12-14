# TypeParameterDO

Primary key: `element_hash_id: int`

```rust
schema TypeParameterDO {
  parent_hash_id: int,
  extends_list_hash_id: int,
  index_order: int,
  printable_text: string,
  owner_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## TypeParameterDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getOwnerHashId

```rust
/**
     * @brief gets the owner hash id of this element.
     * @return int
     */
```
```rust
pub fn getOwnerHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getExtendsListHashId

```rust
/**
     * @brief gets the extends list hash id of this element.
     * @return int
     */
```
```rust
pub fn getExtendsListHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeParameterDO) -> string;
```
## TypeParameterDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeParameterDO;
```
## TypeParameterDO::is\<T\>

```rust
pub fn is<T>(self: TypeParameterDO) -> bool;
```
## TypeParameterDO::to\<T\>

```rust
pub fn to<T>(self: TypeParameterDO) -> <any>;
```
## TypeParameterDO::key\_neq

```rust
pub fn key_neq(self: TypeParameterDO, object: <any>) -> bool;
```
## TypeParameterDO::key\_eq

```rust
pub fn key_eq(self: TypeParameterDO, object: <any>) -> bool;
```
## TypeParameterDO::to\_set

```rust
pub fn to_set(self: TypeParameterDO) -> *TypeParameterDO;
```
