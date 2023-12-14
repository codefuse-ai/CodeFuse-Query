# FunctionLikeDeclarationDO

Primary key: `oid: int`

```rust
schema FunctionLikeDeclarationDO {
  name: string,
  kind: int,
  @primary oid: int,
}
```
## FunctionLikeDeclarationDO::getKind

```rust
pub fn getKind(self: FunctionLikeDeclarationDO) -> int;
```
## FunctionLikeDeclarationDO::getName

```rust
pub fn getName(self: FunctionLikeDeclarationDO) -> string;
```
## FunctionLikeDeclarationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionLikeDeclarationDO;
```
## FunctionLikeDeclarationDO::is\<T\>

```rust
pub fn is<T>(self: FunctionLikeDeclarationDO) -> bool;
```
## FunctionLikeDeclarationDO::to\<T\>

```rust
pub fn to<T>(self: FunctionLikeDeclarationDO) -> <any>;
```
## FunctionLikeDeclarationDO::key\_neq

```rust
pub fn key_neq(self: FunctionLikeDeclarationDO, object: <any>) -> bool;
```
## FunctionLikeDeclarationDO::key\_eq

```rust
pub fn key_eq(self: FunctionLikeDeclarationDO, object: <any>) -> bool;
```
## FunctionLikeDeclarationDO::to\_set

```rust
pub fn to_set(self: FunctionLikeDeclarationDO) -> *FunctionLikeDeclarationDO;
```
