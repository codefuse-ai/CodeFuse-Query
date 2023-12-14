# JavadocDataTokenDO

Primary key: `element_hash_id: int`

```rust
schema JavadocDataTokenDO {
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## JavadocDataTokenDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: JavadocDataTokenDO) -> string;
```
## JavadocDataTokenDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocDataTokenDO;
```
## JavadocDataTokenDO::is\<T\>

```rust
pub fn is<T>(self: JavadocDataTokenDO) -> bool;
```
## JavadocDataTokenDO::to\<T\>

```rust
pub fn to<T>(self: JavadocDataTokenDO) -> <any>;
```
## JavadocDataTokenDO::key\_neq

```rust
pub fn key_neq(self: JavadocDataTokenDO, object: <any>) -> bool;
```
## JavadocDataTokenDO::key\_eq

```rust
pub fn key_eq(self: JavadocDataTokenDO, object: <any>) -> bool;
```
## JavadocDataTokenDO::to\_set

```rust
pub fn to_set(self: JavadocDataTokenDO) -> *JavadocDataTokenDO;
```
