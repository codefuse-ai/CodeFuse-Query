# ModifierDO

Primary key: `oid: int`

```rust
schema ModifierDO {
  index: int,
  @primary oid: int,
}
```
## ModifierDO::getIndex

```rust
pub fn getIndex(self: ModifierDO) -> int;
```
## ModifierDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ModifierDO;
```
## ModifierDO::is\<T\>

```rust
pub fn is<T>(self: ModifierDO) -> bool;
```
## ModifierDO::to\<T\>

```rust
pub fn to<T>(self: ModifierDO) -> <any>;
```
## ModifierDO::key\_neq

```rust
pub fn key_neq(self: ModifierDO, object: <any>) -> bool;
```
## ModifierDO::key\_eq

```rust
pub fn key_eq(self: ModifierDO, object: <any>) -> bool;
```
## ModifierDO::to\_set

```rust
pub fn to_set(self: ModifierDO) -> *ModifierDO;
```
