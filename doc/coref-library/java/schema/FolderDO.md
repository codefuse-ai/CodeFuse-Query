# FolderDO

Primary key: `element_hash_id: int`

```rust
schema FolderDO {
  parent_hash_id: int,
  name: string,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## FolderDO::getRelativePath

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: FolderDO) -> string;
```
## FolderDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: FolderDO) -> int;
```
## FolderDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FolderDO) -> string;
```
## FolderDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *FolderDO;
```
