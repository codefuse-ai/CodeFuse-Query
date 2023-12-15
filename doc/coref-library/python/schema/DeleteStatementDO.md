# DeleteStatementDO

Primary key: `element_oid: int`

```rust
schema DeleteStatementDO {
  targets_size: int,
  @primary element_oid: int
}
```
## DeleteStatementDO::getTargetsSize

```java
/**
* @brief gets the targets size of this element.
* @return int
*/
```
```rust
pub fn getTargetsSize(self: DeleteStatementDO) -> int;
```
## DeleteStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DeleteStatementDO;
```
