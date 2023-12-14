# ArrayInitializerExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ArrayInitializerExpressionDO {
  type_hash_id: int,
  @primary element_hash_id: int,
}
```
## ArrayInitializerExpressionDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: ArrayInitializerExpressionDO) -> int;
```
## ArrayInitializerExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayInitializerExpressionDO;
```
## ArrayInitializerExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ArrayInitializerExpressionDO) -> bool;
```
## ArrayInitializerExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ArrayInitializerExpressionDO) -> <any>;
```
## ArrayInitializerExpressionDO::key\_neq

```rust
pub fn key_neq(self: ArrayInitializerExpressionDO, object: <any>) -> bool;
```
## ArrayInitializerExpressionDO::key\_eq

```rust
pub fn key_eq(self: ArrayInitializerExpressionDO, object: <any>) -> bool;
```
## ArrayInitializerExpressionDO::to\_set

```rust
pub fn to_set(self: ArrayInitializerExpressionDO) -> *ArrayInitializerExpressionDO;
```
