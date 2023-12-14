# CallableBindingDO

Primary key: `caller_oid: int`

```rust
schema CallableBindingDO {
  callee_oid: int,
  @primary caller_oid: int,
}
```
## CallableBindingDO::getCalleeOid

```rust
/**
     * @brief gets the callee oid of this element.
     * @return int
     */
```
```rust
pub fn getCalleeOid(self: CallableBindingDO) -> int;
```
## CallableBindingDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CallableBindingDO;
```
## CallableBindingDO::is\<T\>

```rust
pub fn is<T>(self: CallableBindingDO) -> bool;
```
## CallableBindingDO::to\<T\>

```rust
pub fn to<T>(self: CallableBindingDO) -> <any>;
```
## CallableBindingDO::key\_neq

```rust
pub fn key_neq(self: CallableBindingDO, object: <any>) -> bool;
```
## CallableBindingDO::key\_eq

```rust
pub fn key_eq(self: CallableBindingDO, object: <any>) -> bool;
```
## CallableBindingDO::to\_set

```rust
pub fn to_set(self: CallableBindingDO) -> *CallableBindingDO;
```
