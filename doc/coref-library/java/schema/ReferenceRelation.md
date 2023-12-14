# ReferenceRelation

Primary key: `reference_element_hash_id: int`

```rust
schema ReferenceRelation {
  @primary reference_element_hash_id: int,
  definition_element_hash_id: int,
}
```
## ReferenceRelation::getDestination

```rust
/**
     * @brief get the destination of this reference relation. 
     * @return ExpressionParent 
     */
```
```rust
pub fn getDestination(self: ReferenceRelation) -> ElementParent;
```
## ReferenceRelation::getSourceId

```rust
/**
     * @brief gets the reference element id.
     * @return int 
     */
```
```rust
pub fn getSourceId(self: ReferenceRelation) -> int;
```
## ReferenceRelation::getSource

```rust
/**
     * @brief get the reference expression or reference element or import static reference element which references some definitions.
     * @return Expression 
     */
```
```rust
pub fn getSource(self: ReferenceRelation) -> ElementParent;
```
## ReferenceRelation::getDefinitionElementHashId

```rust
/**
     * @brief gets the definition element hash id of this element.
     * @return int
     */
```
```rust
pub fn getDefinitionElementHashId(self: ReferenceRelation) -> int;
```
## ReferenceRelation::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceRelation;
```
## ReferenceRelation::is\<T\>

```rust
pub fn is<T>(self: ReferenceRelation) -> bool;
```
## ReferenceRelation::to\<T\>

```rust
pub fn to<T>(self: ReferenceRelation) -> <any>;
```
## ReferenceRelation::key\_neq

```rust
pub fn key_neq(self: ReferenceRelation, object: <any>) -> bool;
```
## ReferenceRelation::key\_eq

```rust
pub fn key_eq(self: ReferenceRelation, object: <any>) -> bool;
```
## ReferenceRelation::to\_set

```rust
pub fn to_set(self: ReferenceRelation) -> *ReferenceRelation;
```
