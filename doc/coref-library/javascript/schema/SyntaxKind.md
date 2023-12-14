# SyntaxKind

Primary key: `id: int`

```rust
schema SyntaxKind {
  name: string,
  @primary id: int,
}
```
## SyntaxKind::getName

```rust
pub fn getName(self: SyntaxKind) -> string;
```
## SyntaxKind::\_\_all\_\_

```rust
pub fn __all__() -> *SyntaxKind;
```
## SyntaxKind::is\<T\>

```rust
pub fn is<T>(self: SyntaxKind) -> bool;
```
## SyntaxKind::to\<T\>

```rust
pub fn to<T>(self: SyntaxKind) -> <any>;
```
## SyntaxKind::key\_neq

```rust
pub fn key_neq(self: SyntaxKind, object: <any>) -> bool;
```
## SyntaxKind::key\_eq

```rust
pub fn key_eq(self: SyntaxKind, object: <any>) -> bool;
```
## SyntaxKind::to\_set

```rust
pub fn to_set(self: SyntaxKind) -> *SyntaxKind;
```
