# NewExpressionDO

Primary key: `element_hash_id: int`

```rust
schema NewExpressionDO {
  type_hash_id: int,
  reference_hash_id: int,
  @primary element_hash_id: int,
}
```
## NewExpressionDO::getReferenceHashId

```rust
/**
     * @brief gets the reference hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceHashId(self: NewExpressionDO) -> int;
```
## NewExpressionDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: NewExpressionDO) -> int;
```
## NewExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NewExpressionDO;
```
## NewExpressionDO::is\<T\>

```rust
pub fn is<T>(self: NewExpressionDO) -> bool;
```
## NewExpressionDO::to\<T\>

```rust
pub fn to<T>(self: NewExpressionDO) -> <any>;
```
## NewExpressionDO::key\_neq

```rust
pub fn key_neq(self: NewExpressionDO, object: <any>) -> bool;
```
## NewExpressionDO::key\_eq

```rust
pub fn key_eq(self: NewExpressionDO, object: <any>) -> bool;
```
## NewExpressionDO::to\_set

```rust
pub fn to_set(self: NewExpressionDO) -> *NewExpressionDO;
```
