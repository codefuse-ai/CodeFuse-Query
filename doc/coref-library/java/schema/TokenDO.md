# TokenDO

Primary key: `element_hash_id: int`

```rust
schema TokenDO {
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## TokenDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TokenDO) -> int;
```
## TokenDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: TokenDO) -> string;
```
## TokenDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TokenDO) -> int;
```
## TokenDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TokenDO;
```
## TokenDO::is\<T\>

```rust
pub fn is<T>(self: TokenDO) -> bool;
```
## TokenDO::to\<T\>

```rust
pub fn to<T>(self: TokenDO) -> <any>;
```
## TokenDO::key\_neq

```rust
pub fn key_neq(self: TokenDO, object: <any>) -> bool;
```
## TokenDO::key\_eq

```rust
pub fn key_eq(self: TokenDO, object: <any>) -> bool;
```
## TokenDO::to\_set

```rust
pub fn to_set(self: TokenDO) -> *TokenDO;
```
