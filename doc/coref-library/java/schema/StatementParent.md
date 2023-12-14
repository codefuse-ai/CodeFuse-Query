# StatementParent

Inherit from [ElementParent](./ElementParent.md)

Primary key: `id: int`

```rust
schema StatementParent extends ElementParent {
  @primary id: int,
}
```
## StatementParent::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: StatementParent) -> *ElementParent;
```
## StatementParent::getElementParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getElementParent(self: StatementParent) -> ElementParent;
```
## StatementParent::getLocation

```java
/**
* @brief gets the location info of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: StatementParent) -> Location;
```
## StatementParent::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *StatementParent;
```
## StatementParent::getAnAncestorForIndex

```java
/**
* @brief gets the index for printing AST.
* @return int 
*/
```
```rust
pub fn getAnAncestorForIndex(self: StatementParent, index: int) -> ElementParent;
```
## StatementParent::print

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn print(self: StatementParent) -> string;
```
## StatementParent::getType

```java
/**
* @brief gets the type of the element for printing AST.
* @return string 
*/
```
```rust
pub fn getType(self: StatementParent) -> string;
```
## StatementParent::getChild

```java
/**
* @brief get a child  statement of the element. 
* @return Statement 
*/
```
```rust
pub fn getChild(self: StatementParent) -> *Statement;
```
