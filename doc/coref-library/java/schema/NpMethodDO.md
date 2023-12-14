# NpMethodDO

Primary key: `element_hash_id: int`

```rust
schema NpMethodDO {
  parent_hash_id: int,
  type_hash_id: int,
  signature: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpMethodDO::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: NpMethodDO) -> string;
```
## NpMethodDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpMethodDO) -> int;
```
## NpMethodDO::getTypeHashId

```rust
/**
     * @brief gets the return type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: NpMethodDO) -> int;
```
## NpMethodDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpMethodDO) -> string;
```
## NpMethodDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpMethodDO;
```
## NpMethodDO::is\<T\>

```rust
pub fn is<T>(self: NpMethodDO) -> bool;
```
## NpMethodDO::to\<T\>

```rust
pub fn to<T>(self: NpMethodDO) -> <any>;
```
## NpMethodDO::key\_neq

```rust
pub fn key_neq(self: NpMethodDO, object: <any>) -> bool;
```
## NpMethodDO::key\_eq

```rust
pub fn key_eq(self: NpMethodDO, object: <any>) -> bool;
```
## NpMethodDO::to\_set

```rust
pub fn to_set(self: NpMethodDO) -> *NpMethodDO;
```
