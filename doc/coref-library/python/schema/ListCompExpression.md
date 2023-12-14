# ListCompExpression

Primary key: `element_oid: int`

```rust
schema ListCompExpression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ListCompExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: ListCompExpression) -> *CombineElement;
```
## ListCompExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ListCompExpression) -> NumberOfLines;
```
## ListCompExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ListCompExpression) -> int;
```
## ListCompExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: ListCompExpression) -> CombineElement;
```
## ListCompExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ListCompExpression) -> int;
```
## ListCompExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ListCompExpression) -> Location;
```
## ListCompExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ListCompExpression) -> Scope;
```
## ListCompExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ListCompExpression) -> string;
```
## ListCompExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ListCompExpression) -> int;
```
## ListCompExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ListCompExpression) -> string;
```
## ListCompExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ListCompExpression;
```
## ListCompExpression::is\<T\>

```rust
pub fn is<T>(self: ListCompExpression) -> bool;
```
## ListCompExpression::to\<T\>

```rust
pub fn to<T>(self: ListCompExpression) -> <any>;
```
## ListCompExpression::key\_neq

```rust
pub fn key_neq(self: ListCompExpression, object: <any>) -> bool;
```
## ListCompExpression::key\_eq

```rust
pub fn key_eq(self: ListCompExpression, object: <any>) -> bool;
```
## ListCompExpression::to\_set

```rust
pub fn to_set(self: ListCompExpression) -> *ListCompExpression;
```
