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

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: StmtDO) -> string;
```
## StmtDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: StmtDO) -> int;
```
## StmtDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: StmtDO) -> int;
```
## StmtDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: StmtDO) -> int;
```
## StmtDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: StmtDO) -> int;
```
## StmtDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *StmtDO;
```
