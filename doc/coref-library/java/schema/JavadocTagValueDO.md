# JavadocTagValueDO

Primary key: `element_hash_id: int`

```rust
schema JavadocTagValueDO {
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## JavadocTagValueDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocTagValueDO) -> int;
```
## JavadocTagValueDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: JavadocTagValueDO) -> string;
```
## JavadocTagValueDO::getParentHashId

```rust
/**
     * @brief gets the containing comment hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JavadocTagValueDO) -> int;
```
## JavadocTagValueDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagValueDO;
```
## JavadocTagValueDO::is\<T\>

```rust
pub fn is<T>(self: JavadocTagValueDO) -> bool;
```
## JavadocTagValueDO::to\<T\>

```rust
pub fn to<T>(self: JavadocTagValueDO) -> <any>;
```
## JavadocTagValueDO::key\_neq

```rust
pub fn key_neq(self: JavadocTagValueDO, object: <any>) -> bool;
```
## JavadocTagValueDO::key\_eq

```rust
pub fn key_eq(self: JavadocTagValueDO, object: <any>) -> bool;
```
## JavadocTagValueDO::to\_set

```rust
pub fn to_set(self: JavadocTagValueDO) -> *JavadocTagValueDO;
```
