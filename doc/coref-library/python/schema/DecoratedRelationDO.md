# DecoratedRelationDO

Primary key: `decorator_oid: int`

```rust
schema DecoratedRelationDO {
  decorated_element_oid: int,
  @primary decorator_oid: int,
}
```
## DecoratedRelationDO::getDecoratedElementOid

```java
/**
* @brief gets the decorated element oid of this element.
* @return int
*/
```
```rust
pub fn getDecoratedElementOid(self: DecoratedRelationDO) -> int;
```
## DecoratedRelationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DecoratedRelationDO;
```
