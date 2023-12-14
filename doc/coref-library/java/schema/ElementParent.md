# ElementParent

Primary key: `id: int`

```rust
schema ElementParent {
  @primary id: int,
}
```
## ElementParent::getType

```java
/**
* @brief gets the type of the element for printing AST.
* @return string 
*/
```
```rust
pub fn getType(self: ElementParent) -> string;
```
## ElementParent::print

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn print(self: ElementParent) -> string;
```
## ElementParent::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ElementParent;
```
## ElementParent::getAnAncestorForIndex

```java
/**
* @brief gets the index for printing AST.
* @return int 
*/
```
```rust
pub fn getAnAncestorForIndex(self: ElementParent, index: int) -> ElementParent;
```
## ElementParent::getLocation

```java
/**
* @brief gets the location info of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: ElementParent) -> Location;
```
## ElementParent::getElementParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getElementParent(self: ElementParent) -> ElementParent;
```
## ElementParent::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ElementParent) -> *ElementParent;
```
