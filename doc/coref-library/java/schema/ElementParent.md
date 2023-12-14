# ElementParent

Primary key: `id: int`

```rust
schema ElementParent {
  @primary id: int,
}
```
## ElementParent::getType

```rust
/**
     * @brief gets the type of the element for printing AST.
     * @return string 
     */
```
```rust
pub fn getType(self: ElementParent) -> string;
```
## ElementParent::print

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn print(self: ElementParent) -> string;
```
## ElementParent::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ElementParent;
```
## ElementParent::getAnAncestorForIndex

```rust
/**
     * @brief gets the index for printing AST.
     * @return int 
     */
```
```rust
pub fn getAnAncestorForIndex(self: ElementParent, index: int) -> ElementParent;
```
## ElementParent::getLocation

```rust
/**
     * @brief gets the location info of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: ElementParent) -> Location;
```
## ElementParent::getElementParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getElementParent(self: ElementParent) -> ElementParent;
```
## ElementParent::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ElementParent) -> *ElementParent;
```
## ElementParent::is\<T\>

```rust
pub fn is<T>(self: ElementParent) -> bool;
```
## ElementParent::to\<T\>

```rust
pub fn to<T>(self: ElementParent) -> <any>;
```
## ElementParent::key\_neq

```rust
pub fn key_neq(self: ElementParent, object: <any>) -> bool;
```
## ElementParent::key\_eq

```rust
pub fn key_eq(self: ElementParent, object: <any>) -> bool;
```
## ElementParent::to\_set

```rust
pub fn to_set(self: ElementParent) -> *ElementParent;
```
