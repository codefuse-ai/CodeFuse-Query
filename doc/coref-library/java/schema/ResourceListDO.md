# ResourceListDO

Primary key: `element_hash_id: int`

```rust
schema ResourceListDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ResourceListDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ResourceListDO) -> int;
```
## ResourceListDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ResourceListDO) -> string;
```
## ResourceListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ResourceListDO) -> int;
```
## ResourceListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ResourceListDO;
```
## ResourceListDO::is\<T\>

```rust
pub fn is<T>(self: ResourceListDO) -> bool;
```
## ResourceListDO::to\<T\>

```rust
pub fn to<T>(self: ResourceListDO) -> <any>;
```
## ResourceListDO::key\_neq

```rust
pub fn key_neq(self: ResourceListDO, object: <any>) -> bool;
```
## ResourceListDO::key\_eq

```rust
pub fn key_eq(self: ResourceListDO, object: <any>) -> bool;
```
## ResourceListDO::to\_set

```rust
pub fn to_set(self: ResourceListDO) -> *ResourceListDO;
```
