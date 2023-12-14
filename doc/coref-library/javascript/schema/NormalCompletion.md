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

```rust
pub fn __all__() -> *NormalCompletion;
```
## NormalCompletion::is\<T\>

```rust
pub fn is<T>(self: NormalCompletion) -> bool;
```
## NormalCompletion::to\<T\>

```rust
pub fn to<T>(self: NormalCompletion) -> <any>;
```
## NormalCompletion::key\_neq

```rust
pub fn key_neq(self: NormalCompletion, object: <any>) -> bool;
```
## NormalCompletion::key\_eq

```rust
pub fn key_eq(self: NormalCompletion, object: <any>) -> bool;
```
## NormalCompletion::to\_set

```rust
pub fn to_set(self: NormalCompletion) -> *NormalCompletion;
```
