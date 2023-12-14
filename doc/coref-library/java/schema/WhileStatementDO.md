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

```java
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

```java
/**
* @brief gets the body declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyDeclarationHashId(self: WhileStatementDO) -> int;
```
## WhileStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *WhileStatementDO;
```
