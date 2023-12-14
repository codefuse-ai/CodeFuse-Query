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

```rust
pub fn __all__(db: JavascriptDB) -> *CallSite;
```
## CallSite::is\<T\>

```rust
pub fn is<T>(self: CallSite) -> bool;
```
## CallSite::to\<T\>

```rust
pub fn to<T>(self: CallSite) -> <any>;
```
## CallSite::key\_neq

```rust
pub fn key_neq(self: CallSite, object: <any>) -> bool;
```
## CallSite::key\_eq

```rust
pub fn key_eq(self: CallSite, object: <any>) -> bool;
```
## CallSite::to\_set

```rust
pub fn to_set(self: CallSite) -> *CallSite;
```
