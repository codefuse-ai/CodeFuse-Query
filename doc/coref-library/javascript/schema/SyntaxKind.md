# SyntaxKind

Primary key: `id: int`

```rust
schema SyntaxKind {
  name: string,
  @primary id: int
}
```
## SyntaxKind::getName

```rust
pub fn getName(self: SyntaxKind) -> string;
```
## SyntaxKind::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *SyntaxKind;
```
