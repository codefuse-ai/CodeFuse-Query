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

```rust
/**
     * @brief gets the update hash id of this element.
     * @return int
     */
```
```rust
pub fn getUpdateHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getConditionHashId

```rust
/**
     * @brief gets the condition hash id of this element.
     * @return int
     */
```
```rust
pub fn getConditionHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getInitializationHashId

```rust
/**
     * @brief gets the initialization hash id of this element.
     * @return int
     */
```
```rust
pub fn getInitializationHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::getBodyHashId

```rust
/**
     * @brief gets the body hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyHashId(self: ForStatementDO) -> int;
```
## ForStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ForStatementDO;
```
## ForStatementDO::is\<T\>

```rust
pub fn is<T>(self: ForStatementDO) -> bool;
```
## ForStatementDO::to\<T\>

```rust
pub fn to<T>(self: ForStatementDO) -> <any>;
```
## ForStatementDO::key\_neq

```rust
pub fn key_neq(self: ForStatementDO, object: <any>) -> bool;
```
## ForStatementDO::key\_eq

```rust
pub fn key_eq(self: ForStatementDO, object: <any>) -> bool;
```
## ForStatementDO::to\_set

```rust
pub fn to_set(self: ForStatementDO) -> *ForStatementDO;
```
