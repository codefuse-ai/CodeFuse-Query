# MethodDO

Primary key: `element_hash_id: int`

```rust
schema MethodDO {
  definition_body: string,
  parent_hash_id: int,
  type_hash_id: int,
  signature: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodDO::getDefinitionBody

```rust
pub fn getDefinitionBody(self: MethodDO) -> string;
```
## MethodDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: MethodDO) -> int;
```
## MethodDO::getSignature

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: MethodDO) -> string;
```
## MethodDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: MethodDO) -> int;
```
## MethodDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodDO;
```
## MethodDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: MethodDO) -> int;
```
## MethodDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: MethodDO) -> string;
```
