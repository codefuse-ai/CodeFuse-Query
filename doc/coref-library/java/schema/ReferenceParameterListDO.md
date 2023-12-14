# ReferenceParameterListDO

Primary key: `list_hash_id: int`

```rust
schema ReferenceParameterListDO {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary list_hash_id: int,
  type_element_hash_id: int,
}
```
## ReferenceParameterListDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceParameterListDO) -> string;
```
## ReferenceParameterListDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getListHashId

```rust
/**
     * @brief gets the list hash id of this element.
     * @return int
     */
```
```rust
pub fn getListHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getTypeElementHashId

```rust
/**
     * @brief gets the type element of the list.
     * @return int 
     */
```
```rust
pub fn getTypeElementHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceParameterListDO;
```
## ReferenceParameterListDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceParameterListDO) -> bool;
```
## ReferenceParameterListDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceParameterListDO) -> <any>;
```
## ReferenceParameterListDO::key\_neq

```rust
pub fn key_neq(self: ReferenceParameterListDO, object: <any>) -> bool;
```
## ReferenceParameterListDO::key\_eq

```rust
pub fn key_eq(self: ReferenceParameterListDO, object: <any>) -> bool;
```
## ReferenceParameterListDO::to\_set

```rust
pub fn to_set(self: ReferenceParameterListDO) -> *ReferenceParameterListDO;
```
