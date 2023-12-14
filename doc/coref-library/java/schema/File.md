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

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: File) -> string;
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
## File::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *File;
```
## File::getPackage

```java
/**
* @brief gets the package of the file.
* @return Package 
*/
```
```rust
pub fn getPackage(self: File) -> Package;
```
## File::getNumberOfLinesHashId

```java
/**
* @brief gets the number of lines hash id of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesHashId(self: File) -> int;
```
## File::getRelativePath

```java
/**
* @brief gets the relative path  of this element.
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
