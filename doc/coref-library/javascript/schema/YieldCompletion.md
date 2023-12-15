# YieldCompletion

Inherit from [Completion](./Completion.md)

Primary key: `id: int`

```rust
schema YieldCompletion extends Completion {
  @primary id: int,
  name: string
}
```
## YieldCompletion::getValue

```rust
pub fn getValue(self: YieldCompletion) -> int;
```
## YieldCompletion::getName

```rust
pub fn getName(self: YieldCompletion) -> string;
```
## YieldCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *YieldCompletion;
```
