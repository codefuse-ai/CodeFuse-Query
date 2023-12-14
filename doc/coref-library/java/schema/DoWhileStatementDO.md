# DoWhileStatementDO

Primary key: `element_hash_id: int`

```rust
schema DoWhileStatementDO {
  condition_hash_id: int,
  keyword: string,
  body_declaration_hash_id: int,
  @primary element_hash_id: int,
}
```
## DoWhileStatementDO::getConditionHashId

```rust
/**
     * @brief gets the condition hash id of this element.
     * @return int
     */
```
```rust
pub fn getConditionHashId(self: DoWhileStatementDO) -> int;
```
## DoWhileStatementDO::getKeyword

```rust
/**
     * @brief gets the keyword of this element.
     * @return string
     */
```
```rust
pub fn getKeyword(self: DoWhileStatementDO) -> string;
```
## DoWhileStatementDO::getBodyDeclarationHashId

```rust
/**
     * @brief gets the body declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyDeclarationHashId(self: DoWhileStatementDO) -> int;
```
## DoWhileStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DoWhileStatementDO;
```
## DoWhileStatementDO::is\<T\>

```rust
pub fn is<T>(self: DoWhileStatementDO) -> bool;
```
## DoWhileStatementDO::to\<T\>

```rust
pub fn to<T>(self: DoWhileStatementDO) -> <any>;
```
## DoWhileStatementDO::key\_neq

```rust
pub fn key_neq(self: DoWhileStatementDO, object: <any>) -> bool;
```
## DoWhileStatementDO::key\_eq

```rust
pub fn key_eq(self: DoWhileStatementDO, object: <any>) -> bool;
```
## DoWhileStatementDO::to\_set

```rust
pub fn to_set(self: DoWhileStatementDO) -> *DoWhileStatementDO;
```
