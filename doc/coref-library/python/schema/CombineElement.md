# CombineElement

Primary key: `id: int`

```rust
schema CombineElement {
  @primary id: int
}
```
## CombineElement::getType

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn getType(self: CombineElement) -> string;
```
## CombineElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: CombineElement) -> Location;
```
## CombineElement::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: CombineElement) -> CombineElement;
```
## CombineElement::getParentOid

```rust
pub fn getParentOid(self: CombineElement) -> int;
```
## CombineElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: CombineElement) -> *CombineElement;
```
## CombineElement::print

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn print(self: CombineElement) -> string;
```
## CombineElement::getAnAncestorForIndex

```java
/**
* @brief gets the index for printing AST.
* @return int 
*/
```
```rust
pub fn getAnAncestorForIndex(self: CombineElement, index: int) -> CombineElement;
```
## CombineElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CombineElement;
```
