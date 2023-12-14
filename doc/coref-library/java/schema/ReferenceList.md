# ReferenceList

Primary key: `element_hash_id: int`

```rust
schema ReferenceList {
  @primary element_hash_id: int,
  location_hash_id: int,
  role: string,
  parent_hash_id: int,
  printable_text: string,
}
```
## ReferenceList::getRole

```rust
/**
     * @brief gets the role of this element.
     * @return string
     */
```
```rust
pub fn getRole(self: ReferenceList) -> string;
```
## ReferenceList::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceList) -> int;
```
## ReferenceList::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceList) -> string;
```
## ReferenceList::getParent

```rust
/**
     * @brief gets the location for the element.
     * @return ElementParent
     */
```
```rust
pub fn getParent(self: ReferenceList) -> ElementParent;
```
## ReferenceList::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceList) -> int;
```
## ReferenceList::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ReferenceList) -> Location;
```
## ReferenceList::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ReferenceList) -> *ElementParent;
```
## ReferenceList::getChild

```rust
/**
     * @brief gets the reference element of the list
     * @return ReferenceElement 
     */
```
```rust
pub fn getChild(self: ReferenceList) -> *ReferenceElement;
```
## ReferenceList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceList;
```
## ReferenceList::is\<T\>

```rust
pub fn is<T>(self: ReferenceList) -> bool;
```
## ReferenceList::to\<T\>

```rust
pub fn to<T>(self: ReferenceList) -> <any>;
```
## ReferenceList::key\_neq

```rust
pub fn key_neq(self: ReferenceList, object: <any>) -> bool;
```
## ReferenceList::key\_eq

```rust
pub fn key_eq(self: ReferenceList, object: <any>) -> bool;
```
## ReferenceList::to\_set

```rust
pub fn to_set(self: ReferenceList) -> *ReferenceList;
```
