# MethodHostDO

Primary key: `oid: int`

```rust
schema MethodHostDO {
  method: int,
  host: int,
  @primary oid: int,
}
```
## MethodHostDO::getHost

```rust
/**
     * @brief gets the host of this element.
     * @return int
     */
```
```rust
pub fn getHost(self: MethodHostDO) -> int;
```
## MethodHostDO::getMethod

```rust
/**
     * @brief gets the method of this element.
     * @return int
     */
```
```rust
pub fn getMethod(self: MethodHostDO) -> int;
```
## MethodHostDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *MethodHostDO;
```
## MethodHostDO::is\<T\>

```rust
pub fn is<T>(self: MethodHostDO) -> bool;
```
## MethodHostDO::to\<T\>

```rust
pub fn to<T>(self: MethodHostDO) -> <any>;
```
## MethodHostDO::key\_neq

```rust
pub fn key_neq(self: MethodHostDO, object: <any>) -> bool;
```
## MethodHostDO::key\_eq

```rust
pub fn key_eq(self: MethodHostDO, object: <any>) -> bool;
```
## MethodHostDO::to\_set

```rust
pub fn to_set(self: MethodHostDO) -> *MethodHostDO;
```
