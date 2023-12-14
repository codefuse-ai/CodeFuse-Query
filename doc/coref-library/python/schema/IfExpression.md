# IfExpression

Primary key: `element_oid: int`

```rust
schema IfExpression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## IfExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: IfExpression) -> *CombineElement;
```
## IfExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: IfExpression) -> NumberOfLines;
```
## IfExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: IfExpression) -> int;
```
## IfExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: IfExpression) -> CombineElement;
```
## IfExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: IfExpression) -> int;
```
## IfExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: IfExpression) -> Location;
```
## IfExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: IfExpression) -> Scope;
```
## IfExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: IfExpression) -> string;
```
## IfExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: IfExpression) -> int;
```
## IfExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: IfExpression) -> string;
```
## IfExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *IfExpression;
```
## IfExpression::is\<T\>

```rust
pub fn is<T>(self: IfExpression) -> bool;
```
## IfExpression::to\<T\>

```rust
pub fn to<T>(self: IfExpression) -> <any>;
```
## IfExpression::key\_neq

```rust
pub fn key_neq(self: IfExpression, object: <any>) -> bool;
```
## IfExpression::key\_eq

```rust
pub fn key_eq(self: IfExpression, object: <any>) -> bool;
```
## IfExpression::to\_set

```rust
pub fn to_set(self: IfExpression) -> *IfExpression;
```
