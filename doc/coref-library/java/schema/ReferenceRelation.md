# ReferenceRelation

Inherit from [ReferenceRelationDO](./ReferenceRelationDO.md)

Primary key: `reference_element_hash_id: int`

```rust
schema ReferenceRelation extends ReferenceRelationDO {
  @primary reference_element_hash_id: int,
  definition_element_hash_id: int
}
```
## ReferenceRelation::getDestination

```java
/**
* @brief get the destination of this reference relation. 
* @return ExpressionParent 
*/
```
```rust
pub fn getDestination(self: ReferenceRelation) -> ElementParent;
```
## ReferenceRelation::getSourceId

```java
/**
* @brief gets the reference element id.
* @return int 
*/
```
```rust
pub fn getSourceId(self: ReferenceRelation) -> int;
```
## ReferenceRelation::getSource

```java
/**
* @brief get the reference expression or reference element or import static reference element which references some definitions.
* @return Expression 
*/
```
```rust
pub fn getSource(self: ReferenceRelation) -> ElementParent;
```
## ReferenceRelation::getDefinitionElementHashId

```java
/**
* @brief gets the definition element hash id of this element.
* @return int
*/
```
```rust
pub fn getDefinitionElementHashId(self: ReferenceRelation) -> int;
```
## ReferenceRelation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceRelation;
```
