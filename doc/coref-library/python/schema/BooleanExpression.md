# BooleanExpression

Primary key: `element_oid: int`

```rust
schema BooleanExpression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## BooleanExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: BooleanExpression) -> *CombineElement;
```
## BooleanExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: BooleanExpression) -> CombineElement;
```
## BooleanExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: BooleanExpression) -> int;
```
## BooleanExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: BooleanExpression) -> Location;
```
## BooleanExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: BooleanExpression) -> Scope;
```
## BooleanExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: BooleanExpression) -> string;
```
## BooleanExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: BooleanExpression) -> int;
```
## BooleanExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: BooleanExpression) -> int;
```
## BooleanExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return int
     */
```
```rust
pub fn getSize(self: BooleanExpression) -> int;
```
## BooleanExpression::getType

```rust
/**
     * @brief gets the type of the expression.
     * @return string
     */
```
```rust
pub fn getType(self: BooleanExpression) -> string;
```
## BooleanExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *BooleanExpression;
```
## BooleanExpression::is\<T\>

```rust
pub fn is<T>(self: BooleanExpression) -> bool;
```
## BooleanExpression::to\<T\>

```rust
pub fn to<T>(self: BooleanExpression) -> <any>;
```
## BooleanExpression::key\_neq

```rust
pub fn key_neq(self: BooleanExpression, object: <any>) -> bool;
```
## BooleanExpression::key\_eq

```rust
pub fn key_eq(self: BooleanExpression, object: <any>) -> bool;
```
## BooleanExpression::to\_set

```rust
pub fn to_set(self: BooleanExpression) -> *BooleanExpression;
```
