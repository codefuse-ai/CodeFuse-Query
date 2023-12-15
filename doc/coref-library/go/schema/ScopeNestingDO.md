# ScopeNestingDO

Primary key: `oid: int`

```rust
schema ScopeNestingDO {
  outer: int,
  inner: int,
  @primary oid: int
}
```
## ScopeNestingDO::getOuter

```java
/**
* @brief gets the outer of this element.
* @return int
*/
```
```rust
pub fn getOuter(self: ScopeNestingDO) -> int;
```
## ScopeNestingDO::getInner

```java
/**
* @brief gets the inner of this element.
* @return int
*/
```
```rust
pub fn getInner(self: ScopeNestingDO) -> int;
```
## ScopeNestingDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ScopeNestingDO;
```
