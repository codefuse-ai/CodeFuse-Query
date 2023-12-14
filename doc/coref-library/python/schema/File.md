# File

Primary key: `element_oid: int`

```rust
schema File {
  @primary element_oid: int,
  relative_path: string,
  extension: string,
  name: string,
  number_of_lines_oid: int,
}
```
## File::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: File) -> string;
```
## File::getNumberOfLinesOid

```java
/**
* @brief gets the number of lines oid of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesOid(self: File) -> int;
```
## File::getExtension

```java
/**
* @brief gets the extension of this element.
* @return string
*/
```
```rust
pub fn getExtension(self: File) -> string;
```
## File::getRelativePath

```java
/**
* @brief gets the relative path of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: File) -> string;
```
## File::getBelongedFolder

```java
/**
* @brief gets the folder which contains the file, if any.
* @return Folder 
*/
```
```rust
pub fn getBelongedFolder(self: File) -> Folder;
```
## File::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: File) -> NumberOfLines;
```
## File::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *File;
```
