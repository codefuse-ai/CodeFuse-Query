# ConstructorDO

Primary key: `element_hash_id: int`

```rust
schema ConstructorDO {
  definition_body: string,
  parent_hash_id: int,
  signature: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## ConstructorDO::getDefinitionBody

```rust
pub fn getDefinitionBody(self: ConstructorDO) -> string;
```
## ConstructorDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConstructorDO) -> int;
```
## ConstructorDO::getSignature

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: ConstructorDO) -> string;
```
## ConstructorDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConstructorDO) -> int;
```
## ConstructorDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ConstructorDO) -> string;
```
## ConstructorDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConstructorDO;
```
