# ResourceList

Inherit from [ResourceListDO](./ResourceListDO.md)

Primary key: `element_hash_id: int`

```rust
schema ResourceList extends ResourceListDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int
}
```
## ResourceList::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ResourceList) -> string;
```
## ResourceList::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ResourceList) -> int;
```
## ResourceList::getLocalVariable

```java
/**
* @brief get i-th LocalVariable of the element
* @return LocalVariable 
*/
```
```rust
pub fn getLocalVariable(self: ResourceList) -> LocalVariable;
```
## ResourceList::getIthLocalVariable

```java
/**
* @brief get i-th LocalVariable of the element
* @return LocalVariable 
*/
```
```rust
pub fn getIthLocalVariable(self: ResourceList, index: int) -> LocalVariable;
```
## ResourceList::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ResourceList) -> ElementParent;
```
## ResourceList::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ResourceList) -> int;
```
## ResourceList::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ResourceList) -> Location;
```
## ResourceList::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ResourceList) -> *ElementParent;
```
## ResourceList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ResourceList;
```
