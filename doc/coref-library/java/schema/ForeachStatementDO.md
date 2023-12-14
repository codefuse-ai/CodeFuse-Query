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

```java
/**
* @brief gets the iteration parameter hash id of this element.
* @return int
*/
```
```rust
pub fn getIterationParameterHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::getIteratedValueHashId

```java
/**
* @brief gets the iterated value hash id of this element.
* @return int
*/
```
```rust
pub fn getIteratedValueHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::getBodyHashId

```java
/**
* @brief gets the body hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyHashId(self: ForeachStatementDO) -> int;
```
## ForeachStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ForeachStatementDO;
```
