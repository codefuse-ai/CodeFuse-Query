# InterfaceDO

Primary key: `element_hash_id: int`

```rust
schema InterfaceDO {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## InterfaceDO::getIdentifierHashId

```java
/**
* @brief gets the identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getIdentifierHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: InterfaceDO) -> string;
```
## InterfaceDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *InterfaceDO;
```
