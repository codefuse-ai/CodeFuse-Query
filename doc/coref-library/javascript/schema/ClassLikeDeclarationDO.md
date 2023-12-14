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

```rust
pub fn __all__(db: JavascriptDB) -> *ClassLikeDeclarationDO;
```
## ClassLikeDeclarationDO::is\<T\>

```rust
pub fn is<T>(self: ClassLikeDeclarationDO) -> bool;
```
## ClassLikeDeclarationDO::to\<T\>

```rust
pub fn to<T>(self: ClassLikeDeclarationDO) -> <any>;
```
## ClassLikeDeclarationDO::key\_neq

```rust
pub fn key_neq(self: ClassLikeDeclarationDO, object: <any>) -> bool;
```
## ClassLikeDeclarationDO::key\_eq

```rust
pub fn key_eq(self: ClassLikeDeclarationDO, object: <any>) -> bool;
```
## ClassLikeDeclarationDO::to\_set

```rust
pub fn to_set(self: ClassLikeDeclarationDO) -> *ClassLikeDeclarationDO;
```
