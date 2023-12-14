# FileDO

Primary key: `element_hash_id: int`

```rust
schema FileDO {
  number_of_lines_hash_id: int,
  extension: string,
  name: string,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## FileDO::getNumberOfLinesHashId

```rust
/**
     * @brief gets the number of lines hash id of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfLinesHashId(self: FileDO) -> int;
```
## FileDO::getExtension

```rust
/**
     * @brief gets the extension of this element.
     * @return string
     */
```
```rust
pub fn getExtension(self: FileDO) -> string;
```
## FileDO::getRelativePath

```rust
/**
     * @brief gets the relative path  of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: FileDO) -> string;
```
## FileDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: FileDO) -> string;
```
## FileDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *FileDO;
```
## FileDO::is\<T\>

```rust
pub fn is<T>(self: FileDO) -> bool;
```
## FileDO::to\<T\>

```rust
pub fn to<T>(self: FileDO) -> <any>;
```
## FileDO::key\_neq

```rust
pub fn key_neq(self: FileDO, object: <any>) -> bool;
```
## FileDO::key\_eq

```rust
pub fn key_eq(self: FileDO, object: <any>) -> bool;
```
## FileDO::to\_set

```rust
pub fn to_set(self: FileDO) -> *FileDO;
```
