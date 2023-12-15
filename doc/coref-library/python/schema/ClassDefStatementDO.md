# ClassDefStatementDO

Primary key: `element_oid: int`

```rust
schema ClassDefStatementDO {
  name: string,
  @primary element_oid: int
}
```
## ClassDefStatementDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ClassDefStatementDO) -> string;
```
## ClassDefStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ClassDefStatementDO;
```
