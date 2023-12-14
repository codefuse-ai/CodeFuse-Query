# CallSite

Primary key: `invoke_expression_oid: int`

```rust
schema CallSite {
  @primary invoke_expression_oid: int,
  callee_oid: int,
}
```
## CallSite::getCalleeOid

```rust
pub fn getCalleeOid(self: CallSite) -> int;
```
## CallSite::getCallee

```rust
pub fn getCallee(self: CallSite) -> FunctionLikeDeclaration;
```
## CallSite::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CallSite;
```
