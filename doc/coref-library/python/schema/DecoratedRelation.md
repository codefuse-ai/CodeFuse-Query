# DecoratedRelation

Inherit from [DecoratedRelationDO](./DecoratedRelationDO.md)

Primary key: `decorator_oid: int`

```rust
schema DecoratedRelation extends DecoratedRelationDO {
  @primary decorator_oid: int,
  decorated_element_oid: int
}
```
## DecoratedRelation::getDecoratedElementOid

```java
/**
* @brief gets the decorated element oid of this element.
* @return int
*/
```
```rust
pub fn getDecoratedElementOid(self: DecoratedRelation) -> int;
```
## DecoratedRelation::getDecoratedElement

```java
/**
* @brief gets the decorated element of the relation.
* @return CombineElement
*/
```
```rust
pub fn getDecoratedElement(self: DecoratedRelation) -> CombineElement;
```
## DecoratedRelation::getDecorator

```java
/**
* @brief gets the decorator of the relation.
* @return Decorator
*/
```
```rust
pub fn getDecorator(self: DecoratedRelation) -> Decorator;
```
## DecoratedRelation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DecoratedRelation;
```
