# ParseErrorFile

Inherit from [ParseErrorFileDO](./ParseErrorFileDO.md)

Primary key: `element_oid: int`

```rust
schema ParseErrorFile extends ParseErrorFileDO {
  @primary element_oid: int,
  error_message: string,
  relative_path: string,
  error_text: string,
}
```
## ParseErrorFile::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: ParseErrorFile) -> string;
```
## ParseErrorFile::getErrorText

```java
/**
* @brief gets the error text of this element.
* @return string
*/
```
```rust
pub fn getErrorText(self: ParseErrorFile) -> string;
```
## ParseErrorFile::getErrorMessage

```java
/**
* @brief gets the error message of this element.
* @return string
*/
```
```rust
pub fn getErrorMessage(self: ParseErrorFile) -> string;
```
## ParseErrorFile::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ParseErrorFile;
```
