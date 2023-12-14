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

```rust
pub fn __all__() -> *BreakCompletion;
```
## BreakCompletion::is\<T\>

```rust
pub fn is<T>(self: BreakCompletion) -> bool;
```
## BreakCompletion::to\<T\>

```rust
pub fn to<T>(self: BreakCompletion) -> <any>;
```
## BreakCompletion::key\_neq

```rust
pub fn key_neq(self: BreakCompletion, object: <any>) -> bool;
```
## BreakCompletion::key\_eq

```rust
pub fn key_eq(self: BreakCompletion, object: <any>) -> bool;
```
## BreakCompletion::to\_set

```rust
pub fn to_set(self: BreakCompletion) -> *BreakCompletion;
```
