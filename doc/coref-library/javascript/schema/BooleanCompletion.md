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

Data constraint method.

```rust
pub fn __all__() -> *BooleanCompletion;
```
