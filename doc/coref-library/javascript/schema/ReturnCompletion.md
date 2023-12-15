# ReturnCompletion

Inherit from [Completion](./Completion.md)

Primary key: `id: int`

```rust
schema ReturnCompletion extends Completion {
  @primary id: int,
  name: string
}
```
## ReturnCompletion::getValue

```rust
pub fn getValue(self: ReturnCompletion) -> int;
```
## ReturnCompletion::getName

```rust
pub fn getName(self: ReturnCompletion) -> string;
```
## ReturnCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *ReturnCompletion;
```
