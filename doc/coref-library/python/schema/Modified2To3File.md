# Modified2To3File

Inherit from [Modified2To3FileDO](./Modified2To3FileDO.md)

Primary key: `element_oid: int`

```rust
schema Modified2To3File extends Modified2To3FileDO {
  @primary element_oid: int,
  relative_path: string
}
```
## Modified2To3File::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: Modified2To3File) -> string;
```
## Modified2To3File::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Modified2To3File;
```
