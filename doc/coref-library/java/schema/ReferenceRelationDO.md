# ReferenceRelationDO

Primary key: `reference_element_hash_id: int`

```rust
schema ReferenceRelationDO {
  definition_element_hash_id: int,
  @primary reference_element_hash_id: int
}
```
## ReferenceRelationDO::getSourceId

```java
/**
* @brief gets the reference element id.
* @return int 
*/
```
```rust
pub fn getSourceId(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::getDefinitionElementHashId

```java
/**
* @brief gets the definition element hash id of this element.
* @return int
*/
```
```rust
pub fn getDefinitionElementHashId(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceRelationDO;
```
