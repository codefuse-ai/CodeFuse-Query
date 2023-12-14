# ForStatementDO

Primary key: `element_hash_id: int`

```rust
schema ForStatementDO {
  condition_hash_id: int,
  initialization_hash_id: int,
  body_hash_id: int,
  update_hash_id: int,
  @primary element_hash_id: int,
}
```
## ForStatementDO::getUpdateHashId

```java
/**
* @brief gets the update hash id of this element.
* @return int
*/
```
```rust
pub fn getUpdateHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getConditionHashId

```java
/**
* @brief gets the condition hash id of this element.
* @return int
*/
```
```rust
pub fn getConditionHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getInitializationHashId

```java
/**
* @brief gets the initialization hash id of this element.
* @return int
*/
```
```rust
pub fn getInitializationHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getBodyHashId

```java
/**
* @brief gets the body hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ForStatementDO;
```
