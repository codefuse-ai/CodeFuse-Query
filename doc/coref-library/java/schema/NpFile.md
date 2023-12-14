# NpFile

Primary key: `element_hash_id: int`

```rust
schema NpFile {
  @primary element_hash_id: int,
  qualified_name: string,
  name: string,
  project_hash_id: int,
}
```
## NpFile::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpFile) -> string;
```
## NpFile::getProjectHashId

```rust
/**
     * @brief gets the project hash id of this element.
     * @return int
     */
```
```rust
pub fn getProjectHashId(self: NpFile) -> int;
```
## NpFile::getNpProject

```rust
/**
     * @brief gets the np_project of this file.
     * @return ElementParent
     */
```
```rust
pub fn getNpProject(self: NpFile) -> NpProject;
```
## NpFile::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpFile) -> string;
```
## NpFile::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpFile;
```
## NpFile::is\<T\>

```rust
pub fn is<T>(self: NpFile) -> bool;
```
## NpFile::to\<T\>

```rust
pub fn to<T>(self: NpFile) -> <any>;
```
## NpFile::key\_neq

```rust
pub fn key_neq(self: NpFile, object: <any>) -> bool;
```
## NpFile::key\_eq

```rust
pub fn key_eq(self: NpFile, object: <any>) -> bool;
```
## NpFile::to\_set

```rust
pub fn to_set(self: NpFile) -> *NpFile;
```
