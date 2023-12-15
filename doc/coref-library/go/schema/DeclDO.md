# DeclDO

Primary key: `oid: int`

```rust
schema DeclDO {
  parent_id: int,
  kind: int,
  debug_info: string,
  file_id: int,
  idx: int,
  @primary oid: int
}
```
## DeclDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: DeclDO) -> string;
```
## DeclDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: DeclDO) -> int;
```
## DeclDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: DeclDO) -> int;
```
## DeclDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: DeclDO) -> int;
```
## DeclDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: DeclDO) -> int;
```
## DeclDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *DeclDO;
```
