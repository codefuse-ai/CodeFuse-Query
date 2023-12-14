# Expression

Primary key: `element_oid: int`

```rust
schema Expression {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## Expression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Expression) -> string;
```
## Expression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Expression) -> int;
```
## Expression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Expression) -> string;
```
## Expression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Expression) -> Scope;
```
## Expression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Expression) -> Location;
```
## Expression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Expression) -> int;
```
## Expression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Expression) -> CombineElement;
```
## Expression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Expression) -> int;
```
## Expression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Expression) -> NumberOfLines;
```
## Expression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Expression) -> *CombineElement;
```
## Expression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Expression;
```
## Expression::is\<T\>

```rust
pub fn is<T>(self: Expression) -> bool;
```
## Expression::to\<T\>

```rust
pub fn to<T>(self: Expression) -> <any>;
```
## Expression::key\_neq

```rust
pub fn key_neq(self: Expression, object: <any>) -> bool;
```
## Expression::key\_eq

```rust
pub fn key_eq(self: Expression, object: <any>) -> bool;
```
## Expression::to\_set

```rust
pub fn to_set(self: Expression) -> *Expression;
```
