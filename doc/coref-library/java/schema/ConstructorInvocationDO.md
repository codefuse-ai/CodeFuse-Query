# ConstructorInvocationDO

Primary key: `element_hash_id: int`

```rust
schema ConstructorInvocationDO {
  class_reference_hash_id: int,
  @primary element_hash_id: int,
}
```
## ConstructorInvocationDO::getClassReferenceHashId

```rust
/**
     * @brief gets the class reference hash id of this element.
     * @return int
     */
```
```rust
pub fn getClassReferenceHashId(self: ConstructorInvocationDO) -> int;
```
## ConstructorInvocationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConstructorInvocationDO;
```
## ConstructorInvocationDO::is\<T\>

```rust
pub fn is<T>(self: ConstructorInvocationDO) -> bool;
```
## ConstructorInvocationDO::to\<T\>

```rust
pub fn to<T>(self: ConstructorInvocationDO) -> <any>;
```
## ConstructorInvocationDO::key\_neq

```rust
pub fn key_neq(self: ConstructorInvocationDO, object: <any>) -> bool;
```
## ConstructorInvocationDO::key\_eq

```rust
pub fn key_eq(self: ConstructorInvocationDO, object: <any>) -> bool;
```
## ConstructorInvocationDO::to\_set

```rust
pub fn to_set(self: ConstructorInvocationDO) -> *ConstructorInvocationDO;
```
