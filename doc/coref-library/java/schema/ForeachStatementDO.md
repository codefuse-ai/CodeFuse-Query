# ForeachStatementDO

Primary key: `element_hash_id: int`

```rust
schema ForeachStatementDO {
  iteration_parameter_hash_id: int,
  iterated_value_hash_id: int,
  body_hash_id: int,
  @primary element_hash_id: int,
}
```
## ForeachStatementDO::getIterationParameterHashId

```rust
/**
     * @brief gets the iteration parameter hash id of this element.
     * @return int
     */
```
```rust
pub fn getIterationParameterHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::getIteratedValueHashId

```rust
/**
     * @brief gets the iterated value hash id of this element.
     * @return int
     */
```
```rust
pub fn getIteratedValueHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::getBodyHashId

```rust
/**
     * @brief gets the body hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ForeachStatementDO;
```
## ForeachStatementDO::is\<T\>

```rust
pub fn is<T>(self: ForeachStatementDO) -> bool;
```
## ForeachStatementDO::to\<T\>

```rust
pub fn to<T>(self: ForeachStatementDO) -> <any>;
```
## ForeachStatementDO::key\_neq

```rust
pub fn key_neq(self: ForeachStatementDO, object: <any>) -> bool;
```
## ForeachStatementDO::key\_eq

```rust
pub fn key_eq(self: ForeachStatementDO, object: <any>) -> bool;
```
## ForeachStatementDO::to\_set

```rust
pub fn to_set(self: ForeachStatementDO) -> *ForeachStatementDO;
```
