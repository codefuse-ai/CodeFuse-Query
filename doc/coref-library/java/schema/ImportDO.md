# ImportDO

Primary key: `element_hash_id: int`

```rust
schema ImportDO {
  is_foreign_import: int,
  parent_hash_id: int,
  reference_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ImportDO::getIsForeignImport

```rust
/**
     * @brief gets the is foreign import of this element.
     * @return int
     */
```
```rust
pub fn getIsForeignImport(self: ImportDO) -> int;
```
## ImportDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ImportDO) -> int;
```
## ImportDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ImportDO) -> string;
```
## ImportDO::getReferenceHashId

```rust
/**
     * @brief gets the reference hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceHashId(self: ImportDO) -> int;
```
## ImportDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ImportDO) -> int;
```
## ImportDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ImportDO;
```
## ImportDO::is\<T\>

```rust
pub fn is<T>(self: ImportDO) -> bool;
```
## ImportDO::to\<T\>

```rust
pub fn to<T>(self: ImportDO) -> <any>;
```
## ImportDO::key\_neq

```rust
pub fn key_neq(self: ImportDO, object: <any>) -> bool;
```
## ImportDO::key\_eq

```rust
pub fn key_eq(self: ImportDO, object: <any>) -> bool;
```
## ImportDO::to\_set

```rust
pub fn to_set(self: ImportDO) -> *ImportDO;
```
