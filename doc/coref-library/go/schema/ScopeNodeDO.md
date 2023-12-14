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

```java
/**
* @brief gets the scope of this element.
* @return int
*/
```
```rust
pub fn getScope(self: ScopeNodeDO) -> int;
```
## ScopeNodeDO::getNode

```java
/**
* @brief gets the node of this element.
* @return int
*/
```
```rust
pub fn getNode(self: ScopeNodeDO) -> int;
```
## ScopeNodeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ScopeNodeDO;
```
