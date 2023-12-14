# UsesDO

Primary key: `oid: int`

```rust
schema UsesDO {
  object: int,
  ident: int,
  @primary oid: int,
}
```
## UsesDO::getObject

```rust
/**
     * @brief gets the object of this element.
     * @return int
     */
```
```rust
pub fn getObject(self: UsesDO) -> int;
```
## UsesDO::getIdent

```rust
/**
     * @brief gets the ident of this element.
     * @return int
     */
```
```rust
pub fn getIdent(self: UsesDO) -> int;
```
## UsesDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *UsesDO;
```
## UsesDO::is\<T\>

```rust
pub fn is<T>(self: UsesDO) -> bool;
```
## UsesDO::to\<T\>

```rust
pub fn to<T>(self: UsesDO) -> <any>;
```
## UsesDO::key\_neq

```rust
pub fn key_neq(self: UsesDO, object: <any>) -> bool;
```
## UsesDO::key\_eq

```rust
pub fn key_eq(self: UsesDO, object: <any>) -> bool;
```
## UsesDO::to\_set

```rust
pub fn to_set(self: UsesDO) -> *UsesDO;
```
