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

```java
/**
* @brief gets the labeled hash identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getLabeledHashIdentifierHashId(self: LabeledStatementDO) -> int;
```
## LabeledStatementDO::getStatementHashId

```java
/**
* @brief gets the statement hash id of this element.
* @return int
*/
```
```rust
pub fn getStatementHashId(self: LabeledStatementDO) -> int;
```
## LabeledStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LabeledStatementDO;
```
