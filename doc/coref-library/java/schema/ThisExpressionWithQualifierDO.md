# ThisExpressionWithQualifierDO

Primary key: `element_hash_id: int`

```rust
schema ThisExpressionWithQualifierDO {
  qualifier_hash_id: int,
  @primary element_hash_id: int,
}
```
## ThisExpressionWithQualifierDO::getQualifierHashId

```rust
/**
     * @brief gets the qualifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getQualifierHashId(self: ThisExpressionWithQualifierDO) -> int;
```
## ThisExpressionWithQualifierDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ThisExpressionWithQualifierDO;
```
## ThisExpressionWithQualifierDO::is\<T\>

```rust
pub fn is<T>(self: ThisExpressionWithQualifierDO) -> bool;
```
## ThisExpressionWithQualifierDO::to\<T\>

```rust
pub fn to<T>(self: ThisExpressionWithQualifierDO) -> <any>;
```
## ThisExpressionWithQualifierDO::key\_neq

```rust
pub fn key_neq(self: ThisExpressionWithQualifierDO, object: <any>) -> bool;
```
## ThisExpressionWithQualifierDO::key\_eq

```rust
pub fn key_eq(self: ThisExpressionWithQualifierDO, object: <any>) -> bool;
```
## ThisExpressionWithQualifierDO::to\_set

```rust
pub fn to_set(self: ThisExpressionWithQualifierDO) -> *ThisExpressionWithQualifierDO;
```
