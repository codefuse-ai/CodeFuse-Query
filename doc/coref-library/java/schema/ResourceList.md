# ResourceList

Primary key: `element_hash_id: int`

```rust
schema ResourceList {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## ResourceList::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ResourceList) -> string;
```
## ResourceList::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ResourceList) -> int;
```
## ResourceList::getLocalVariable

```rust
/**
     * @brief get i-th LocalVariable of the element
     * @return LocalVariable 
     */
```
```rust
pub fn getLocalVariable(self: ResourceList) -> LocalVariable;
```
## ResourceList::getIthLocalVariable

```rust
/**
     * @brief get i-th LocalVariable of the element
     * @return LocalVariable 
     */
```
```rust
pub fn getIthLocalVariable(self: ResourceList, index: int) -> LocalVariable;
```
## ResourceList::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ResourceList) -> ElementParent;
```
## ResourceList::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ResourceList) -> int;
```
## ResourceList::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ResourceList) -> Location;
```
## ResourceList::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ResourceList) -> *ElementParent;
```
## ResourceList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ResourceList;
```
## ResourceList::is\<T\>

```rust
pub fn is<T>(self: ResourceList) -> bool;
```
## ResourceList::to\<T\>

```rust
pub fn to<T>(self: ResourceList) -> <any>;
```
## ResourceList::key\_neq

```rust
pub fn key_neq(self: ResourceList, object: <any>) -> bool;
```
## ResourceList::key\_eq

```rust
pub fn key_eq(self: ResourceList, object: <any>) -> bool;
```
## ResourceList::to\_set

```rust
pub fn to_set(self: ResourceList) -> *ResourceList;
```
