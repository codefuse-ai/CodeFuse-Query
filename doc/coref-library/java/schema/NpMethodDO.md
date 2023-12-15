# NpMethodDO

Primary key: `element_hash_id: int`

```rust
schema NpMethodDO {
  parent_hash_id: int,
  type_hash_id: int,
  signature: string,
  name: string,
  @primary element_hash_id: int
}
```
## NpMethodDO::getSignature

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: NpMethodDO) -> string;
```
## NpMethodDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpMethodDO) -> int;
```
## NpMethodDO::getTypeHashId

```java
/**
* @brief gets the return type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: NpMethodDO) -> int;
```
## NpMethodDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpMethodDO) -> string;
```
## NpMethodDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpMethodDO;
```
