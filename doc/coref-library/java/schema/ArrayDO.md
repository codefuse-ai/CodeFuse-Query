# ArrayDO

Primary key: `element_hash_id: int`

```rust
schema ArrayDO {
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ArrayDO) -> string;
```
## ArrayDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayDO;
```
## ArrayDO::is\<T\>

```rust
pub fn is<T>(self: ArrayDO) -> bool;
```
## ArrayDO::to\<T\>

```rust
pub fn to<T>(self: ArrayDO) -> <any>;
```
## ArrayDO::key\_neq

```rust
pub fn key_neq(self: ArrayDO, object: <any>) -> bool;
```
## ArrayDO::key\_eq

```rust
pub fn key_eq(self: ArrayDO, object: <any>) -> bool;
```
## ArrayDO::to\_set

```rust
pub fn to_set(self: ArrayDO) -> *ArrayDO;
```
