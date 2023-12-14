# Token

Primary key: `element_hash_id: int`

```rust
schema Token {
  @primary element_hash_id: int,
  value: string,
  location_hash_id: int,
  parent_hash_id: int,
}
```
## Token::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Token) -> int;
```
## Token::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Token) -> int;
```
## Token::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Token) -> Location;
```
## Token::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: Token) -> string;
```
## Token::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Token) -> ElementParent;
```
## Token::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Token) -> *ElementParent;
```
## Token::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Token;
```
## Token::is\<T\>

```rust
pub fn is<T>(self: Token) -> bool;
```
## Token::to\<T\>

```rust
pub fn to<T>(self: Token) -> <any>;
```
## Token::key\_neq

```rust
pub fn key_neq(self: Token, object: <any>) -> bool;
```
## Token::key\_eq

```rust
pub fn key_eq(self: Token, object: <any>) -> bool;
```
## Token::to\_set

```rust
pub fn to_set(self: Token) -> *Token;
```
