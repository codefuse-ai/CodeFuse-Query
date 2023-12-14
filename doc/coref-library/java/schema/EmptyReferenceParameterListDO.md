# EmptyReferenceParameterListDO

Primary key: `list_hash_id: int`

```rust
schema EmptyReferenceParameterListDO {
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
  @primary list_hash_id: int,
}
```
## EmptyReferenceParameterListDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: EmptyReferenceParameterListDO) -> int;
```
## EmptyReferenceParameterListDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: EmptyReferenceParameterListDO) -> string;
```
## EmptyReferenceParameterListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: EmptyReferenceParameterListDO) -> int;
```
## EmptyReferenceParameterListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EmptyReferenceParameterListDO;
```
## EmptyReferenceParameterListDO::is\<T\>

```rust
pub fn is<T>(self: EmptyReferenceParameterListDO) -> bool;
```
## EmptyReferenceParameterListDO::to\<T\>

```rust
pub fn to<T>(self: EmptyReferenceParameterListDO) -> <any>;
```
## EmptyReferenceParameterListDO::key\_neq

```rust
pub fn key_neq(self: EmptyReferenceParameterListDO, object: <any>) -> bool;
```
## EmptyReferenceParameterListDO::key\_eq

```rust
pub fn key_eq(self: EmptyReferenceParameterListDO, object: <any>) -> bool;
```
## EmptyReferenceParameterListDO::to\_set

```rust
pub fn to_set(self: EmptyReferenceParameterListDO) -> *EmptyReferenceParameterListDO;
```
