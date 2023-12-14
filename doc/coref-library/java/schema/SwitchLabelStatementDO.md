# SwitchLabelStatementDO

Primary key: `element_hash_id: int`

```rust
schema SwitchLabelStatementDO {
  get_next_switch_case: int,
  enclosing_switch_block_hash_id: int,
  case_value_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchLabelStatementDO::getNext

```rust
/**
     * @brief gets the next switch case id of the element, 0 means it's the last case.
     * @return int
     */
```
```rust
pub fn getNext(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::getEnclosingSwitchBlockHashId

```rust
/**
     * @brief gets the enclosing switch block hash id of this element.
     * @return int
     */
```
```rust
pub fn getEnclosingSwitchBlockHashId(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::getCaseValueHashId

```rust
/**
     * @brief gets the case value hash id of this element.
     * @return int
     */
```
```rust
pub fn getCaseValueHashId(self: SwitchLabelStatementDO) -> int;
```
## SwitchLabelStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SwitchLabelStatementDO;
```
## SwitchLabelStatementDO::is\<T\>

```rust
pub fn is<T>(self: SwitchLabelStatementDO) -> bool;
```
## SwitchLabelStatementDO::to\<T\>

```rust
pub fn to<T>(self: SwitchLabelStatementDO) -> <any>;
```
## SwitchLabelStatementDO::key\_neq

```rust
pub fn key_neq(self: SwitchLabelStatementDO, object: <any>) -> bool;
```
## SwitchLabelStatementDO::key\_eq

```rust
pub fn key_eq(self: SwitchLabelStatementDO, object: <any>) -> bool;
```
## SwitchLabelStatementDO::to\_set

```rust
pub fn to_set(self: SwitchLabelStatementDO) -> *SwitchLabelStatementDO;
```
