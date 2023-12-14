# TypeNameDO

Primary key: `oid: int`

```rust
schema TypeNameDO {
  name: string,
  @primary oid: int,
}
```
## TypeNameDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: TypeNameDO) -> string;
```
## TypeNameDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeNameDO;
```
## TypeNameDO::is\<T\>

```rust
pub fn is<T>(self: TypeNameDO) -> bool;
```
## TypeNameDO::to\<T\>

```rust
pub fn to<T>(self: TypeNameDO) -> <any>;
```
## TypeNameDO::key\_neq

```rust
pub fn key_neq(self: TypeNameDO, object: <any>) -> bool;
```
## TypeNameDO::key\_eq

```rust
pub fn key_eq(self: TypeNameDO, object: <any>) -> bool;
```
## TypeNameDO::to\_set

```rust
pub fn to_set(self: TypeNameDO) -> *TypeNameDO;
```
