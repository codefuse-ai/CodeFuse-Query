# Identifier

Primary key: `element_hash_id: int`

```rust
schema Identifier {
  @primary element_hash_id: int,
  location_hash_id: int,
  name: string,
  parent_hash_id: int,
}
```
## Identifier::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Identifier) -> string;
```
## Identifier::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Identifier) -> int;
```
## Identifier::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Identifier) -> ElementParent;
```
## Identifier::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Identifier) -> int;
```
## Identifier::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Identifier) -> Location;
```
## Identifier::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Identifier) -> *ElementParent;
```
## Identifier::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Identifier;
```
## Identifier::is\<T\>

```rust
pub fn is<T>(self: Identifier) -> bool;
```
## Identifier::to\<T\>

```rust
pub fn to<T>(self: Identifier) -> <any>;
```
## Identifier::key\_neq

```rust
pub fn key_neq(self: Identifier, object: <any>) -> bool;
```
## Identifier::key\_eq

```rust
pub fn key_eq(self: Identifier, object: <any>) -> bool;
```
## Identifier::to\_set

```rust
pub fn to_set(self: Identifier) -> *Identifier;
```
