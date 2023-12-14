# BindingElementPropertyNameDO

Primary key: `oid: int`

```rust
schema BindingElementPropertyNameDO {
  property_name_oid: int,
  @primary oid: int,
}
```
## BindingElementPropertyNameDO::getPropertyNameOid

```rust
pub fn getPropertyNameOid(self: BindingElementPropertyNameDO) -> int;
```
## BindingElementPropertyNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementPropertyNameDO;
```
