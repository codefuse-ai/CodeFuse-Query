# ClassLikeDeclarationDO

Primary key: `oid: int`

```rust
schema ClassLikeDeclarationDO {
  name: string,
  kind: int,
  @primary oid: int,
}
```
## ClassLikeDeclarationDO::getKind

```rust
pub fn getKind(self: ClassLikeDeclarationDO) -> int;
```
## ClassLikeDeclarationDO::getName

```rust
pub fn getName(self: ClassLikeDeclarationDO) -> string;
```
## ClassLikeDeclarationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassLikeDeclarationDO;
```
