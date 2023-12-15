# FieldsDO

Primary key: `oid: int`

```rust
schema FieldsDO {
  kind: int,
  parent_id: int,
  idx: int,
  @primary oid: int
}
```
## FieldsDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: FieldsDO) -> int;
```
## FieldsDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: FieldsDO) -> int;
```
## FieldsDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: FieldsDO) -> int;
```
## FieldsDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FieldsDO;
```
