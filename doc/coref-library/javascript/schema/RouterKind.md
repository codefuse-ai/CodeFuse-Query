# RouterKind

Primary key: `id: int`

```rust
schema RouterKind {
  name: string,
  @primary id: int
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

Data constraint method.

```rust
pub fn __all__() -> *RouterKind;
```
