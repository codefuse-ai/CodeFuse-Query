# SwitchLabelStatementDO

Primary key: `element_hash_id: int`

```rust
schema SwitchLabelStatementDO {
  get_next_switch_case: int,
  enclosing_switch_block_hash_id: int,
  case_value_hash_id: int,
  @primary element_hash_id: int
}
```
## SwitchLabelStatementDO::getNext

```java
/**
* @brief gets the next switch case id of the element, 0 means it's the last case.
* @return int
*/
```
```rust
pub fn getNext(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::getEnclosingSwitchBlockHashId

```java
/**
* @brief gets the enclosing switch block hash id of this element.
* @return int
*/
```
```rust
pub fn getEnclosingSwitchBlockHashId(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::getCaseValueHashId

```java
/**
* @brief gets the case value hash id of this element.
* @return int
*/
```
```rust
pub fn getCaseValueHashId(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SwitchLabelStatementDO;
```
