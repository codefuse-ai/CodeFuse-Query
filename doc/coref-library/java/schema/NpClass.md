# NpClass

Inherit from [NpClassDO](./NpClassDO.md)

Primary key: `element_hash_id: int`

```rust
schema NpClass extends NpClassDO {
  @primary element_hash_id: int,
  name: string,
  qualified_name: string,
  parent_hash_id: int,
}
```
## NpClass::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpClass) -> string;
```
## NpClass::getParent

```java
/**
* @brief gets the parent of this element.
* @return ElementParent
*/
```
```rust
pub fn getParent(self: NpClass) -> ElementParent;
```
## NpClass::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpClass) -> string;
```
## NpClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpClass) -> int;
```
## NpClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpClass;
```
