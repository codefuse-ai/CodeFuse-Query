# NpFileDO

Primary key: `element_hash_id: int`

```rust
schema NpFileDO {
  project_hash_id: int,
  name: string,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## NpFileDO::getProjectHashId

```java
/**
* @brief gets the project hash id of this element.
* @return int
*/
```
```rust
pub fn getProjectHashId(self: NpFileDO) -> int;
```
## NpFileDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpFileDO) -> string;
```
## NpFileDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpFileDO) -> string;
```
## NpFileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpFileDO;
```
