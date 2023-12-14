# ParentDO

Primary key: `parent_oid: int`

```rust
schema ParentDO {
  parent_type: string,
  @primary parent_oid: int,
}
```
## ParentDO::getParentType

```java
/**
* @brief gets the parent type of this element.
* @return string
*/
```
```rust
pub fn getParentType(self: ParentDO) -> string;
```
## ParentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ParentDO;
```
