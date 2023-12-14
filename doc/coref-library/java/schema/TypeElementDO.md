# TypeElementDO

Primary key: `element_hash_id: int`

```rust
schema TypeElementDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  reference_type_hash_id: int,
  @primary element_hash_id: int,
}
```
## TypeElementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeElementDO) -> string;
```
## TypeElementDO::getReferenceTypeHashId

```rust
/**
     * @brief gets the reference type hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceTypeHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeElementDO;
```
## TypeElementDO::is\<T\>

```rust
pub fn is<T>(self: TypeElementDO) -> bool;
```
## TypeElementDO::to\<T\>

```rust
pub fn to<T>(self: TypeElementDO) -> <any>;
```
## TypeElementDO::key\_neq

```rust
pub fn key_neq(self: TypeElementDO, object: <any>) -> bool;
```
## TypeElementDO::key\_eq

```rust
pub fn key_eq(self: TypeElementDO, object: <any>) -> bool;
```
## TypeElementDO::to\_set

```rust
pub fn to_set(self: TypeElementDO) -> *TypeElementDO;
```
