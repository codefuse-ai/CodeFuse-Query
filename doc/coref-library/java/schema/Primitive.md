# Primitive

Primary key: `oid: int`

```rust
schema Primitive {
  @primary oid: int,
  name: string,
}
```
## Primitive::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Primitive) -> string;
```
## Primitive::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Primitive;
```
## Primitive::is\<T\>

```rust
pub fn is<T>(self: Primitive) -> bool;
```
## Primitive::to\<T\>

```rust
pub fn to<T>(self: Primitive) -> <any>;
```
## Primitive::key\_neq

```rust
pub fn key_neq(self: Primitive, object: <any>) -> bool;
```
## Primitive::key\_eq

```rust
pub fn key_eq(self: Primitive, object: <any>) -> bool;
```
## Primitive::to\_set

```rust
pub fn to_set(self: Primitive) -> *Primitive;
```
