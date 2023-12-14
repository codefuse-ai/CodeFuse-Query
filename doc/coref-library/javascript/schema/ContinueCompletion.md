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

```rust
pub fn __all__() -> *ContinueCompletion;
```
## ContinueCompletion::is\<T\>

```rust
pub fn is<T>(self: ContinueCompletion) -> bool;
```
## ContinueCompletion::to\<T\>

```rust
pub fn to<T>(self: ContinueCompletion) -> <any>;
```
## ContinueCompletion::key\_neq

```rust
pub fn key_neq(self: ContinueCompletion, object: <any>) -> bool;
```
## ContinueCompletion::key\_eq

```rust
pub fn key_eq(self: ContinueCompletion, object: <any>) -> bool;
```
## ContinueCompletion::to\_set

```rust
pub fn to_set(self: ContinueCompletion) -> *ContinueCompletion;
```
