# SwitchStatementDO

Primary key: `element_hash_id: int`

```rust
schema SwitchStatementDO {
  discriminant_hash_id: int,
  body_declaration_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchStatementDO::getDiscriminantHashId

```rust
/**
     * @brief gets the discriminant hash id of this element.
     * @return int
     */
```
```rust
pub fn getDiscriminantHashId(self: SwitchStatementDO) -> int;
```
## SwitchStatementDO::getBodyDeclarationHashId

```rust
/**
     * @brief gets the body declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyDeclarationHashId(self: SwitchStatementDO) -> int;
```
## SwitchStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SwitchStatementDO;
```
## SwitchStatementDO::is\<T\>

```rust
pub fn is<T>(self: SwitchStatementDO) -> bool;
```
## SwitchStatementDO::to\<T\>

```rust
pub fn to<T>(self: SwitchStatementDO) -> <any>;
```
## SwitchStatementDO::key\_neq

```rust
pub fn key_neq(self: SwitchStatementDO, object: <any>) -> bool;
```
## SwitchStatementDO::key\_eq

```rust
pub fn key_eq(self: SwitchStatementDO, object: <any>) -> bool;
```
## SwitchStatementDO::to\_set

```rust
pub fn to_set(self: SwitchStatementDO) -> *SwitchStatementDO;
```
