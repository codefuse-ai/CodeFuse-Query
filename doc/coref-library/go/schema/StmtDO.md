# StmtDO

Primary key: `oid: int`

```rust
schema StmtDO {
  parent_id: int,
  kind: int,
  debug_info: string,
  file_id: int,
  idx: int,
  @primary oid: int,
}
```
## StmtDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: StmtDO) -> string;
```
## StmtDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: StmtDO) -> int;
```
## StmtDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: StmtDO) -> int;
```
## StmtDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: StmtDO) -> int;
```
## StmtDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: StmtDO) -> int;
```
## StmtDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *StmtDO;
```
## StmtDO::is\<T\>

```rust
pub fn is<T>(self: StmtDO) -> bool;
```
## StmtDO::to\<T\>

```rust
pub fn to<T>(self: StmtDO) -> <any>;
```
## StmtDO::key\_neq

```rust
pub fn key_neq(self: StmtDO, object: <any>) -> bool;
```
## StmtDO::key\_eq

```rust
pub fn key_eq(self: StmtDO, object: <any>) -> bool;
```
## StmtDO::to\_set

```rust
pub fn to_set(self: StmtDO) -> *StmtDO;
```
