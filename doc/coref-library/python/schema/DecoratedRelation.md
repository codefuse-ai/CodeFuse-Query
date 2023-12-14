# DecoratedRelation

Primary key: `decorator_oid: int`

```rust
schema DecoratedRelation {
  @primary decorator_oid: int,
  decorated_element_oid: int,
}
```
## DecoratedRelation::getDecoratedElementOid

```rust
/**
     * @brief gets the decorated element oid of this element.
     * @return int
     */
```
```rust
pub fn getDecoratedElementOid(self: DecoratedRelation) -> int;
```
## DecoratedRelation::getDecoratedElement

```rust
/**
     * @brief gets the decorated element of the relation.
     * @return CombineElement
     */
```
```rust
pub fn getDecoratedElement(self: DecoratedRelation) -> CombineElement;
```
## DecoratedRelation::getDecorator

```rust
/**
     * @brief gets the decorator of the relation.
     * @return Decorator
     */
```
```rust
pub fn getDecorator(self: DecoratedRelation) -> Decorator;
```
## DecoratedRelation::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DecoratedRelation;
```
## DecoratedRelation::is\<T\>

```rust
pub fn is<T>(self: DecoratedRelation) -> bool;
```
## DecoratedRelation::to\<T\>

```rust
pub fn to<T>(self: DecoratedRelation) -> <any>;
```
## DecoratedRelation::key\_neq

```rust
pub fn key_neq(self: DecoratedRelation, object: <any>) -> bool;
```
## DecoratedRelation::key\_eq

```rust
pub fn key_eq(self: DecoratedRelation, object: <any>) -> bool;
```
## DecoratedRelation::to\_set

```rust
pub fn to_set(self: DecoratedRelation) -> *DecoratedRelation;
```
