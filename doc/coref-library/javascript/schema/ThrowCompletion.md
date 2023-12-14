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

```rust
pub fn __all__() -> *ThrowCompletion;
```
## ThrowCompletion::is\<T\>

```rust
pub fn is<T>(self: ThrowCompletion) -> bool;
```
## ThrowCompletion::to\<T\>

```rust
pub fn to<T>(self: ThrowCompletion) -> <any>;
```
## ThrowCompletion::key\_neq

```rust
pub fn key_neq(self: ThrowCompletion, object: <any>) -> bool;
```
## ThrowCompletion::key\_eq

```rust
pub fn key_eq(self: ThrowCompletion, object: <any>) -> bool;
```
## ThrowCompletion::to\_set

```rust
pub fn to_set(self: ThrowCompletion) -> *ThrowCompletion;
```
