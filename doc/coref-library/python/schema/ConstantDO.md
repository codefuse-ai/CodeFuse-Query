# ConstantDO

Primary key: `element_oid: int`

```rust
schema ConstantDO {
  value: string,
  @primary element_oid: int,
}
```
## ConstantDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: ConstantDO) -> string;
```
## ConstantDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ConstantDO;
```
## ConstantDO::is\<T\>

```rust
pub fn is<T>(self: ConstantDO) -> bool;
```
## ConstantDO::to\<T\>

```rust
pub fn to<T>(self: ConstantDO) -> <any>;
```
## ConstantDO::key\_neq

```rust
pub fn key_neq(self: ConstantDO, object: <any>) -> bool;
```
## ConstantDO::key\_eq

```rust
pub fn key_eq(self: ConstantDO, object: <any>) -> bool;
```
## ConstantDO::to\_set

```rust
pub fn to_set(self: ConstantDO) -> *ConstantDO;
```
