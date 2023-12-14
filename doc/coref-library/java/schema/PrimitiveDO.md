# PrimitiveDO

Primary key: `oid: int`

```rust
schema PrimitiveDO {
  name: string,
  @primary oid: int,
}
```
## PrimitiveDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: PrimitiveDO) -> string;
```
## PrimitiveDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *PrimitiveDO;
```
## PrimitiveDO::is\<T\>

```rust
pub fn is<T>(self: PrimitiveDO) -> bool;
```
## PrimitiveDO::to\<T\>

```rust
pub fn to<T>(self: PrimitiveDO) -> <any>;
```
## PrimitiveDO::key\_neq

```rust
pub fn key_neq(self: PrimitiveDO, object: <any>) -> bool;
```
## PrimitiveDO::key\_eq

```rust
pub fn key_eq(self: PrimitiveDO, object: <any>) -> bool;
```
## PrimitiveDO::to\_set

```rust
pub fn to_set(self: PrimitiveDO) -> *PrimitiveDO;
```
