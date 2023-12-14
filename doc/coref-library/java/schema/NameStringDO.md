# NameStringDO

Primary key: `parent_hash_id: int`

```rust
schema NameStringDO {
  name_element_hash_id: int,
  value_element_hash_id: int,
  @primary parent_hash_id: int,
}
```
## NameStringDO::getValueElementHashId

```rust
/**
     * @brief gets the value element hash id of this element.
     * @return int
     */
```
```rust
pub fn getValueElementHashId(self: NameStringDO) -> int;
```
## NameStringDO::getNameElementHashId

```rust
/**
     * @brief gets the name element hash id of this element.
     * @return int
     */
```
```rust
pub fn getNameElementHashId(self: NameStringDO) -> int;
```
## NameStringDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NameStringDO;
```
## NameStringDO::is\<T\>

```rust
pub fn is<T>(self: NameStringDO) -> bool;
```
## NameStringDO::to\<T\>

```rust
pub fn to<T>(self: NameStringDO) -> <any>;
```
## NameStringDO::key\_neq

```rust
pub fn key_neq(self: NameStringDO, object: <any>) -> bool;
```
## NameStringDO::key\_eq

```rust
pub fn key_eq(self: NameStringDO, object: <any>) -> bool;
```
## NameStringDO::to\_set

```rust
pub fn to_set(self: NameStringDO) -> *NameStringDO;
```
