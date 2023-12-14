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

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementNameDO;
```
## BindingElementNameDO::is\<T\>

```rust
pub fn is<T>(self: BindingElementNameDO) -> bool;
```
## BindingElementNameDO::to\<T\>

```rust
pub fn to<T>(self: BindingElementNameDO) -> <any>;
```
## BindingElementNameDO::key\_neq

```rust
pub fn key_neq(self: BindingElementNameDO, object: <any>) -> bool;
```
## BindingElementNameDO::key\_eq

```rust
pub fn key_eq(self: BindingElementNameDO, object: <any>) -> bool;
```
## BindingElementNameDO::to\_set

```rust
pub fn to_set(self: BindingElementNameDO) -> *BindingElementNameDO;
```
