# FalseBooleanCompletion

Primary key: `id: int`

```rust
schema FalseBooleanCompletion {
  name: string,
  @primary id: int,
}
```
## FalseBooleanCompletion::isFalse

```rust
pub fn isFalse(self: FalseBooleanCompletion) -> bool;
```
## FalseBooleanCompletion::getValue

```rust
pub fn getValue(self: FalseBooleanCompletion) -> *int;
```
## FalseBooleanCompletion::getValueName

```rust
pub fn getValueName(self: FalseBooleanCompletion) -> string;
```
## FalseBooleanCompletion::isTrue

```rust
pub fn isTrue(self: FalseBooleanCompletion) -> bool;
```
## FalseBooleanCompletion::getName

```rust
pub fn getName(self: FalseBooleanCompletion) -> string;
```
## FalseBooleanCompletion::\_\_all\_\_

```rust
pub fn __all__() -> *FalseBooleanCompletion;
```
## FalseBooleanCompletion::is\<T\>

```rust
pub fn is<T>(self: FalseBooleanCompletion) -> bool;
```
## FalseBooleanCompletion::to\<T\>

```rust
pub fn to<T>(self: FalseBooleanCompletion) -> <any>;
```
## FalseBooleanCompletion::key\_neq

```rust
pub fn key_neq(self: FalseBooleanCompletion, object: <any>) -> bool;
```
## FalseBooleanCompletion::key\_eq

```rust
pub fn key_eq(self: FalseBooleanCompletion, object: <any>) -> bool;
```
## FalseBooleanCompletion::to\_set

```rust
pub fn to_set(self: FalseBooleanCompletion) -> *FalseBooleanCompletion;
```
