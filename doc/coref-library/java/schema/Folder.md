# Folder

Inherit from [FolderDO](./FolderDO.md)

Primary key: `element_hash_id: int`

```rust
schema Folder extends FolderDO {
  @primary element_hash_id: int,
  qualified_name: string,
  name: string,
  parent_hash_id: int
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
## Folder::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Folder) -> int;
```
## Folder::getRelativePath

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: Folder) -> string;
```
## Folder::getParent

```java
/**
* @brief gets the folder which contains the element.
* @return Folder
*/
```
```rust
pub fn getParent(self: Folder) -> Folder;
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
## Folder::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Folder) -> *ElementParent;
```
## Folder::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Folder;
```
