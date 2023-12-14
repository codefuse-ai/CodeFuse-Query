# WhileStatementDO

Primary key: `element_hash_id: int`

```rust
schema WhileStatementDO {
  condition_hash_id: int,
  body_declaration_hash_id: int,
  @primary element_hash_id: int,
}
```
## WhileStatementDO::getConditionHashId

```rust
/**
     * @brief gets the expression id representing the condition of the loop.
     * The condition is checked after every loop iteration, and
     * iteration stops when condition evaluates to false.
     * @return int
     */
```
```rust
pub fn getConditionHashId(self: WhileStatementDO) -> int;
```
## WhileStatementDO::getBodyDeclarationHashId

```rust
/**
     * @brief gets the body declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyDeclarationHashId(self: WhileStatementDO) -> int;
```
## WhileStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *WhileStatementDO;
```
## WhileStatementDO::is\<T\>

```rust
pub fn is<T>(self: WhileStatementDO) -> bool;
```
## WhileStatementDO::to\<T\>

```rust
pub fn to<T>(self: WhileStatementDO) -> <any>;
```
## WhileStatementDO::key\_neq

```rust
pub fn key_neq(self: WhileStatementDO, object: <any>) -> bool;
```
## WhileStatementDO::key\_eq

```rust
pub fn key_eq(self: WhileStatementDO, object: <any>) -> bool;
```
## WhileStatementDO::to\_set

```rust
pub fn to_set(self: WhileStatementDO) -> *WhileStatementDO;
```
