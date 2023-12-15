# CallSiteDO

Primary key: `invoke_expression_oid: int`

```rust
schema CallSiteDO {
  callee_oid: int,
  @primary invoke_expression_oid: int
}
```
## CallSiteDO::getCalleeOid

```rust
pub fn getCalleeOid(self: CallSiteDO) -> int;
```
## CallSiteDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CallSiteDO;
```
