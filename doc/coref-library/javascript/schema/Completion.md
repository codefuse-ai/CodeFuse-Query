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

```rust
pub fn __all__() -> *Completion;
```
## Completion::is\<T\>

```rust
pub fn is<T>(self: Completion) -> bool;
```
## Completion::to\<T\>

```rust
pub fn to<T>(self: Completion) -> <any>;
```
## Completion::key\_neq

```rust
pub fn key_neq(self: Completion, object: <any>) -> bool;
```
## Completion::key\_eq

```rust
pub fn key_eq(self: Completion, object: <any>) -> bool;
```
## Completion::to\_set

```rust
pub fn to_set(self: Completion) -> *Completion;
```
