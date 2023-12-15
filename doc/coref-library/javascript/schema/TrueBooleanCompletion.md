# TrueBooleanCompletion

Inherit from [BooleanCompletion](./BooleanCompletion.md)

Primary key: `id: int`

```rust
schema TrueBooleanCompletion extends BooleanCompletion {
  name: string,
  @primary id: int
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

Data constraint method.

```rust
pub fn __all__() -> *TrueBooleanCompletion;
```
