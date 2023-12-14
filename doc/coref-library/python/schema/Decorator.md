# Decorator

Primary key: `element_oid: int`

```rust
schema Decorator {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## Decorator::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Decorator) -> *CombineElement;
```
## Decorator::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Decorator) -> NumberOfLines;
```
## Decorator::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Decorator) -> int;
```
## Decorator::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Decorator) -> CombineElement;
```
## Decorator::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Decorator) -> int;
```
## Decorator::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Decorator;
```
## Decorator::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Decorator) -> Location;
```
## Decorator::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Decorator) -> Scope;
```
## Decorator::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Decorator) -> string;
```
## Decorator::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Decorator) -> int;
```
## Decorator::getDecoratedElement

```rust
/**
     * @brief gets the decorated element of the element, a class or a function.
     * @return CombineElement
     */
```
```rust
pub fn getDecoratedElement(self: Decorator) -> CombineElement;
```
## Decorator::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Decorator) -> string;
```
## Decorator::is\<T\>

```rust
pub fn is<T>(self: Decorator) -> bool;
```
## Decorator::to\<T\>

```rust
pub fn to<T>(self: Decorator) -> <any>;
```
## Decorator::key\_neq

```rust
pub fn key_neq(self: Decorator, object: <any>) -> bool;
```
## Decorator::key\_eq

```rust
pub fn key_eq(self: Decorator, object: <any>) -> bool;
```
## Decorator::to\_set

```rust
pub fn to_set(self: Decorator) -> *Decorator;
```
