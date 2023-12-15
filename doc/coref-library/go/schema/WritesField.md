# WritesField

Primary key: `id: int`

```rust
schema WritesField {
  @primary id: int
}
```
## WritesField::getBaseName

```rust
pub fn getBaseName(self: WritesField) -> string;
```
## WritesField::getBelongsWritable

```rust
pub fn getBelongsWritable(self: WritesField) -> Writable;
```
## WritesField::getFieldName

```rust
pub fn getFieldName(self: WritesField) -> string;
```
## WritesField::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *WritesField;
```
