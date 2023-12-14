# RouterKind

Primary key: `id: int`

```rust
schema RouterKind {
  name: string,
  @primary id: int,
}
```
## RouterKind::isNavigateTo

```rust
pub fn isNavigateTo(self: RouterKind) -> bool;
```
## RouterKind::isRedirectTo

```rust
pub fn isRedirectTo(self: RouterKind) -> bool;
```
## RouterKind::getValue

```rust
pub fn getValue(self: RouterKind) -> int;
```
## RouterKind::isReLaunch

```rust
pub fn isReLaunch(self: RouterKind) -> bool;
```
## RouterKind::isNavigateBack

```rust
pub fn isNavigateBack(self: RouterKind) -> bool;
```
## RouterKind::isSwitchTab

```rust
pub fn isSwitchTab(self: RouterKind) -> bool;
```
## RouterKind::getName

```rust
pub fn getName(self: RouterKind) -> string;
```
## RouterKind::\_\_all\_\_

```rust
pub fn __all__() -> *RouterKind;
```
## RouterKind::is\<T\>

```rust
pub fn is<T>(self: RouterKind) -> bool;
```
## RouterKind::to\<T\>

```rust
pub fn to<T>(self: RouterKind) -> <any>;
```
## RouterKind::key\_neq

```rust
pub fn key_neq(self: RouterKind, object: <any>) -> bool;
```
## RouterKind::key\_eq

```rust
pub fn key_eq(self: RouterKind, object: <any>) -> bool;
```
## RouterKind::to\_set

```rust
pub fn to_set(self: RouterKind) -> *RouterKind;
```
