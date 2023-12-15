# SwitchStatementDO

Primary key: `element_hash_id: int`

```rust
schema SwitchStatementDO {
  discriminant_hash_id: int,
  body_declaration_hash_id: int,
  @primary element_hash_id: int
}
```
## SwitchStatementDO::getDiscriminantHashId

```java
/**
* @brief gets the discriminant hash id of this element.
* @return int
*/
```
```rust
pub fn getDiscriminantHashId(self: SwitchStatementDO) -> int;
```
## SwitchStatementDO::getBodyDeclarationHashId

```java
/**
* @brief gets the body declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyDeclarationHashId(self: SwitchStatementDO) -> int;
```
## SwitchStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SwitchStatementDO;
```
