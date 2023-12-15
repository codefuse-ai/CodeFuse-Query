# IfStatementWithElseDO

Primary key: `element_hash_id: int`

```rust
schema IfStatementWithElseDO {
  alternate_hash_id: int,
  consequent_hash_id: int,
  condition_hash_id: int,
  @primary element_hash_id: int
}
```
## IfStatementWithElseDO::getAlternateHashId

```java
/**
* @brief gets the alternate hash id of this element.
* @return int
*/
```
```rust
pub fn getAlternateHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::getConditionHashId

```java
/**
* @brief gets the condition hash id of this element.
* @return int
*/
```
```rust
pub fn getConditionHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::getConsequentHashId

```java
/**
* @brief gets the consequent hash id of this element.
* @return int
*/
```
```rust
pub fn getConsequentHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IfStatementWithElseDO;
```
