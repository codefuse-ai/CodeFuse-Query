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

```java
/**
* @brief gets the assert condition hash id of this element.
* @return int
*/
```
```rust
pub fn getAssertConditionHashId(self: AssertStatementDO) -> int;
```
## AssertStatementDO::getAssertDescriptionHashId

```java
/**
* @brief gets the assert description hash id of this element.
* @return int
*/
```
```rust
pub fn getAssertDescriptionHashId(self: AssertStatementDO) -> int;
```
## AssertStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AssertStatementDO;
```
