# ObjectScopeDO

Primary key: `oid: int`

```rust
schema ObjectScopeDO {
  scope: int,
  object: int,
  @primary oid: int,
}
```
## ObjectScopeDO::getScope

```rust
/**
     * @brief gets the scope of this element.
     * @return int
     */
```
```rust
pub fn getScope(self: ObjectScopeDO) -> int;
```
## ObjectScopeDO::getObject

```rust
/**
     * @brief gets the object of this element.
     * @return int
     */
```
```rust
pub fn getObject(self: ObjectScopeDO) -> int;
```
## ObjectScopeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ObjectScopeDO;
```
## ObjectScopeDO::is\<T\>

```rust
pub fn is<T>(self: ObjectScopeDO) -> bool;
```
## ObjectScopeDO::to\<T\>

```rust
pub fn to<T>(self: ObjectScopeDO) -> <any>;
```
## ObjectScopeDO::key\_neq

```rust
pub fn key_neq(self: ObjectScopeDO, object: <any>) -> bool;
```
## ObjectScopeDO::key\_eq

```rust
pub fn key_eq(self: ObjectScopeDO, object: <any>) -> bool;
```
## ObjectScopeDO::to\_set

```rust
pub fn to_set(self: ObjectScopeDO) -> *ObjectScopeDO;
```
