# ContinueCompletion

Primary key: `id: int`

```rust
schema ContinueCompletion {
  @primary id: int,
  name: string,
}
```
## ContinueCompletion::getValue

```rust
pub fn getValue(self: ContinueCompletion) -> int;
```
## ContinueCompletion::getName

```rust
pub fn getName(self: ContinueCompletion) -> string;
```
## ContinueCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *ContinueCompletion;
```
