# DeclDO

Primary key: `oid: int`

```rust
schema DeclDO {
  parent_id: int,
  kind: int,
  debug_info: string,
  file_id: int,
  idx: int,
  @primary oid: int,
}
```
## DeclDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: DeclDO) -> string;
```
## DeclDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: DeclDO) -> int;
```
## DeclDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: DeclDO) -> int;
```
## DeclDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: DeclDO) -> int;
```
## DeclDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: DeclDO) -> int;
```
## DeclDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DeclDO;
```
## DeclDO::is\<T\>

```rust
pub fn is<T>(self: DeclDO) -> bool;
```
## DeclDO::to\<T\>

```rust
pub fn to<T>(self: DeclDO) -> <any>;
```
## DeclDO::key\_neq

```rust
pub fn key_neq(self: DeclDO, object: <any>) -> bool;
```
## DeclDO::key\_eq

```rust
pub fn key_eq(self: DeclDO, object: <any>) -> bool;
```
## DeclDO::to\_set

```rust
pub fn to_set(self: DeclDO) -> *DeclDO;
```
