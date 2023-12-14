# ParseErrorFileDO

Primary key: `element_oid: int`

```rust
schema ParseErrorFileDO {
  error_text: string,
  relative_path: string,
  error_message: string,
  @primary element_oid: int,
}
```
## ParseErrorFileDO::getErrorMessage

```rust
/**
     * @brief gets the error message of this element.
     * @return string
     */
```
```rust
pub fn getErrorMessage(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::getErrorText

```rust
/**
     * @brief gets the error text of this element.
     * @return string
     */
```
```rust
pub fn getErrorText(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::getRelativePath

```rust
/**
     * @brief gets the relative path of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: ParseErrorFileDO) -> string;
```
## ParseErrorFileDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ParseErrorFileDO;
```
## ParseErrorFileDO::is\<T\>

```rust
pub fn is<T>(self: ParseErrorFileDO) -> bool;
```
## ParseErrorFileDO::to\<T\>

```rust
pub fn to<T>(self: ParseErrorFileDO) -> <any>;
```
## ParseErrorFileDO::key\_neq

```rust
pub fn key_neq(self: ParseErrorFileDO, object: <any>) -> bool;
```
## ParseErrorFileDO::key\_eq

```rust
pub fn key_eq(self: ParseErrorFileDO, object: <any>) -> bool;
```
## ParseErrorFileDO::to\_set

```rust
pub fn to_set(self: ParseErrorFileDO) -> *ParseErrorFileDO;
```
