# TrueBooleanCompletion

Primary key: `id: int`

```rust
schema TrueBooleanCompletion {
  name: string,
  @primary id: int,
}
```
## TrueBooleanCompletion::isFalse

```rust
pub fn isFalse(self: TrueBooleanCompletion) -> bool;
```
## TrueBooleanCompletion::getValue

```rust
pub fn getValue(self: TrueBooleanCompletion) -> *int;
```
## TrueBooleanCompletion::getValueName

```rust
pub fn getValueName(self: TrueBooleanCompletion) -> string;
```
## TrueBooleanCompletion::isTrue

```rust
pub fn isTrue(self: TrueBooleanCompletion) -> bool;
```
## TrueBooleanCompletion::getName

```rust
pub fn getName(self: TrueBooleanCompletion) -> string;
```
## TrueBooleanCompletion::\_\_all\_\_

```rust
pub fn __all__() -> *TrueBooleanCompletion;
```
## TrueBooleanCompletion::is\<T\>

```rust
pub fn is<T>(self: TrueBooleanCompletion) -> bool;
```
## TrueBooleanCompletion::to\<T\>

```rust
pub fn to<T>(self: TrueBooleanCompletion) -> <any>;
```
## TrueBooleanCompletion::key\_neq

```rust
pub fn key_neq(self: TrueBooleanCompletion, object: <any>) -> bool;
```
## TrueBooleanCompletion::key\_eq

```rust
pub fn key_eq(self: TrueBooleanCompletion, object: <any>) -> bool;
```
## TrueBooleanCompletion::to\_set

```rust
pub fn to_set(self: TrueBooleanCompletion) -> *TrueBooleanCompletion;
```
