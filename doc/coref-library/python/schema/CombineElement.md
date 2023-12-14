# CombineElement

Primary key: `id: int`

```rust
schema CombineElement {
  @primary id: int,
}
```
## CombineElement::getType

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn getType(self: CombineElement) -> string;
```
## CombineElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CombineElement) -> Location;
```
## CombineElement::getParent

```rust
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

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: CombineElement) -> *CombineElement;
```
## CombineElement::print

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn print(self: CombineElement) -> string;
```
## CombineElement::getAnAncestorForIndex

```rust
/**
     * @brief gets the index for printing AST.
     * @return int 
     */
```
```rust
pub fn getAnAncestorForIndex(self: CombineElement, index: int) -> CombineElement;
```
## CombineElement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CombineElement;
```
## CombineElement::is\<T\>

```rust
pub fn is<T>(self: CombineElement) -> bool;
```
## CombineElement::to\<T\>

```rust
pub fn to<T>(self: CombineElement) -> <any>;
```
## CombineElement::key\_neq

```rust
pub fn key_neq(self: CombineElement, object: <any>) -> bool;
```
## CombineElement::key\_eq

```rust
pub fn key_eq(self: CombineElement, object: <any>) -> bool;
```
## CombineElement::to\_set

```rust
pub fn to_set(self: CombineElement) -> *CombineElement;
```
