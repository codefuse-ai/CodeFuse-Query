# WithItem

Primary key: `element_oid: int`

```rust
schema WithItem {
  @primary element_oid: int,
  printable_text: string,
  element_index: int,
  parent_oid: int,
}
```
## WithItem::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: WithItem) -> int;
```
## WithItem::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: WithItem) -> string;
```
## WithItem::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: WithItem) -> int;
```
## WithItem::getLocation

```java
/**
* @brief gets the location for the element's parent since this type has no location info.
* @return Location
*/
```
```rust
pub fn getLocation(self: WithItem) -> Location;
```
## WithItem::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: WithItem) -> CombineElement;
```
## WithItem::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: WithItem) -> *CombineElement;
```
## WithItem::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *WithItem;
```
