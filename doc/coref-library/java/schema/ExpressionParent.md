# ExpressionParent

Inherit from [ElementParent](./ElementParent.md)

Primary key: `id: int`

```rust
schema ExpressionParent extends ElementParent {
  @primary id: int,
}
```
## ExpressionParent::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ExpressionParent) -> *ElementParent;
```
## ExpressionParent::getElementParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getElementParent(self: ExpressionParent) -> ElementParent;
```
## ExpressionParent::getLocation

```java
/**
* @brief gets the location info of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: ExpressionParent) -> Location;
```
## ExpressionParent::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionParent;
```
## ExpressionParent::getAnAncestorForIndex

```java
/**
* @brief gets the index for printing AST.
* @return int 
*/
```
```rust
pub fn getAnAncestorForIndex(self: ExpressionParent, index: int) -> ElementParent;
```
## ExpressionParent::print

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn print(self: ExpressionParent) -> string;
```
## ExpressionParent::getType

```java
/**
* @brief gets the type of the element for printing AST.
* @return string 
*/
```
```rust
pub fn getType(self: ExpressionParent) -> string;
```
## ExpressionParent::getChild

```java
/**
* @brief get a child expression of the element. 
* @return Expression 
*/
```
```rust
pub fn getChild(self: ExpressionParent) -> *Expression;
```
