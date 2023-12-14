# ExpressionParent

Primary key: `id: int`

```rust
schema ExpressionParent {
  @primary id: int,
}
```
## ExpressionParent::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ExpressionParent) -> *ElementParent;
```
## ExpressionParent::getElementParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getElementParent(self: ExpressionParent) -> ElementParent;
```
## ExpressionParent::getLocation

```rust
/**
     * @brief gets the location info of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: ExpressionParent) -> Location;
```
## ExpressionParent::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionParent;
```
## ExpressionParent::getAnAncestorForIndex

```rust
/**
     * @brief gets the index for printing AST.
     * @return int 
     */
```
```rust
pub fn getAnAncestorForIndex(self: ExpressionParent, index: int) -> ElementParent;
```
## ExpressionParent::print

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn print(self: ExpressionParent) -> string;
```
## ExpressionParent::getType

```rust
/**
     * @brief gets the type of the element for printing AST.
     * @return string 
     */
```
```rust
pub fn getType(self: ExpressionParent) -> string;
```
## ExpressionParent::getChild

```rust
/**
     * @brief get a child expression of the element. 
     * @return Expression 
     */
```
```rust
pub fn getChild(self: ExpressionParent) -> *Expression;
```
## ExpressionParent::is\<T\>

```rust
pub fn is<T>(self: ExpressionParent) -> bool;
```
## ExpressionParent::to\<T\>

```rust
pub fn to<T>(self: ExpressionParent) -> <any>;
```
## ExpressionParent::key\_neq

```rust
pub fn key_neq(self: ExpressionParent, object: <any>) -> bool;
```
## ExpressionParent::key\_eq

```rust
pub fn key_eq(self: ExpressionParent, object: <any>) -> bool;
```
## ExpressionParent::to\_set

```rust
pub fn to_set(self: ExpressionParent) -> *ExpressionParent;
```
