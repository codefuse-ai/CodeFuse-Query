# BlockStatementDO

Primary key: `element_hash_id: int`

```rust
schema BlockStatementDO {
  code_block_hash_id: int,
  @primary element_hash_id: int,
}
```
## BlockStatementDO::getCodeBlockHashId

```rust
/**
     * @brief gets the code block hash id of this element.
     * @return int
     */
```
```rust
pub fn getCodeBlockHashId(self: BlockStatementDO) -> int;
```
## BlockStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BlockStatementDO;
```
## BlockStatementDO::is\<T\>

```rust
pub fn is<T>(self: BlockStatementDO) -> bool;
```
## BlockStatementDO::to\<T\>

```rust
pub fn to<T>(self: BlockStatementDO) -> <any>;
```
## BlockStatementDO::key\_neq

```rust
pub fn key_neq(self: BlockStatementDO, object: <any>) -> bool;
```
## BlockStatementDO::key\_eq

```rust
pub fn key_eq(self: BlockStatementDO, object: <any>) -> bool;
```
## BlockStatementDO::to\_set

```rust
pub fn to_set(self: BlockStatementDO) -> *BlockStatementDO;
```
