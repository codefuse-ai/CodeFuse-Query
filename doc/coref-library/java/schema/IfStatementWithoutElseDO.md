# IfStatementWithoutElseDO

Primary key: `element_hash_id: int`

```rust
schema IfStatementWithoutElseDO {
  consequent_hash_id: int,
  condition_hash_id: int,
  @primary element_hash_id: int
}
```
## IfStatementWithoutElseDO::getConditionHashId

```java
/**
* @brief gets the condition hash id of this element.
* @return int
*/
```
```rust
pub fn getConditionHashId(self: IfStatementWithoutElseDO) -> int;
```
## IfStatementWithoutElseDO::getConsequentHashId

```java
/**
* @brief gets the consequent hash id of this element.
* @return int
*/
```
```rust
pub fn getConsequentHashId(self: IfStatementWithoutElseDO) -> int;
```
## IfStatementWithoutElseDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IfStatementWithoutElseDO;
```
