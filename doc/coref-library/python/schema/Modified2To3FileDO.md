# Modified2To3FileDO

Primary key: `element_oid: int`

```rust
schema Modified2To3FileDO {
  relative_path: string,
  @primary element_oid: int,
}
```
## Modified2To3FileDO::getRelativePath

```rust
/**
     * @brief gets the relative path of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: Modified2To3FileDO) -> string;
```
## Modified2To3FileDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Modified2To3FileDO;
```
## Modified2To3FileDO::is\<T\>

```rust
pub fn is<T>(self: Modified2To3FileDO) -> bool;
```
## Modified2To3FileDO::to\<T\>

```rust
pub fn to<T>(self: Modified2To3FileDO) -> <any>;
```
## Modified2To3FileDO::key\_neq

```rust
pub fn key_neq(self: Modified2To3FileDO, object: <any>) -> bool;
```
## Modified2To3FileDO::key\_eq

```rust
pub fn key_eq(self: Modified2To3FileDO, object: <any>) -> bool;
```
## Modified2To3FileDO::to\_set

```rust
pub fn to_set(self: Modified2To3FileDO) -> *Modified2To3FileDO;
```
