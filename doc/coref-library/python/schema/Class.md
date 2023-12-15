# Class

Inherit from [ClassDefStatement](./ClassDefStatement.md)

Primary key: `element_oid: int`

```rust
schema Class extends ClassDefStatement {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string
}
```
## Class::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Class) -> string;
```
## Class::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Class) -> int;
```
## Class::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: Class) -> Statement;
```
## Class::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Class) -> *CombineElement;
```
## Class::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: Class) -> *Statement;
```
## Class::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Class) -> int;
```
## Class::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Class) -> string;
```
## Class::getEnclosingScope

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: Class) -> Scope;
```
## Class::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Class) -> int;
```
## Class::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Class) -> NumberOfLines;
```
## Class::getBase

```java
/**
* @brief gets the base expression of the class, if any.
* @return Expression
*/
```
```rust
pub fn getBase(self: Class) -> *Expression;
```
## Class::getAnAncestorInheritedClass

```java
/**
* @brief gets an ancestor inherited class of the class, if any.
* @return Class
*/
```
```rust
pub fn getAnAncestorInheritedClass(self: Class) -> *Class;
```
## Class::getName

```java
/**
* @brief gets the name of the class.
* @return string 
*/
```
```rust
pub fn getName(self: Class) -> string;
```
## Class::getBaseName

```java
/**
* @brief gets the base name of the class, if any.
* @return string
*/
```
```rust
pub fn getBaseName(self: Class) -> *string;
```
## Class::getInitFunction

```java
/**
* @brief gets the init function for the class, if any.
* @return Function
*/
```
```rust
pub fn getInitFunction(self: Class) -> InitFunction;
```
## Class::getQualifiedName

```java
/**
* @brief gets the qualified name of the class.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: Class) -> string;
```
## Class::getAFunction

```java
/**
* @brief gets the function defined in the class, if any.
* @return Function
*/
```
```rust
pub fn getAFunction(self: Class) -> *Function;
```
## Class::getParent

```java
/**
* @brief gets the parent element of the statement
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Class) -> CombineElement;
```
## Class::getInheritedClass

```java
/**
* @brief gets the inherited class of the class, if any.
* @return Class
*/
```
```rust
pub fn getInheritedClass(self: Class) -> Class;
```
## Class::getDecorator

```java
/**
* @brief gets the decorator of the class, if any.
* @return Decorator
*/
```
```rust
pub fn getDecorator(self: Class) -> *Decorator;
```
## Class::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Class) -> Location;
```
## Class::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Class;
```
