# TypeName

Primary key: `oid: int`

```rust
schema TypeName {
  @primary oid: int,
  name: string,
}
```
## TypeName::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: TypeName) -> string;
```
## TypeName::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeName;
```
## TypeName::is\<T\>

```rust
pub fn is<T>(self: TypeName) -> bool;
```
## TypeName::to\<T\>

```rust
pub fn to<T>(self: TypeName) -> <any>;
```
## TypeName::key\_neq

```rust
pub fn key_neq(self: TypeName, object: <any>) -> bool;
```
## TypeName::key\_eq

```rust
pub fn key_eq(self: TypeName, object: <any>) -> bool;
```
## TypeName::to\_set

```rust
pub fn to_set(self: TypeName) -> *TypeName;
```
