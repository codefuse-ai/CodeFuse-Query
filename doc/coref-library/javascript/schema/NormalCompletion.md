# NormalCompletion

Primary key: `id: int`

```rust
schema NormalCompletion {
  @primary id: int,
  name: string,
}
```
## NormalCompletion::getValue

```rust
pub fn getValue(self: NormalCompletion) -> int;
```
## NormalCompletion::getName

```rust
pub fn getName(self: NormalCompletion) -> string;
```
## NormalCompletion::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__() -> *NormalCompletion;
```
