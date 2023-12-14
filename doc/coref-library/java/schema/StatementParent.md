# StatementParent

Primary key: `id: int`

```rust
schema StatementParent {
  @primary id: int,
}
```
## StatementParent::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: StatementParent) -> *ElementParent;
```
## StatementParent::getElementParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getElementParent(self: StatementParent) -> ElementParent;
```
## StatementParent::getLocation

```rust
/**
     * @brief gets the location info of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: StatementParent) -> Location;
```
## StatementParent::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StatementParent;
```
## StatementParent::getAnAncestorForIndex

```rust
/**
     * @brief gets the index for printing AST.
     * @return int 
     */
```
```rust
pub fn getAnAncestorForIndex(self: StatementParent, index: int) -> ElementParent;
```
## StatementParent::print

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn print(self: StatementParent) -> string;
```
## StatementParent::getType

```rust
/**
     * @brief gets the type of the element for printing AST.
     * @return string 
     */
```
```rust
pub fn getType(self: StatementParent) -> string;
```
## StatementParent::getChild

```rust
/**
     * @brief get a child  statement of the element. 
     * @return Statement 
     */
```
```rust
pub fn getChild(self: StatementParent) -> *Statement;
```
## StatementParent::is\<T\>

```rust
pub fn is<T>(self: StatementParent) -> bool;
```
## StatementParent::to\<T\>

```rust
pub fn to<T>(self: StatementParent) -> <any>;
```
## StatementParent::key\_neq

```rust
pub fn key_neq(self: StatementParent, object: <any>) -> bool;
```
## StatementParent::key\_eq

```rust
pub fn key_eq(self: StatementParent, object: <any>) -> bool;
```
## StatementParent::to\_set

```rust
pub fn to_set(self: StatementParent) -> *StatementParent;
```
