# File

Primary key: `element_hash_id: int`

```rust
schema File {
  @primary element_hash_id: int,
  qualified_name: string,
  name: string,
  extension: string,
  number_of_lines_hash_id: int,
}
```
## File::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: File) -> string;
```
## File::getExtension

```rust
/**
     * @brief gets the extension of this element.
     * @return string
     */
```
```rust
pub fn getExtension(self: File) -> string;
```
## File::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *File;
```
## File::getPackage

```rust
/**
     * @brief gets the package of the file.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: File) -> Package;
```
## File::getNumberOfLinesHashId

```rust
/**
     * @brief gets the number of lines hash id of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfLinesHashId(self: File) -> int;
```
## File::getRelativePath

```rust
/**
     * @brief gets the relative path  of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: File) -> string;
```
## File::getBelongedFolder

```rust
/**
     * @brief gets the folder which contains the file, if any.
     * @return Folder 
     */
```
```rust
pub fn getBelongedFolder(self: File) -> Folder;
```
## File::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: File) -> NumberOfLines;
```
## File::is\<T\>

```rust
pub fn is<T>(self: File) -> bool;
```
## File::to\<T\>

```rust
pub fn to<T>(self: File) -> <any>;
```
## File::key\_neq

```rust
pub fn key_neq(self: File, object: <any>) -> bool;
```
## File::key\_eq

```rust
pub fn key_eq(self: File, object: <any>) -> bool;
```
## File::to\_set

```rust
pub fn to_set(self: File) -> *File;
```
