# ScopeDO

Primary key: `oid: int`

```rust
schema ScopeDO {
  debug_info: string,
  kind: int,
  @primary oid: int,
}
```
## ScopeDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: ScopeDO) -> string;
```
## ScopeDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: ScopeDO) -> int;
```
## ScopeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ScopeDO;
```
