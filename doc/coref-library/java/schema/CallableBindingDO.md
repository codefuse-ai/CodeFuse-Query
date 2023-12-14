# CallableBindingDO

Primary key: `caller_hash_id: int`

```rust
schema CallableBindingDO {
  callee_hash_id: int,
  @primary caller_hash_id: int,
}
```
## CallableBindingDO::getCalleeHashId

```rust
/**
     * @brief gets the target callable id of this call.
     * @return int 
     */
```
```rust
pub fn getCalleeHashId(self: CallableBindingDO) -> int;
```
## CallableBindingDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableBindingDO;
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
