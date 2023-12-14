# SuperExpressionWithQualifierDO

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionWithQualifierDO {
  qualifier_hash_id: int,
  @primary element_hash_id: int,
}
```
## SuperExpressionWithQualifierDO::getQualifierHashId

```rust
/**
     * @brief gets the qualifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getQualifierHashId(self: SuperExpressionWithQualifierDO) -> int;
```
## SuperExpressionWithQualifierDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionWithQualifierDO;
```
## SuperExpressionWithQualifierDO::is\<T\>

```rust
pub fn is<T>(self: SuperExpressionWithQualifierDO) -> bool;
```
## SuperExpressionWithQualifierDO::to\<T\>

```rust
pub fn to<T>(self: SuperExpressionWithQualifierDO) -> <any>;
```
## SuperExpressionWithQualifierDO::key\_neq

```rust
pub fn key_neq(self: SuperExpressionWithQualifierDO, object: <any>) -> bool;
```
## SuperExpressionWithQualifierDO::key\_eq

```rust
pub fn key_eq(self: SuperExpressionWithQualifierDO, object: <any>) -> bool;
```
## SuperExpressionWithQualifierDO::to\_set

```rust
pub fn to_set(self: SuperExpressionWithQualifierDO) -> *SuperExpressionWithQualifierDO;
```
