# ReferenceRelationDO

Primary key: `reference_element_hash_id: int`

```rust
schema ReferenceRelationDO {
  definition_element_hash_id: int,
  @primary reference_element_hash_id: int,
}
```
## ReferenceRelationDO::getSourceId

```rust
/**
     * @brief gets the reference element id.
     * @return int 
     */
```
```rust
pub fn getSourceId(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::getDefinitionElementHashId

```rust
/**
     * @brief gets the definition element hash id of this element.
     * @return int
     */
```
```rust
pub fn getDefinitionElementHashId(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceRelationDO;
```
## ReferenceRelationDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceRelationDO) -> bool;
```
## ReferenceRelationDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceRelationDO) -> <any>;
```
## ReferenceRelationDO::key\_neq

```rust
pub fn key_neq(self: ReferenceRelationDO, object: <any>) -> bool;
```
## ReferenceRelationDO::key\_eq

```rust
pub fn key_eq(self: ReferenceRelationDO, object: <any>) -> bool;
```
## ReferenceRelationDO::to\_set

```rust
pub fn to_set(self: ReferenceRelationDO) -> *ReferenceRelationDO;
```
