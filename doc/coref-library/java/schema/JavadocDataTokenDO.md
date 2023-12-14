# JavadocDataTokenDO

Primary key: `element_hash_id: int`

```rust
schema JavadocDataTokenDO {
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## JavadocDataTokenDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: JavadocDataTokenDO) -> string;
```
## JavadocDataTokenDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocDataTokenDO) -> int;
```
## JavadocDataTokenDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocDataTokenDO;
```
