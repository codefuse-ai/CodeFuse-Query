# GlobalStatementDO

Primary key: `element_oid: int`

```rust
schema GlobalStatementDO {
  names: string,
  @primary element_oid: int
}
```
## GlobalStatementDO::getNames

```java
/**
* @brief gets the names of this element.
* @return string
*/
```
```rust
pub fn getNames(self: GlobalStatementDO) -> string;
```
## GlobalStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *GlobalStatementDO;
```
