# IdentifierDO

Primary key: `element_hash_id: int`

```rust
schema IdentifierDO {
  parent_hash_id: int,
  name: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## IdentifierDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: IdentifierDO) -> int;
```
## IdentifierDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: IdentifierDO) -> int;
```
## IdentifierDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: IdentifierDO) -> string;
```
## IdentifierDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IdentifierDO;
```
