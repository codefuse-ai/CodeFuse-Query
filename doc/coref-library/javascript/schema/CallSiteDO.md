# CallSiteDO

Primary key: `invoke_expression_oid: int`

```rust
schema CallSiteDO {
  callee_oid: int,
  @primary invoke_expression_oid: int,
}
```
## CallSiteDO::getCalleeOid

```rust
pub fn getCalleeOid(self: CallSiteDO) -> int;
```
## CallSiteDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CallSiteDO;
```
## CallSiteDO::is\<T\>

```rust
pub fn is<T>(self: CallSiteDO) -> bool;
```
## CallSiteDO::to\<T\>

```rust
pub fn to<T>(self: CallSiteDO) -> <any>;
```
## CallSiteDO::key\_neq

```rust
pub fn key_neq(self: CallSiteDO, object: <any>) -> bool;
```
## CallSiteDO::key\_eq

```rust
pub fn key_eq(self: CallSiteDO, object: <any>) -> bool;
```
## CallSiteDO::to\_set

```rust
pub fn to_set(self: CallSiteDO) -> *CallSiteDO;
```
