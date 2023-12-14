# IfStatementWithoutElseDO

Primary key: `element_hash_id: int`

```rust
schema IfStatementWithoutElseDO {
  consequent_hash_id: int,
  condition_hash_id: int,
  @primary element_hash_id: int,
}
```
## IfStatementWithoutElseDO::getConditionHashId

```rust
/**
     * @brief gets the condition hash id of this element.
     * @return int
     */
```
```rust
pub fn getConditionHashId(self: IfStatementWithoutElseDO) -> int;
```
## IfStatementWithoutElseDO::getConsequentHashId

```rust
/**
     * @brief gets the consequent hash id of this element.
     * @return int
     */
```
```rust
pub fn getConsequentHashId(self: IfStatementWithoutElseDO) -> int;
```
## IfStatementWithoutElseDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IfStatementWithoutElseDO;
```
## IfStatementWithoutElseDO::is\<T\>

```rust
pub fn is<T>(self: IfStatementWithoutElseDO) -> bool;
```
## IfStatementWithoutElseDO::to\<T\>

```rust
pub fn to<T>(self: IfStatementWithoutElseDO) -> <any>;
```
## IfStatementWithoutElseDO::key\_neq

```rust
pub fn key_neq(self: IfStatementWithoutElseDO, object: <any>) -> bool;
```
## IfStatementWithoutElseDO::key\_eq

```rust
pub fn key_eq(self: IfStatementWithoutElseDO, object: <any>) -> bool;
```
## IfStatementWithoutElseDO::to\_set

```rust
pub fn to_set(self: IfStatementWithoutElseDO) -> *IfStatementWithoutElseDO;
```
