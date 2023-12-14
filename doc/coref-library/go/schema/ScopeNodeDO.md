# ScopeNodeDO

Primary key: `oid: int`

```rust
schema ScopeNodeDO {
  scope: int,
  node: int,
  @primary oid: int,
}
```
## ScopeNodeDO::getScope

```rust
/**
     * @brief gets the scope of this element.
     * @return int
     */
```
```rust
pub fn getScope(self: ScopeNodeDO) -> int;
```
## ScopeNodeDO::getNode

```rust
/**
     * @brief gets the node of this element.
     * @return int
     */
```
```rust
pub fn getNode(self: ScopeNodeDO) -> int;
```
## ScopeNodeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ScopeNodeDO;
```
## ScopeNodeDO::is\<T\>

```rust
pub fn is<T>(self: ScopeNodeDO) -> bool;
```
## ScopeNodeDO::to\<T\>

```rust
pub fn to<T>(self: ScopeNodeDO) -> <any>;
```
## ScopeNodeDO::key\_neq

```rust
pub fn key_neq(self: ScopeNodeDO, object: <any>) -> bool;
```
## ScopeNodeDO::key\_eq

```rust
pub fn key_eq(self: ScopeNodeDO, object: <any>) -> bool;
```
## ScopeNodeDO::to\_set

```rust
pub fn to_set(self: ScopeNodeDO) -> *ScopeNodeDO;
```
