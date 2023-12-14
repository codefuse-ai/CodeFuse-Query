# IfStatementWithElseDO

Primary key: `element_hash_id: int`

```rust
schema IfStatementWithElseDO {
  alternate_hash_id: int,
  consequent_hash_id: int,
  condition_hash_id: int,
  @primary element_hash_id: int,
}
```
## IfStatementWithElseDO::getAlternateHashId

```rust
/**
     * @brief gets the alternate hash id of this element.
     * @return int
     */
```
```rust
pub fn getAlternateHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::getConditionHashId

```rust
/**
     * @brief gets the condition hash id of this element.
     * @return int
     */
```
```rust
pub fn getConditionHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::getConsequentHashId

```rust
/**
     * @brief gets the consequent hash id of this element.
     * @return int
     */
```
```rust
pub fn getConsequentHashId(self: IfStatementWithElseDO) -> int;
```
## IfStatementWithElseDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IfStatementWithElseDO;
```
## IfStatementWithElseDO::is\<T\>

```rust
pub fn is<T>(self: IfStatementWithElseDO) -> bool;
```
## IfStatementWithElseDO::to\<T\>

```rust
pub fn to<T>(self: IfStatementWithElseDO) -> <any>;
```
## IfStatementWithElseDO::key\_neq

```rust
pub fn key_neq(self: IfStatementWithElseDO, object: <any>) -> bool;
```
## IfStatementWithElseDO::key\_eq

```rust
pub fn key_eq(self: IfStatementWithElseDO, object: <any>) -> bool;
```
## IfStatementWithElseDO::to\_set

```rust
pub fn to_set(self: IfStatementWithElseDO) -> *IfStatementWithElseDO;
```
