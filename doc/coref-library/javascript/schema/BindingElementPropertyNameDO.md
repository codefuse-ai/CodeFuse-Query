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

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementPropertyNameDO;
```
## BindingElementPropertyNameDO::is\<T\>

```rust
pub fn is<T>(self: BindingElementPropertyNameDO) -> bool;
```
## BindingElementPropertyNameDO::to\<T\>

```rust
pub fn to<T>(self: BindingElementPropertyNameDO) -> <any>;
```
## BindingElementPropertyNameDO::key\_neq

```rust
pub fn key_neq(self: BindingElementPropertyNameDO, object: <any>) -> bool;
```
## BindingElementPropertyNameDO::key\_eq

```rust
pub fn key_eq(self: BindingElementPropertyNameDO, object: <any>) -> bool;
```
## BindingElementPropertyNameDO::to\_set

```rust
pub fn to_set(self: BindingElementPropertyNameDO) -> *BindingElementPropertyNameDO;
```
