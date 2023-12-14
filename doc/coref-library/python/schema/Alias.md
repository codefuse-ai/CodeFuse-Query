# Alias

Inherit from [AliasDO](./AliasDO.md)

Primary key: `element_oid: int`

```rust
schema Alias extends AliasDO {
  @primary element_oid: int,
  name: string,
  asname: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  printable_text: string,
}
```
## Alias::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Alias) -> string;
```
## Alias::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Alias) -> int;
```
## Alias::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Alias) -> int;
```
## Alias::getAsname

```java
/**
* @brief gets the asname of this element.
* @return string
*/
```
```rust
pub fn getAsname(self: Alias) -> string;
```
## Alias::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Alias) -> string;
```
## Alias::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Alias) -> CombineElement;
```
## Alias::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Alias) -> int;
```
## Alias::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Alias) -> Location;
```
## Alias::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Alias) -> *CombineElement;
```
## Alias::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Alias;
```
