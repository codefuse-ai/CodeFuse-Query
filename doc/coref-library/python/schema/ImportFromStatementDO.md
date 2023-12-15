# ImportFromStatementDO

Primary key: `element_oid: int`

```rust
schema ImportFromStatementDO {
  module: string,
  level: int,
  @primary element_oid: int
}
```
## ImportFromStatementDO::getLevel

```java
/**
* @brief gets the level of this element.
* @return int
*/
```
```rust
pub fn getLevel(self: ImportFromStatementDO) -> int;
```
## ImportFromStatementDO::getModule

```java
/**
* @brief gets the module of this element.
* @return string
*/
```
```rust
pub fn getModule(self: ImportFromStatementDO) -> string;
```
## ImportFromStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ImportFromStatementDO;
```
