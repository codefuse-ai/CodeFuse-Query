# FileDO

Primary key: `element_hash_id: int`

```rust
schema FileDO {
  number_of_lines_hash_id: int,
  extension: string,
  name: string,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## FileDO::getNumberOfLinesHashId

```java
/**
* @brief gets the number of lines hash id of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesHashId(self: FileDO) -> int;
```
## FileDO::getExtension

```java
/**
* @brief gets the extension of this element.
* @return string
*/
```
```rust
pub fn getExtension(self: FileDO) -> string;
```
## FileDO::getRelativePath

```java
/**
* @brief gets the relative path  of this element.
* @return string
*/
```
```rust
pub fn getRelativePath(self: FileDO) -> string;
```
## FileDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FileDO) -> string;
```
## FileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *FileDO;
```
