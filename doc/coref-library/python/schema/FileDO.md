# FileDO

Primary key: `element_oid: int`

```rust
schema FileDO {
  number_of_lines_oid: int,
  name: string,
  extension: string,
  relative_path: string,
  @primary element_oid: int,
}
```
## FileDO::getNumberOfLinesOid

```java
/**
* @brief gets the number of lines oid of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesOid(self: FileDO) -> int;
```
## FileDO::getExtension

```java
/**
* @brief gets the extension of this element.
* @return string
*/
```
```rust
pub fn getExtension(self: FileDO) -> string;
```
## FileDO::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: FileDO) -> string;
```
## FileDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FileDO) -> string;
```
## FileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FileDO;
```
