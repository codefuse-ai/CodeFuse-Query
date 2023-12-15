# ModifierDO

Primary key: `oid: int`

```rust
schema ModifierDO {
  index: int,
  @primary oid: int
}
```
## ModifierDO::getIndex

```rust
pub fn getIndex(self: ModifierDO) -> int;
```
## ModifierDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ModifierDO;
```
