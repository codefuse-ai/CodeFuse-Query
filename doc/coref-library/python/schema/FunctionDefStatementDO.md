# FunctionDefStatementDO

Primary key: `element_oid: int`

```rust
schema FunctionDefStatementDO {
  name: string,
  @primary element_oid: int,
}
```
## FunctionDefStatementDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FunctionDefStatementDO) -> string;
```
## FunctionDefStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FunctionDefStatementDO;
```
