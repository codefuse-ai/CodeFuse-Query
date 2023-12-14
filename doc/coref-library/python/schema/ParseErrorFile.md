# ParseErrorFile

Primary key: `element_oid: int`

```rust
schema ParseErrorFile {
  @primary element_oid: int,
  error_message: string,
  relative_path: string,
  error_text: string,
}
```
## ParseErrorFile::getRelativePath

```rust
/**
     * @brief gets the relative path of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: ParseErrorFile) -> string;
```
## ParseErrorFile::getErrorText

```rust
/**
     * @brief gets the error text of this element.
     * @return string
     */
```
```rust
pub fn getErrorText(self: ParseErrorFile) -> string;
```
## ParseErrorFile::getErrorMessage

```rust
/**
     * @brief gets the error message of this element.
     * @return string
     */
```
```rust
pub fn getErrorMessage(self: ParseErrorFile) -> string;
```
## ParseErrorFile::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ParseErrorFile;
```
## ParseErrorFile::is\<T\>

```rust
pub fn is<T>(self: ParseErrorFile) -> bool;
```
## ParseErrorFile::to\<T\>

```rust
pub fn to<T>(self: ParseErrorFile) -> <any>;
```
## ParseErrorFile::key\_neq

```rust
pub fn key_neq(self: ParseErrorFile, object: <any>) -> bool;
```
## ParseErrorFile::key\_eq

```rust
pub fn key_eq(self: ParseErrorFile, object: <any>) -> bool;
```
## ParseErrorFile::to\_set

```rust
pub fn to_set(self: ParseErrorFile) -> *ParseErrorFile;
```
