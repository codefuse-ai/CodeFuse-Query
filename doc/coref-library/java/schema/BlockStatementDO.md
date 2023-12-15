# BlockStatementDO

Primary key: `element_hash_id: int`

```rust
schema BlockStatementDO {
  code_block_hash_id: int,
  @primary element_hash_id: int
}
```
## BlockStatementDO::getCodeBlockHashId

```java
/**
* @brief gets the code block hash id of this element.
* @return int
*/
```
```rust
pub fn getCodeBlockHashId(self: BlockStatementDO) -> int;
```
## BlockStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BlockStatementDO;
```
