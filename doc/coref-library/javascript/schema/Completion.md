# Completion

Primary key: `id: int`

```rust
schema Completion {
  name: string,
  @primary id: int,
}
```
## Completion::getValue

```rust
pub fn getValue(self: Completion) -> int;
```
## Completion::getName

```rust
pub fn getName(self: Completion) -> string;
```
## Completion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *Completion;
```
