# Arg

Inherit from [ArgDO](./ArgDO.md)

Primary key: `element_oid: int`

```rust
schema Arg extends ArgDO {
  @primary element_oid: int,
  annotation: int,
  element_index: int,
  parent_oid: int,
  location_oid: int,
  printable_text: string
}
```
## Arg::getAnnotationOid

```java
/**
* @brief gets the annotation of this element.
* @return int
*/
```
```rust
pub fn getAnnotationOid(self: Arg) -> int;
```
## Arg::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Arg) -> int;
```
## Arg::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Arg) -> int;
```
## Arg::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Arg) -> string;
```
## Arg::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Arg) -> Location;
```
## Arg::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Arg) -> int;
```
## Arg::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Arg) -> CombineElement;
```
## Arg::getAnnotation

```java
/**
* @brief gets the annotation element of the element, if any.
* @return Expression 
*/
```
```rust
pub fn getAnnotation(self: Arg) -> Expression;
```
## Arg::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Arg) -> *CombineElement;
```
## Arg::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Arg;
```
