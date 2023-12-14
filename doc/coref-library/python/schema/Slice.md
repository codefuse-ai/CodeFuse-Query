# Slice

Inherit from [SliceDO](./SliceDO.md)

Primary key: `element_oid: int`

```rust
schema Slice extends SliceDO {
  @primary element_oid: int,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  printable_text: string,
  has_step: int,
}
```
## Slice::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Slice) -> int;
```
## Slice::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Slice) -> string;
```
## Slice::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Slice) -> int;
```
## Slice::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Slice) -> Location;
```
## Slice::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Slice) -> int;
```
## Slice::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Slice) -> CombineElement;
```
## Slice::getHasStep

```java
/**
* @brief gets the has step of this element.
* @return int
*/
```
```rust
pub fn getHasStep(self: Slice) -> int;
```
## Slice::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Slice) -> *CombineElement;
```
## Slice::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Slice;
```
