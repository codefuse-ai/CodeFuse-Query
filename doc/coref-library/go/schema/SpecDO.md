# SpecDO

Primary key: `oid: int`

```rust
schema SpecDO {
  debug_info: string,
  parent_id: int,
  kind: int,
  idx: int,
  @primary oid: int,
}
```
## SpecDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: SpecDO) -> int;
```
## SpecDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: SpecDO) -> int;
```
## SpecDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: SpecDO) -> string;
```
## SpecDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: SpecDO) -> int;
```
## SpecDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *SpecDO;
```
