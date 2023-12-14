# DeclarationElementDO

Primary key: `element_hash_id: int`

```rust
schema DeclarationElementDO {
  declaration_statement_hash_id: int,
  index_order: int,
  @primary element_hash_id: int,
}
```
## DeclarationElementDO::getDeclarationStatementHashId

```rust
/**
     * @brief gets the declaration statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getDeclarationStatementHashId(self: DeclarationElementDO) -> int;
```
## DeclarationElementDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: DeclarationElementDO) -> int;
```
## DeclarationElementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DeclarationElementDO;
```
## DeclarationElementDO::is\<T\>

```rust
pub fn is<T>(self: DeclarationElementDO) -> bool;
```
## DeclarationElementDO::to\<T\>

```rust
pub fn to<T>(self: DeclarationElementDO) -> <any>;
```
## DeclarationElementDO::key\_neq

```rust
pub fn key_neq(self: DeclarationElementDO, object: <any>) -> bool;
```
## DeclarationElementDO::key\_eq

```rust
pub fn key_eq(self: DeclarationElementDO, object: <any>) -> bool;
```
## DeclarationElementDO::to\_set

```rust
pub fn to_set(self: DeclarationElementDO) -> *DeclarationElementDO;
```
