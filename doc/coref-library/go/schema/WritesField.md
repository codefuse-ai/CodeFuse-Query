# WritesField

Primary key: `id: int`

```rust
schema WritesField {
  @primary id: int,
}
```
## WritesField::getBaseName

```rust
// selectorExpr
```
```rust
pub fn getBaseName(self: WritesField) -> string;
```
## WritesField::getBelongsWritable

```rust
pub fn getBelongsWritable(self: WritesField) -> Writable;
```
## WritesField::getFieldName

```rust
// selectorExpr
```
```rust
pub fn getFieldName(self: WritesField) -> string;
```
## WritesField::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *WritesField;
```
## WritesField::is\<T\>

```rust
pub fn is<T>(self: WritesField) -> bool;
```
## WritesField::to\<T\>

```rust
pub fn to<T>(self: WritesField) -> <any>;
```
## WritesField::key\_neq

```rust
pub fn key_neq(self: WritesField, object: <any>) -> bool;
```
## WritesField::key\_eq

```rust
pub fn key_eq(self: WritesField, object: <any>) -> bool;
```
## WritesField::to\_set

```rust
pub fn to_set(self: WritesField) -> *WritesField;
```
