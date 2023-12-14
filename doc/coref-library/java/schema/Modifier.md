# Modifier

Primary key: `element_hash_id: int`

```rust
schema Modifier {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
}
```
## Modifier::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Modifier) -> string;
```
## Modifier::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Modifier) -> int;
```
## Modifier::getModifierList

```rust
/**
     * @brief gets the modifier list of the modifier occurs.
     * @return ModifierList 
     */
```
```rust
pub fn getModifierList(self: Modifier) -> ModifierList;
```
## Modifier::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Modifier) -> int;
```
## Modifier::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Modifier) -> Location;
```
## Modifier::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Modifier) -> ElementParent;
```
## Modifier::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Modifier) -> *ElementParent;
```
## Modifier::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Modifier;
```
## Modifier::is\<T\>

```rust
pub fn is<T>(self: Modifier) -> bool;
```
## Modifier::to\<T\>

```rust
pub fn to<T>(self: Modifier) -> <any>;
```
## Modifier::key\_neq

```rust
pub fn key_neq(self: Modifier, object: <any>) -> bool;
```
## Modifier::key\_eq

```rust
pub fn key_eq(self: Modifier, object: <any>) -> bool;
```
## Modifier::to\_set

```rust
pub fn to_set(self: Modifier) -> *Modifier;
```
