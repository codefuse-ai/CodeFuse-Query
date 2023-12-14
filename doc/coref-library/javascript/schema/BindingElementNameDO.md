# BindingElementNameDO

Primary key: `oid: int`

```rust
schema BindingElementNameDO {
  name_oid: int,
  @primary oid: int,
}
```
## BindingElementNameDO::getNameOid

```rust
pub fn getNameOid(self: BindingElementNameDO) -> int;
```
## BindingElementNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementNameDO;
```
