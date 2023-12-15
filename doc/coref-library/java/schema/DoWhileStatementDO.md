# DoWhileStatementDO

Primary key: `element_hash_id: int`

```rust
schema DoWhileStatementDO {
  condition_hash_id: int,
  keyword: string,
  body_declaration_hash_id: int,
  @primary element_hash_id: int
}
```
## DoWhileStatementDO::getConditionHashId

```java
/**
* @brief gets the condition hash id of this element.
* @return int
*/
```
```rust
pub fn getConditionHashId(self: DoWhileStatementDO) -> int;
```
## DoWhileStatementDO::getKeyword

```java
/**
* @brief gets the keyword of this element.
* @return string
*/
```
```rust
pub fn getKeyword(self: DoWhileStatementDO) -> string;
```
## DoWhileStatementDO::getBodyDeclarationHashId

```java
/**
* @brief gets the body declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyDeclarationHashId(self: DoWhileStatementDO) -> int;
```
## DoWhileStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *DoWhileStatementDO;
```
