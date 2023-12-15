# Modified2To3FileDO

Primary key: `element_oid: int`

```rust
schema Modified2To3FileDO {
  relative_path: string,
  @primary element_oid: int
}
```
## Modified2To3FileDO::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: Modified2To3FileDO) -> string;
```
## Modified2To3FileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Modified2To3FileDO;
```
