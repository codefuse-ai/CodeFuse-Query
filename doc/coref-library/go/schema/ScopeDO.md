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

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: ScopeDO) -> string;
```
## ScopeDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: ScopeDO) -> int;
```
## ScopeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ScopeDO;
```
## ScopeDO::is\<T\>

```rust
pub fn is<T>(self: ScopeDO) -> bool;
```
## ScopeDO::to\<T\>

```rust
pub fn to<T>(self: ScopeDO) -> <any>;
```
## ScopeDO::key\_neq

```rust
pub fn key_neq(self: ScopeDO, object: <any>) -> bool;
```
## ScopeDO::key\_eq

```rust
pub fn key_eq(self: ScopeDO, object: <any>) -> bool;
```
## ScopeDO::to\_set

```rust
pub fn to_set(self: ScopeDO) -> *ScopeDO;
```
