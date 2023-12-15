# FunctionLikeDeclarationDO

Primary key: `oid: int`

```rust
schema FunctionLikeDeclarationDO {
  name: string,
  kind: int,
  @primary oid: int
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionLikeDeclarationDO;
```
