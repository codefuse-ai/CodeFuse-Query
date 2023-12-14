# BooleanCompletion

Primary key: `id: int`

```rust
schema BooleanCompletion {
  @primary id: int,
  name: string,
}
```
## BooleanCompletion::getValue

```rust
pub fn getValue(self: BooleanCompletion) -> *int;
```
## BooleanCompletion::getName

```rust
pub fn getName(self: BooleanCompletion) -> string;
```
## BooleanCompletion::isTrue

```rust
pub fn isTrue(self: BooleanCompletion) -> bool;
```
## BooleanCompletion::getValueName

```rust
pub fn getValueName(self: BooleanCompletion) -> string;
```
## BooleanCompletion::isFalse

```rust
pub fn isFalse(self: BooleanCompletion) -> bool;
```
## BooleanCompletion::\_\_all\_\_

```rust
pub fn __all__() -> *BooleanCompletion;
```
## BooleanCompletion::is\<T\>

```rust
pub fn is<T>(self: BooleanCompletion) -> bool;
```
## BooleanCompletion::to\<T\>

```rust
pub fn to<T>(self: BooleanCompletion) -> <any>;
```
## BooleanCompletion::key\_neq

```rust
pub fn key_neq(self: BooleanCompletion, object: <any>) -> bool;
```
## BooleanCompletion::key\_eq

```rust
pub fn key_eq(self: BooleanCompletion, object: <any>) -> bool;
```
## BooleanCompletion::to\_set

```rust
pub fn to_set(self: BooleanCompletion) -> *BooleanCompletion;
```
