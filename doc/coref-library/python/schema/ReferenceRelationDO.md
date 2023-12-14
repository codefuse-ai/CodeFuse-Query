# ReferenceRelationDO

Primary key: `reference_element_oid: int`

```rust
schema ReferenceRelationDO {
  definition_element_oid: int,
  @primary reference_element_oid: int,
}
```
## ReferenceRelationDO::getDefinitionElementOid

```rust
/**
     * @brief gets the definition element oid of this element.
     * @return int
     */
```
```rust
pub fn getDefinitionElementOid(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ReferenceRelationDO;
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
