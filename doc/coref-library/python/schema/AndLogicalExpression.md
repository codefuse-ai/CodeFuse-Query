# AndLogicalExpression

Primary key: `element_oid: int`

```rust
schema AndLogicalExpression {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## AndLogicalExpression::getType

```rust
/**
     * @brief gets the type of the expression.
     * @return string
     */
```
```rust
pub fn getType(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return int
     */
```
```rust
pub fn getSize(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: AndLogicalExpression) -> Scope;
```
## AndLogicalExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: AndLogicalExpression) -> CombineElement;
```
## AndLogicalExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AndLogicalExpression) -> Location;
```
## AndLogicalExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: AndLogicalExpression) -> *CombineElement;
```
## AndLogicalExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AndLogicalExpression;
```
## AndLogicalExpression::is\<T\>

```rust
pub fn is<T>(self: AndLogicalExpression) -> bool;
```
## AndLogicalExpression::to\<T\>

```rust
pub fn to<T>(self: AndLogicalExpression) -> <any>;
```
## AndLogicalExpression::key\_neq

```rust
pub fn key_neq(self: AndLogicalExpression, object: <any>) -> bool;
```
## AndLogicalExpression::key\_eq

```rust
pub fn key_eq(self: AndLogicalExpression, object: <any>) -> bool;
```
## AndLogicalExpression::to\_set

```rust
pub fn to_set(self: AndLogicalExpression) -> *AndLogicalExpression;
```
