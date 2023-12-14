# Folder

Primary key: `element_hash_id: int`

```rust
schema Folder {
  @primary element_hash_id: int,
  qualified_name: string,
  name: string,
  parent_hash_id: int,
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
## Folder::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Folder) -> int;
```
## Folder::getRelativePath

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: Folder) -> string;
```
## Folder::getParent

```rust
/**
     * @brief gets the folder which contains the element.
     * @return Folder
     */
```
```rust
pub fn getParent(self: Folder) -> Folder;
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
## Folder::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Folder) -> *ElementParent;
```
## Folder::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Folder;
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
