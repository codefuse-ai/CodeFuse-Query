# ReferenceListDO

Primary key: `element_hash_id: int`

```rust
schema ReferenceListDO {
  printable_text: string,
  parent_hash_id: int,
  role: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ReferenceListDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceListDO) -> string;
```
## ReferenceListDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceListDO) -> int;
```
## ReferenceListDO::getRole

```rust
/**
     * @brief gets the role of this element.
     * @return string
     */
```
```rust
pub fn getRole(self: ReferenceListDO) -> string;
```
## ReferenceListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceListDO) -> int;
```
## ReferenceListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceListDO;
```
## ReferenceListDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceListDO) -> bool;
```
## ReferenceListDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceListDO) -> <any>;
```
## ReferenceListDO::key\_neq

```rust
pub fn key_neq(self: ReferenceListDO, object: <any>) -> bool;
```
## ReferenceListDO::key\_eq

```rust
pub fn key_eq(self: ReferenceListDO, object: <any>) -> bool;
```
## ReferenceListDO::to\_set

```rust
pub fn to_set(self: ReferenceListDO) -> *ReferenceListDO;
```
