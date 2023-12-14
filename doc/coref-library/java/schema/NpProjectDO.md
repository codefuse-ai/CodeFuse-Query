# NpProjectDO

Primary key: `element_hash_id: int`

```rust
schema NpProjectDO {
  extension: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpProjectDO::getExtension

```rust
/**
     * @brief gets the extension of this element.
     * @return string
     */
```
```rust
pub fn getExtension(self: NpProjectDO) -> string;
```
## NpProjectDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpProjectDO) -> string;
```
## NpProjectDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpProjectDO;
```
## NpProjectDO::is\<T\>

```rust
pub fn is<T>(self: NpProjectDO) -> bool;
```
## NpProjectDO::to\<T\>

```rust
pub fn to<T>(self: NpProjectDO) -> <any>;
```
## NpProjectDO::key\_neq

```rust
pub fn key_neq(self: NpProjectDO, object: <any>) -> bool;
```
## NpProjectDO::key\_eq

```rust
pub fn key_eq(self: NpProjectDO, object: <any>) -> bool;
```
## NpProjectDO::to\_set

```rust
pub fn to_set(self: NpProjectDO) -> *NpProjectDO;
```
