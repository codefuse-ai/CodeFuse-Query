# ReferenceList

Inherit from [ReferenceListDO](./ReferenceListDO.md)

Primary key: `element_hash_id: int`

```rust
schema ReferenceList extends ReferenceListDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  role: string,
  parent_hash_id: int,
  printable_text: string
}
```
## ReferenceList::getRole

```java
/**
* @brief gets the role of this element.
* @return string
*/
```
```rust
pub fn getRole(self: ReferenceList) -> string;
```
## ReferenceList::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ReferenceList) -> int;
```
## ReferenceList::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ReferenceList) -> string;
```
## ReferenceList::getParent

```java
/**
* @brief gets the location for the element.
* @return ElementParent
*/
```
```rust
pub fn getParent(self: ReferenceList) -> ElementParent;
```
## ReferenceList::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ReferenceList) -> int;
```
## ReferenceList::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ReferenceList) -> Location;
```
## ReferenceList::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ReferenceList) -> *ElementParent;
```
## ReferenceList::getChild

```java
/**
* @brief gets the reference element of the list
* @return ReferenceElement 
*/
```
```rust
pub fn getChild(self: ReferenceList) -> *ReferenceElement;
```
## ReferenceList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceList;
```
