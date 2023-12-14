# DeclarationStatementDO

Primary key: `id: int`

```rust
schema DeclarationStatementDO {
  @primary id: int,
}
```
## DeclarationStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DeclarationStatementDO;
```
## DeclarationStatementDO::is\<T\>

```rust
pub fn is<T>(self: DeclarationStatementDO) -> bool;
```
## DeclarationStatementDO::to\<T\>

```rust
pub fn to<T>(self: DeclarationStatementDO) -> <any>;
```
## DeclarationStatementDO::key\_neq

```rust
pub fn key_neq(self: DeclarationStatementDO, object: <any>) -> bool;
```
## DeclarationStatementDO::key\_eq

```rust
pub fn key_eq(self: DeclarationStatementDO, object: <any>) -> bool;
```
## DeclarationStatementDO::to\_set

```rust
pub fn to_set(self: DeclarationStatementDO) -> *DeclarationStatementDO;
```
