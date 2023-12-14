# FileDO

Primary key: `element_oid: int`

```rust
schema FileDO {
  number_of_lines_oid: int,
  name: string,
  extension: string,
  relative_path: string,
  @primary element_oid: int,
}
```
## FileDO::getNumberOfLinesOid

```rust
/**
     * @brief gets the number of lines oid of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfLinesOid(self: FileDO) -> int;
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
     * @brief gets the relative path of this element.
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
pub fn __all__(db: PythonDB) -> *FileDO;
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
