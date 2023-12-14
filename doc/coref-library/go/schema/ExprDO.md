# ExprDO

Primary key: `oid: int`

```rust
schema ExprDO {
  parent_id: int,
  kind: int,
  debug_info: string,
  file_id: int,
  idx: int,
  @primary oid: int,
}
```
## ExprDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: ExprDO) -> string;
```
## ExprDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: ExprDO) -> int;
```
## ExprDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: ExprDO) -> int;
```
## ExprDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: ExprDO) -> int;
```
## ExprDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: ExprDO) -> int;
```
## ExprDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ExprDO;
```
## ExprDO::is\<T\>

```rust
pub fn is<T>(self: ExprDO) -> bool;
```
## ExprDO::to\<T\>

```rust
pub fn to<T>(self: ExprDO) -> <any>;
```
## ExprDO::key\_neq

```rust
pub fn key_neq(self: ExprDO, object: <any>) -> bool;
```
## ExprDO::key\_eq

```rust
pub fn key_eq(self: ExprDO, object: <any>) -> bool;
```
## ExprDO::to\_set

```rust
pub fn to_set(self: ExprDO) -> *ExprDO;
```
