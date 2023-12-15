# ReferenceRelationDO

Primary key: `reference_element_oid: int`

```rust
schema ReferenceRelationDO {
  definition_element_oid: int,
  @primary reference_element_oid: int
}
```
## ReferenceRelationDO::getDefinitionElementOid

```java
/**
* @brief gets the definition element oid of this element.
* @return int
*/
```
```rust
pub fn getDefinitionElementOid(self: ReferenceRelationDO) -> int;
```
## ReferenceRelationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ReferenceRelationDO;
```
