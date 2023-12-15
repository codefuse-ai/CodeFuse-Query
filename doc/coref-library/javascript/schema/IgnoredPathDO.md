# IgnoredPathDO

Primary key: `oid: int`

```rust
schema IgnoredPathDO {
  ignore_kind: int,
  path: string,
  path_kind: int,
  @primary oid: int
}
```
## IgnoredPathDO::getIgnoreKind

```rust
pub fn getIgnoreKind(self: IgnoredPathDO) -> int;
```
## IgnoredPathDO::getPath

```rust
pub fn getPath(self: IgnoredPathDO) -> string;
```
## IgnoredPathDO::getPathKind

```rust
pub fn getPathKind(self: IgnoredPathDO) -> int;
```
## IgnoredPathDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IgnoredPathDO;
```
