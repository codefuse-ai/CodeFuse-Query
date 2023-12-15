# DeclarationElementDO

Primary key: `element_hash_id: int`

```rust
schema DeclarationElementDO {
  declaration_statement_hash_id: int,
  index_order: int,
  @primary element_hash_id: int
}
```
## DeclarationElementDO::getDeclarationStatementHashId

```java
/**
* @brief gets the declaration statement hash id of this element.
* @return int
*/
```
```rust
pub fn getDeclarationStatementHashId(self: DeclarationElementDO) -> int;
```
## DeclarationElementDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: DeclarationElementDO) -> int;
```
## DeclarationElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *DeclarationElementDO;
```
