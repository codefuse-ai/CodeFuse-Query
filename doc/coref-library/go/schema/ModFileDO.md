# ModFileDO

Primary key: `oid: int`

```rust
schema ModFileDO {
  go_version: string,
  name: string,
  path: string,
  @primary oid: int,
}
```
## ModFileDO::getGoVersion

```rust
/**
     * @brief gets the go version of this element.
     * @return string
     */
```
```rust
pub fn getGoVersion(self: ModFileDO) -> string;
```
## ModFileDO::getPath

```rust
/**
     * @brief gets the path of this element.
     * @return string
     */
```
```rust
pub fn getPath(self: ModFileDO) -> string;
```
## ModFileDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ModFileDO) -> string;
```
## ModFileDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ModFileDO;
```
## ModFileDO::is\<T\>

```rust
pub fn is<T>(self: ModFileDO) -> bool;
```
## ModFileDO::to\<T\>

```rust
pub fn to<T>(self: ModFileDO) -> <any>;
```
## ModFileDO::key\_neq

```rust
pub fn key_neq(self: ModFileDO, object: <any>) -> bool;
```
## ModFileDO::key\_eq

```rust
pub fn key_eq(self: ModFileDO, object: <any>) -> bool;
```
## ModFileDO::to\_set

```rust
pub fn to_set(self: ModFileDO) -> *ModFileDO;
```
