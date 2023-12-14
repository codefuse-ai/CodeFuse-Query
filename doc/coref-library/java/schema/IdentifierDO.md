# IdentifierDO

Primary key: `element_hash_id: int`

```rust
schema IdentifierDO {
  parent_hash_id: int,
  name: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## IdentifierDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: IdentifierDO) -> int;
```
## IdentifierDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: IdentifierDO) -> int;
```
## IdentifierDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: IdentifierDO) -> string;
```
## IdentifierDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IdentifierDO;
```
## IdentifierDO::is\<T\>

```rust
pub fn is<T>(self: IdentifierDO) -> bool;
```
## IdentifierDO::to\<T\>

```rust
pub fn to<T>(self: IdentifierDO) -> <any>;
```
## IdentifierDO::key\_neq

```rust
pub fn key_neq(self: IdentifierDO, object: <any>) -> bool;
```
## IdentifierDO::key\_eq

```rust
pub fn key_eq(self: IdentifierDO, object: <any>) -> bool;
```
## IdentifierDO::to\_set

```rust
pub fn to_set(self: IdentifierDO) -> *IdentifierDO;
```
