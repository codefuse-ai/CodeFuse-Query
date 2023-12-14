# NpFileDO

Primary key: `element_hash_id: int`

```rust
schema NpFileDO {
  project_hash_id: int,
  name: string,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## NpFileDO::getProjectHashId

```rust
/**
     * @brief gets the project hash id of this element.
     * @return int
     */
```
```rust
pub fn getProjectHashId(self: NpFileDO) -> int;
```
## NpFileDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpFileDO) -> string;
```
## NpFileDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpFileDO) -> string;
```
## NpFileDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpFileDO;
```
## NpFileDO::is\<T\>

```rust
pub fn is<T>(self: NpFileDO) -> bool;
```
## NpFileDO::to\<T\>

```rust
pub fn to<T>(self: NpFileDO) -> <any>;
```
## NpFileDO::key\_neq

```rust
pub fn key_neq(self: NpFileDO, object: <any>) -> bool;
```
## NpFileDO::key\_eq

```rust
pub fn key_eq(self: NpFileDO, object: <any>) -> bool;
```
## NpFileDO::to\_set

```rust
pub fn to_set(self: NpFileDO) -> *NpFileDO;
```
