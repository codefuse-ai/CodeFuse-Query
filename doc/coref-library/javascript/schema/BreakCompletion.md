# BreakCompletion

Primary key: `id: int`

```rust
schema BreakCompletion {
  @primary id: int,
  name: string,
}
```
## BreakCompletion::getValue

```rust
pub fn getValue(self: BreakCompletion) -> int;
```
## BreakCompletion::getName

```rust
pub fn getName(self: BreakCompletion) -> string;
```
## BreakCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *BreakCompletion;
```
