# ModifierList

Primary key: `element_hash_id: int`

```rust
schema ModifierList {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
}
```
## ModifierList::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ModifierList) -> int;
```
## ModifierList::getConstructorParent

```rust
/**
     * @brief gets the parent of the modifier list if the parent is a Constructor.
     * @return Constructor 
     */
```
```rust
pub fn getConstructorParent(self: ModifierList) -> Constructor;
```
## ModifierList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ModifierList;
```
## ModifierList::getMethodParent

```rust
/**
     * @brief gets the parent of the modifier list if the parent is a Method.
     * @return Method 
     */
```
```rust
pub fn getMethodParent(self: ModifierList) -> Method;
```
## ModifierList::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ModifierList) -> int;
```
## ModifierList::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ModifierList) -> Location;
```
## ModifierList::getFieldParent

```rust
/**
     * @brief gets the parent of the modifier list if the parent is a Field.
     * @return Field 
     */
```
```rust
pub fn getFieldParent(self: ModifierList) -> Field;
```
## ModifierList::getClassParent

```rust
/**
     * @brief gets the parent of the modifier list if the parent is a class.
     * @return Class 
     */
```
```rust
pub fn getClassParent(self: ModifierList) -> Class;
```
## ModifierList::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ModifierList) -> ElementParent;
```
## ModifierList::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ModifierList) -> *ElementParent;
```
## ModifierList::is\<T\>

```rust
pub fn is<T>(self: ModifierList) -> bool;
```
## ModifierList::to\<T\>

```rust
pub fn to<T>(self: ModifierList) -> <any>;
```
## ModifierList::key\_neq

```rust
pub fn key_neq(self: ModifierList, object: <any>) -> bool;
```
## ModifierList::key\_eq

```rust
pub fn key_eq(self: ModifierList, object: <any>) -> bool;
```
## ModifierList::to\_set

```rust
pub fn to_set(self: ModifierList) -> *ModifierList;
```
