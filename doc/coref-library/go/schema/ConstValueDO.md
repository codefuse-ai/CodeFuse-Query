# ConstValueDO

Primary key: `oid: int`

```rust
schema ConstValueDO {
  exact: string,
  value: string,
  expr: int,
  @primary oid: int,
}
```
## ConstValueDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: ConstValueDO) -> string;
```
## ConstValueDO::getExact

```rust
/**
     * @brief gets the exact of this element.
     * @return string
     */
```
```rust
pub fn getExact(self: ConstValueDO) -> string;
```
## ConstValueDO::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: ConstValueDO) -> int;
```
## ConstValueDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ConstValueDO;
```
## ConstValueDO::is\<T\>

```rust
pub fn is<T>(self: ConstValueDO) -> bool;
```
## ConstValueDO::to\<T\>

```rust
pub fn to<T>(self: ConstValueDO) -> <any>;
```
## ConstValueDO::key\_neq

```rust
pub fn key_neq(self: ConstValueDO, object: <any>) -> bool;
```
## ConstValueDO::key\_eq

```rust
pub fn key_eq(self: ConstValueDO, object: <any>) -> bool;
```
## ConstValueDO::to\_set

```rust
pub fn to_set(self: ConstValueDO) -> *ConstValueDO;
```
