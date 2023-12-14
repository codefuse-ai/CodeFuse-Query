# Modifier

Inherit from [ModifierDO](./ModifierDO.md)

Primary key: `element_hash_id: int`

```rust
schema Modifier extends ModifierDO {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
}
```
## Modifier::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Modifier) -> string;
```
## Modifier::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Modifier) -> int;
```
## Modifier::getModifierList

```java
/**
* @brief gets the modifier list of the modifier occurs.
* @return ModifierList 
*/
```
```rust
pub fn getModifierList(self: Modifier) -> ModifierList;
```
## Modifier::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Modifier) -> int;
```
## Modifier::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Modifier) -> Location;
```
## Modifier::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Modifier) -> ElementParent;
```
## Modifier::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Modifier) -> *ElementParent;
```
## Modifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Modifier;
```
