# YieldCompletion

Primary key: `id: int`

```rust
schema YieldCompletion {
  @primary id: int,
  name: string,
}
```
## YieldCompletion::getValue

```rust
pub fn getValue(self: YieldCompletion) -> int;
```
## YieldCompletion::getName

```rust
pub fn getName(self: YieldCompletion) -> string;
```
## YieldCompletion::\_\_all\_\_

```rust
pub fn __all__() -> *YieldCompletion;
```
## YieldCompletion::is\<T\>

```rust
pub fn is<T>(self: YieldCompletion) -> bool;
```
## YieldCompletion::to\<T\>

```rust
pub fn to<T>(self: YieldCompletion) -> <any>;
```
## YieldCompletion::key\_neq

```rust
pub fn key_neq(self: YieldCompletion, object: <any>) -> bool;
```
## YieldCompletion::key\_eq

```rust
pub fn key_eq(self: YieldCompletion, object: <any>) -> bool;
```
## YieldCompletion::to\_set

```rust
pub fn to_set(self: YieldCompletion) -> *YieldCompletion;
```
