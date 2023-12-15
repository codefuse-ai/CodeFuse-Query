# NonLocalStatementDO

Primary key: `element_oid: int`

```rust
schema NonLocalStatementDO {
  names: int,
  @primary element_oid: int
}
```
## NonLocalStatementDO::getNames

```java
/**
* @brief gets the names of this element.
* @return int
*/
```
```rust
pub fn getNames(self: NonLocalStatementDO) -> int;
```
## NonLocalStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *NonLocalStatementDO;
```
