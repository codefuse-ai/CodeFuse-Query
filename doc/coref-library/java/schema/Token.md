# Token

Inherit from [TokenDO](./TokenDO.md)

Primary key: `element_hash_id: int`

```rust
schema Token extends TokenDO {
  @primary element_hash_id: int,
  value: string,
  location_hash_id: int,
  parent_hash_id: int
}
```
## Token::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Token) -> int;
```
## Token::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Token) -> int;
```
## Token::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Token) -> Location;
```
## Token::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: Token) -> string;
```
## Token::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Token) -> ElementParent;
```
## Token::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Token) -> *ElementParent;
```
## Token::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Token;
```
