# FunctionEnclosingNodeDO

Primary key: `node_oid: int`

```rust
schema FunctionEnclosingNodeDO {
  function_oid: int,
  @primary node_oid: int,
}
```
## FunctionEnclosingNodeDO::getFunctionOid

```rust
pub fn getFunctionOid(self: FunctionEnclosingNodeDO) -> int;
```
## FunctionEnclosingNodeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionEnclosingNodeDO;
```
## FunctionEnclosingNodeDO::is\<T\>

```rust
pub fn is<T>(self: FunctionEnclosingNodeDO) -> bool;
```
## FunctionEnclosingNodeDO::to\<T\>

```rust
pub fn to<T>(self: FunctionEnclosingNodeDO) -> <any>;
```
## FunctionEnclosingNodeDO::key\_neq

```rust
pub fn key_neq(self: FunctionEnclosingNodeDO, object: <any>) -> bool;
```
## FunctionEnclosingNodeDO::key\_eq

```rust
pub fn key_eq(self: FunctionEnclosingNodeDO, object: <any>) -> bool;
```
## FunctionEnclosingNodeDO::to\_set

```rust
pub fn to_set(self: FunctionEnclosingNodeDO) -> *FunctionEnclosingNodeDO;
```
