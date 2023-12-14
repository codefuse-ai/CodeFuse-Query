# Folder

Primary key: `element_oid: int`

```rust
schema Folder {
  @primary element_oid: int,
  qualified_name: string,
  name: string,
  parent_oid: int,
}
```
## Folder::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Folder) -> string;
```
## Folder::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Folder) -> int;
```
## Folder::getParent

```rust
/**
     * @brief gets the folder which contains the folder, if any.
     * @return Folder 
     */
```
```rust
pub fn getParent(self: Folder) -> Folder;
```
## Folder::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: Folder) -> string;
```
## Folder::getAllContainingFiles

```rust
/**
     * @brief gets all files in the folder.
     * @return File 
     */
```
```rust
pub fn getAllContainingFiles(self: Folder) -> *File;
```
## Folder::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Folder;
```
## Folder::is\<T\>

```rust
pub fn is<T>(self: Folder) -> bool;
```
## Folder::to\<T\>

```rust
pub fn to<T>(self: Folder) -> <any>;
```
## Folder::key\_neq

```rust
pub fn key_neq(self: Folder, object: <any>) -> bool;
```
## Folder::key\_eq

```rust
pub fn key_eq(self: Folder, object: <any>) -> bool;
```
## Folder::to\_set

```rust
pub fn to_set(self: Folder) -> *Folder;
```
