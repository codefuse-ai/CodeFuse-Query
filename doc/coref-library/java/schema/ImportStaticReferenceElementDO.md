# ImportStaticReferenceElementDO

Primary key: `element_hash_id: int`

```rust
schema ImportStaticReferenceElementDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ImportStaticReferenceElementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ImportStaticReferenceElementDO) -> int;
```
## ImportStaticReferenceElementDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ImportStaticReferenceElementDO) -> string;
```
## ImportStaticReferenceElementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ImportStaticReferenceElementDO) -> int;
```
## ImportStaticReferenceElementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticReferenceElementDO;
```
## ImportStaticReferenceElementDO::is\<T\>

```rust
pub fn is<T>(self: ImportStaticReferenceElementDO) -> bool;
```
## ImportStaticReferenceElementDO::to\<T\>

```rust
pub fn to<T>(self: ImportStaticReferenceElementDO) -> <any>;
```
## ImportStaticReferenceElementDO::key\_neq

```rust
pub fn key_neq(self: ImportStaticReferenceElementDO, object: <any>) -> bool;
```
## ImportStaticReferenceElementDO::key\_eq

```rust
pub fn key_eq(self: ImportStaticReferenceElementDO, object: <any>) -> bool;
```
## ImportStaticReferenceElementDO::to\_set

```rust
pub fn to_set(self: ImportStaticReferenceElementDO) -> *ImportStaticReferenceElementDO;
```
