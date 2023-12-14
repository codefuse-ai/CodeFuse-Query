# ReturnCompletion

Primary key: `id: int`

```rust
schema ReturnCompletion {
  @primary id: int,
  name: string,
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

```rust
pub fn __all__() -> *ReturnCompletion;
```
## ReturnCompletion::is\<T\>

```rust
pub fn is<T>(self: ReturnCompletion) -> bool;
```
## ReturnCompletion::to\<T\>

```rust
pub fn to<T>(self: ReturnCompletion) -> <any>;
```
## ReturnCompletion::key\_neq

```rust
pub fn key_neq(self: ReturnCompletion, object: <any>) -> bool;
```
## ReturnCompletion::key\_eq

```rust
pub fn key_eq(self: ReturnCompletion, object: <any>) -> bool;
```
## ReturnCompletion::to\_set

```rust
pub fn to_set(self: ReturnCompletion) -> *ReturnCompletion;
```
