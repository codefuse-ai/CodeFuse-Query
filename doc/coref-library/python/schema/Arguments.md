# Arguments

Inherit from [ArgumentsDO](./ArgumentsDO.md)

Primary key: `element_oid: int`

```rust
schema Arguments extends ArgumentsDO {
  @primary element_oid: int,
  parent_oid: int,
  printable_text: string,
}
```
## Arguments::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Arguments) -> int;
```
## Arguments::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Arguments) -> string;
```
## Arguments::getLocation

```java
/**
* @brief gets the location for the element's parent since this type has no location info.
* @return Location
*/
```
```rust
pub fn getLocation(self: Arguments) -> Location;
```
## Arguments::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Arguments) -> CombineElement;
```
## Arguments::getArgByIndex

```java
/**
* @brief gets the arg in the arguments by index, if any.
* @return Arg
*/
```
```rust
pub fn getArgByIndex(self: Arguments, i: int) -> Arg;
```
## Arguments::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Arguments) -> *CombineElement;
```
## Arguments::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Arguments;
```
