# FolderDO

Primary key: `element_oid: int`

```rust
schema FolderDO {
  parent_oid: int,
  name: string,
  qualified_name: string,
  @primary element_oid: int,
}
```
## FolderDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: FolderDO) -> int;
```
## FolderDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: FolderDO) -> string;
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
pub fn __all__(db: PythonDB) -> *FolderDO;
```
