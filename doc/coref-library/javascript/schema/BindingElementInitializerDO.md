# BindingElementInitializerDO

Primary key: `oid: int`

```rust
schema BindingElementInitializerDO {
  initializer_oid: int,
  @primary oid: int
}
```
## BindingElementInitializerDO::getInitializerOid

```rust
pub fn getInitializerOid(self: BindingElementInitializerDO) -> int;
```
## BindingElementInitializerDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementInitializerDO;
```
