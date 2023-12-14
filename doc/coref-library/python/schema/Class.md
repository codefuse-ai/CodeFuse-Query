# Class

Primary key: `element_oid: int`

```rust
schema Class {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## Class::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Class) -> string;
```
## Class::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Class) -> int;
```
## Class::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Class) -> Statement;
```
## Class::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Class) -> *CombineElement;
```
## Class::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: Class) -> *Statement;
```
## Class::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Class) -> int;
```
## Class::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Class) -> string;
```
## Class::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Class) -> Scope;
```
## Class::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Class) -> int;
```
## Class::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Class) -> NumberOfLines;
```
## Class::getBase

```rust
/**
     * @brief gets the base expression of the class, if any.
     * @return Expression
     */
```
```rust
pub fn getBase(self: Class) -> *Expression;
```
## Class::getAnAncestorInheritedClass

```rust
/**
     * @brief gets an ancestor inherited class of the class, if any.
     * @return Class
     */
```
```rust
pub fn getAnAncestorInheritedClass(self: Class) -> *Class;
```
## Class::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: Class) -> string;
```
## Class::getBaseName

```rust
/**
     * @brief gets the base name of the class, if any.
     * @return string
     */
```
```rust
pub fn getBaseName(self: Class) -> *string;
```
## Class::getInitFunction

```rust
/**
     * @brief gets the init function for the class, if any.
     * @return Function
     */
```
```rust
pub fn getInitFunction(self: Class) -> InitFunction;
```
## Class::getQualifiedName

```rust
/**
     * @brief gets the qualified name of the class.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: Class) -> string;
```
## Class::getAFunction

```rust
/**
     * @brief gets the function defined in the class, if any.
     * @return Function
     */
```
```rust
pub fn getAFunction(self: Class) -> *Function;
```
## Class::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Class) -> CombineElement;
```
## Class::getInheritedClass

```rust
/**
     * @brief gets the inherited class of the class, if any.
     * @return Class
     */
```
```rust
pub fn getInheritedClass(self: Class) -> Class;
```
## Class::getDecorator

```rust
/**
     * @brief gets the decorator of the class, if any.
     * @return Decorator
     */
```
```rust
pub fn getDecorator(self: Class) -> *Decorator;
```
## Class::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Class) -> Location;
```
## Class::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Class;
```
## Class::is\<T\>

```rust
pub fn is<T>(self: Class) -> bool;
```
## Class::to\<T\>

```rust
pub fn to<T>(self: Class) -> <any>;
```
## Class::key\_neq

```rust
pub fn key_neq(self: Class, object: <any>) -> bool;
```
## Class::key\_eq

```rust
pub fn key_eq(self: Class, object: <any>) -> bool;
```
## Class::to\_set

```rust
pub fn to_set(self: Class) -> *Class;
```
