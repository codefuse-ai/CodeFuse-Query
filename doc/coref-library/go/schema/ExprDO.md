# ExprDO

Primary key: `oid: int`

```rust
schema ExprDO {
  parent_id: int,
  kind: int,
  debug_info: string,
  file_id: int,
  idx: int,
  @primary oid: int
}
```
## ExprDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: ExprDO) -> string;
```
## ExprDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: ExprDO) -> int;
```
## ExprDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: ExprDO) -> int;
```
## ExprDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: ExprDO) -> int;
```
## ExprDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: ExprDO) -> int;
```
## ExprDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ExprDO;
```
