# Decorator

Inherit from [Expression](./Expression.md)

Primary key: `element_oid: int`

```rust
schema Decorator extends Expression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## Decorator::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Decorator) -> *CombineElement;
```
## Decorator::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Decorator) -> NumberOfLines;
```
## Decorator::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Decorator) -> int;
```
## Decorator::getParent

```java
/**
* @brief gets the parent of the expression.
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Decorator) -> CombineElement;
```
## Decorator::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Decorator) -> int;
```
## Decorator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Decorator;
```
## Decorator::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Decorator) -> Location;
```
## Decorator::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: Decorator) -> Scope;
```
## Decorator::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Decorator) -> string;
```
## Decorator::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Decorator) -> int;
```
## Decorator::getDecoratedElement

```java
/**
* @brief gets the decorated element of the element, a class or a function.
* @return CombineElement
*/
```
```rust
pub fn getDecoratedElement(self: Decorator) -> CombineElement;
```
## Decorator::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Decorator) -> string;
```
