# LabeledStatementDO

Primary key: `element_hash_id: int`

```rust
schema LabeledStatementDO {
  statement_hash_id: int,
  labeled_hash_identifier_hash_id: int,
  @primary element_hash_id: int,
}
```
## LabeledStatementDO::getLabeledHashIdentifierHashId

```rust
/**
     * @brief gets the labeled hash identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getLabeledHashIdentifierHashId(self: LabeledStatementDO) -> int;
```
## LabeledStatementDO::getStatementHashId

```rust
/**
     * @brief gets the statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getStatementHashId(self: LabeledStatementDO) -> int;
```
## LabeledStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LabeledStatementDO;
```
## LabeledStatementDO::is\<T\>

```rust
pub fn is<T>(self: LabeledStatementDO) -> bool;
```
## LabeledStatementDO::to\<T\>

```rust
pub fn to<T>(self: LabeledStatementDO) -> <any>;
```
## LabeledStatementDO::key\_neq

```rust
pub fn key_neq(self: LabeledStatementDO, object: <any>) -> bool;
```
## LabeledStatementDO::key\_eq

```rust
pub fn key_eq(self: LabeledStatementDO, object: <any>) -> bool;
```
## LabeledStatementDO::to\_set

```rust
pub fn to_set(self: LabeledStatementDO) -> *LabeledStatementDO;
```
