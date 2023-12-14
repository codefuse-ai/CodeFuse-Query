# NpClassDO

Primary key: `element_hash_id: int`

```rust
schema NpClassDO {
  parent_hash_id: int,
  qualified_name: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpClassDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpClassDO) -> string;
```
## NpClassDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpClassDO) -> int;
```
## NpClassDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpClassDO) -> string;
```
## NpClassDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpClassDO;
```
