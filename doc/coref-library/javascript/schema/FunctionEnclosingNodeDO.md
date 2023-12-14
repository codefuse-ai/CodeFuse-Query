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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionEnclosingNodeDO;
```
