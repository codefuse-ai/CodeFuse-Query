# TokenDO

Primary key: `element_hash_id: int`

```rust
schema TokenDO {
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## TokenDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TokenDO) -> int;
```
## TokenDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: TokenDO) -> string;
```
## TokenDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TokenDO) -> int;
```
## TokenDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TokenDO;
```
