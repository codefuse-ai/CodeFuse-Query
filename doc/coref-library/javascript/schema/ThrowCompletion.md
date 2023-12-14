# ThrowCompletion

Primary key: `id: int`

```rust
schema ThrowCompletion {
  @primary id: int,
  name: string,
}
```
## ThrowCompletion::getValue

```rust
pub fn getValue(self: ThrowCompletion) -> int;
```
## ThrowCompletion::getName

```rust
pub fn getName(self: ThrowCompletion) -> string;
```
## ThrowCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *ThrowCompletion;
```
