# DecoratedRelationDO

Primary key: `decorator_oid: int`

```rust
schema DecoratedRelationDO {
  decorated_element_oid: int,
  @primary decorator_oid: int,
}
```
## DecoratedRelationDO::getDecoratedElementOid

```rust
/**
     * @brief gets the decorated element oid of this element.
     * @return int
     */
```
```rust
pub fn getDecoratedElementOid(self: DecoratedRelationDO) -> int;
```
## DecoratedRelationDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DecoratedRelationDO;
```
## DecoratedRelationDO::is\<T\>

```rust
pub fn is<T>(self: DecoratedRelationDO) -> bool;
```
## DecoratedRelationDO::to\<T\>

```rust
pub fn to<T>(self: DecoratedRelationDO) -> <any>;
```
## DecoratedRelationDO::key\_neq

```rust
pub fn key_neq(self: DecoratedRelationDO, object: <any>) -> bool;
```
## DecoratedRelationDO::key\_eq

```rust
pub fn key_eq(self: DecoratedRelationDO, object: <any>) -> bool;
```
## DecoratedRelationDO::to\_set

```rust
pub fn to_set(self: DecoratedRelationDO) -> *DecoratedRelationDO;
```
