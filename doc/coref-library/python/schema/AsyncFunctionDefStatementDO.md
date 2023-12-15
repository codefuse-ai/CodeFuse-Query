# AsyncFunctionDefStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncFunctionDefStatementDO {
  name: string,
  @primary element_oid: int
}
```
## AsyncFunctionDefStatementDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: AsyncFunctionDefStatementDO) -> string;
```
## AsyncFunctionDefStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AsyncFunctionDefStatementDO;
```
