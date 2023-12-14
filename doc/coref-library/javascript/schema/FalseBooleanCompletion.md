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

Data constraint method.

```rust
pub fn __all__() -> *FalseBooleanCompletion;
```
