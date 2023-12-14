# DefDO

Primary key: `oid: int`

```rust
schema DefDO {
  object: int,
  ident: int,
  @primary oid: int,
}
```
## DefDO::getObject

```rust
/**
     * @brief gets the object of this element.
     * @return int
     */
```
```rust
pub fn getObject(self: DefDO) -> int;
```
## DefDO::getIdent

```rust
/**
     * @brief gets the ident of this element.
     * @return int
     */
```
```rust
pub fn getIdent(self: DefDO) -> int;
```
## DefDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DefDO;
```
## DefDO::is\<T\>

```rust
pub fn is<T>(self: DefDO) -> bool;
```
## DefDO::to\<T\>

```rust
pub fn to<T>(self: DefDO) -> <any>;
```
## DefDO::key\_neq

```rust
pub fn key_neq(self: DefDO, object: <any>) -> bool;
```
## DefDO::key\_eq

```rust
pub fn key_eq(self: DefDO, object: <any>) -> bool;
```
## DefDO::to\_set

```rust
pub fn to_set(self: DefDO) -> *DefDO;
```
