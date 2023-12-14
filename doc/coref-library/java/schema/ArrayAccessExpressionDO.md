# ArrayAccessExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ArrayAccessExpressionDO {
  array_expression_hash_id: int,
  index_expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## ArrayAccessExpressionDO::getIndexExpressionHashId

```rust
/**
     * @brief gets the index expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getIndexExpressionHashId(self: ArrayAccessExpressionDO) -> int;
```
## ArrayAccessExpressionDO::getArrayExpressionHashId

```rust
/**
     * @brief gets the array expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getArrayExpressionHashId(self: ArrayAccessExpressionDO) -> int;
```
## ArrayAccessExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayAccessExpressionDO;
```
## ArrayAccessExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ArrayAccessExpressionDO) -> bool;
```
## ArrayAccessExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ArrayAccessExpressionDO) -> <any>;
```
## ArrayAccessExpressionDO::key\_neq

```rust
pub fn key_neq(self: ArrayAccessExpressionDO, object: <any>) -> bool;
```
## ArrayAccessExpressionDO::key\_eq

```rust
pub fn key_eq(self: ArrayAccessExpressionDO, object: <any>) -> bool;
```
## ArrayAccessExpressionDO::to\_set

```rust
pub fn to_set(self: ArrayAccessExpressionDO) -> *ArrayAccessExpressionDO;
```
