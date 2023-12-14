# Folder

Inherit from [FolderDO](./FolderDO.md)

Primary key: `element_oid: int`

```rust
schema Folder extends FolderDO {
  @primary element_oid: int,
  qualified_name: string,
  name: string,
  parent_oid: int,
}
```
## Folder::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Folder) -> string;
```
## Folder::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Folder) -> int;
```
## Folder::getParent

```java
/**
* @brief gets the folder which contains the folder, if any.
* @return Folder 
*/
```
```rust
pub fn getParent(self: Folder) -> Folder;
```
## Folder::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: Folder) -> string;
```
## Folder::getAllContainingFiles

```java
/**
* @brief gets all files in the folder.
* @return File 
*/
```
```rust
pub fn getAllContainingFiles(self: Folder) -> *File;
```
## Folder::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Folder;
```
