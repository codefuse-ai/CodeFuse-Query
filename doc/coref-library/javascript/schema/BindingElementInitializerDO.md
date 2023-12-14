# BindingElementInitializerDO

Primary key: `oid: int`

```rust
schema BindingElementInitializerDO {
  initializer_oid: int,
  @primary oid: int,
}
```
## BindingElementInitializerDO::getInitializerOid

```rust
pub fn getInitializerOid(self: BindingElementInitializerDO) -> int;
```
## BindingElementInitializerDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElementInitializerDO;
```
## BindingElementInitializerDO::is\<T\>

```rust
pub fn is<T>(self: BindingElementInitializerDO) -> bool;
```
## BindingElementInitializerDO::to\<T\>

```rust
pub fn to<T>(self: BindingElementInitializerDO) -> <any>;
```
## BindingElementInitializerDO::key\_neq

```rust
pub fn key_neq(self: BindingElementInitializerDO, object: <any>) -> bool;
```
## BindingElementInitializerDO::key\_eq

```rust
pub fn key_eq(self: BindingElementInitializerDO, object: <any>) -> bool;
```
## BindingElementInitializerDO::to\_set

```rust
pub fn to_set(self: BindingElementInitializerDO) -> *BindingElementInitializerDO;
```
