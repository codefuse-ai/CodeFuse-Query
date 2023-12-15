# ParseErrorFileDO

Primary key: `element_oid: int`

```rust
schema ParseErrorFileDO {
  error_text: string,
  relative_path: string,
  error_message: string,
  @primary element_oid: int
}
```
## ParseErrorFileDO::getErrorMessage

```java
/**
* @brief gets the error message of this element.
* @return string
*/
```
```rust
pub fn getErrorMessage(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::getErrorText

```java
/**
* @brief gets the error text of this element.
* @return string
*/
```
```rust
pub fn getErrorText(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ParseErrorFileDO;
```
