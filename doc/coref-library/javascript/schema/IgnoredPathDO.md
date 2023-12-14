# IgnoredPathDO

Primary key: `oid: int`

```rust
schema IgnoredPathDO {
  ignore_kind: int,
  path: string,
  path_kind: int,
  @primary oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *IgnoredPathDO;
```
## IgnoredPathDO::is\<T\>

```rust
pub fn is<T>(self: IgnoredPathDO) -> bool;
```
## IgnoredPathDO::to\<T\>

```rust
pub fn to<T>(self: IgnoredPathDO) -> <any>;
```
## IgnoredPathDO::key\_neq

```rust
pub fn key_neq(self: IgnoredPathDO, object: <any>) -> bool;
```
## IgnoredPathDO::key\_eq

```rust
pub fn key_eq(self: IgnoredPathDO, object: <any>) -> bool;
```
## IgnoredPathDO::to\_set

```rust
pub fn to_set(self: IgnoredPathDO) -> *IgnoredPathDO;
```
