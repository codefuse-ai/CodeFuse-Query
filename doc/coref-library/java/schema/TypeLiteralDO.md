# TypeLiteralDO

Primary key: `element_hash_id: int`

```rust
schema TypeLiteralDO {
  type_hash_id: int,
  type_element_hash_id: int,
  @primary element_hash_id: int,
}
```
## TypeLiteralDO::getTypeElementHashId

```rust
/**
     * @brief gets the type element hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeElementHashId(self: TypeLiteralDO) -> int;
```
## TypeLiteralDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: TypeLiteralDO) -> int;
```
## TypeLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeLiteralDO;
```
## TypeLiteralDO::is\<T\>

```rust
pub fn is<T>(self: TypeLiteralDO) -> bool;
```
## TypeLiteralDO::to\<T\>

```rust
pub fn to<T>(self: TypeLiteralDO) -> <any>;
```
## TypeLiteralDO::key\_neq

```rust
pub fn key_neq(self: TypeLiteralDO, object: <any>) -> bool;
```
## TypeLiteralDO::key\_eq

```rust
pub fn key_eq(self: TypeLiteralDO, object: <any>) -> bool;
```
## TypeLiteralDO::to\_set

```rust
pub fn to_set(self: TypeLiteralDO) -> *TypeLiteralDO;
```
