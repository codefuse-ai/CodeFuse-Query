# ReferenceElementDO

Primary key: `element_hash_id: int`

```rust
schema ReferenceElementDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ReferenceElementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceElementDO) -> int;
```
## ReferenceElementDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceElementDO) -> string;
```
## ReferenceElementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceElementDO) -> int;
```
## ReferenceElementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceElementDO;
```
## ReferenceElementDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceElementDO) -> bool;
```
## ReferenceElementDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceElementDO) -> <any>;
```
## ReferenceElementDO::key\_neq

```rust
pub fn key_neq(self: ReferenceElementDO, object: <any>) -> bool;
```
## ReferenceElementDO::key\_eq

```rust
pub fn key_eq(self: ReferenceElementDO, object: <any>) -> bool;
```
## ReferenceElementDO::to\_set

```rust
pub fn to_set(self: ReferenceElementDO) -> *ReferenceElementDO;
```
