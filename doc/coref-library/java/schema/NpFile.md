# NpFile

Inherit from [NpFileDO](./NpFileDO.md)

Primary key: `element_hash_id: int`

```rust
schema NpFile extends NpFileDO {
  @primary element_hash_id: int,
  qualified_name: string,
  name: string,
  project_hash_id: int,
}
```
## NpFile::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpFile) -> string;
```
## NpFile::getProjectHashId

```java
/**
* @brief gets the project hash id of this element.
* @return int
*/
```
```rust
pub fn getProjectHashId(self: NpFile) -> int;
```
## NpFile::getNpProject

```java
/**
* @brief gets the np_project of this file.
* @return ElementParent
*/
```
```rust
pub fn getNpProject(self: NpFile) -> NpProject;
```
## NpFile::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpFile) -> string;
```
## NpFile::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpFile;
```
