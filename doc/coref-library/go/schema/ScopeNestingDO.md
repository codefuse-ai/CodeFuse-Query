# ScopeNestingDO

Primary key: `oid: int`

```rust
schema ScopeNestingDO {
  outer: int,
  inner: int,
  @primary oid: int,
}
```
## ScopeNestingDO::getOuter

```rust
/**
     * @brief gets the outer of this element.
     * @return int
     */
```
```rust
pub fn getOuter(self: ScopeNestingDO) -> int;
```
## ScopeNestingDO::getInner

```rust
/**
     * @brief gets the inner of this element.
     * @return int
     */
```
```rust
pub fn getInner(self: ScopeNestingDO) -> int;
```
## ScopeNestingDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ScopeNestingDO;
```
## ScopeNestingDO::is\<T\>

```rust
pub fn is<T>(self: ScopeNestingDO) -> bool;
```
## ScopeNestingDO::to\<T\>

```rust
pub fn to<T>(self: ScopeNestingDO) -> <any>;
```
## ScopeNestingDO::key\_neq

```rust
pub fn key_neq(self: ScopeNestingDO, object: <any>) -> bool;
```
## ScopeNestingDO::key\_eq

```rust
pub fn key_eq(self: ScopeNestingDO, object: <any>) -> bool;
```
## ScopeNestingDO::to\_set

```rust
pub fn to_set(self: ScopeNestingDO) -> *ScopeNestingDO;
```
