# NpInterface

Inherit from [NpInterfaceDO](./NpInterfaceDO.md)

Primary key: `element_hash_id: int`

```rust
schema NpInterface extends NpInterfaceDO {
  @primary element_hash_id: int,
  name: string,
  qualified_name: string,
  parent_hash_id: int,
}
```
## NpInterface::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpInterface) -> string;
```
## NpInterface::getParent

```java
/**
* @brief gets the parent of this element.
* @return ElementParent
*/
```
```rust
pub fn getParent(self: NpInterface) -> ElementParent;
```
## NpInterface::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpInterface) -> string;
```
## NpInterface::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpInterface) -> int;
```
## NpInterface::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpInterface;
```
