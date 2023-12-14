# AssertStatementDO

Primary key: `element_hash_id: int`

```rust
schema AssertStatementDO {
  assert_description_hash_id: int,
  assert_condition_hash_id: int,
  @primary element_hash_id: int,
}
```
## AssertStatementDO::getAssertConditionHashId

```rust
/**
     * @brief gets the assert condition hash id of this element.
     * @return int
     */
```
```rust
pub fn getAssertConditionHashId(self: AssertStatementDO) -> int;
```
## AssertStatementDO::getAssertDescriptionHashId

```rust
/**
     * @brief gets the assert description hash id of this element.
     * @return int
     */
```
```rust
pub fn getAssertDescriptionHashId(self: AssertStatementDO) -> int;
```
## AssertStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AssertStatementDO;
```
## AssertStatementDO::is\<T\>

```rust
pub fn is<T>(self: AssertStatementDO) -> bool;
```
## AssertStatementDO::to\<T\>

```rust
pub fn to<T>(self: AssertStatementDO) -> <any>;
```
## AssertStatementDO::key\_neq

```rust
pub fn key_neq(self: AssertStatementDO, object: <any>) -> bool;
```
## AssertStatementDO::key\_eq

```rust
pub fn key_eq(self: AssertStatementDO, object: <any>) -> bool;
```
## AssertStatementDO::to\_set

```rust
pub fn to_set(self: AssertStatementDO) -> *AssertStatementDO;
```
