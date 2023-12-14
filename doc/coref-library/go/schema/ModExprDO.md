# ModExprDO

Primary key: `oid: int`

```rust
schema ModExprDO {
  kind: int,
  idx: int,
  parent: int,
  @primary oid: int,
}
```
## ModExprDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: ModExprDO) -> int;
```
## ModExprDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: ModExprDO) -> int;
```
## ModExprDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: ModExprDO) -> int;
```
## ModExprDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ModExprDO;
```
