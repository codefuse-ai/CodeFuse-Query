# Identifier

Inherit from [IdentifierDO](./IdentifierDO.md)

Primary key: `element_hash_id: int`

```rust
schema Identifier extends IdentifierDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  name: string,
  parent_hash_id: int
}
```
## Identifier::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Identifier) -> string;
```
## Identifier::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Identifier) -> int;
```
## Identifier::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Identifier) -> ElementParent;
```
## Identifier::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Identifier) -> int;
```
## Identifier::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Identifier) -> Location;
```
## Identifier::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Identifier) -> *ElementParent;
```
## Identifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Identifier;
```
