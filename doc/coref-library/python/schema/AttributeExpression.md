# AttributeExpression

Primary key: `element_oid: int`

```rust
schema AttributeExpression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## AttributeExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: AttributeExpression) -> *CombineElement;
```
## AttributeExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AttributeExpression) -> NumberOfLines;
```
## AttributeExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: AttributeExpression) -> int;
```
## AttributeExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: AttributeExpression) -> CombineElement;
```
## AttributeExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: AttributeExpression) -> int;
```
## AttributeExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AttributeExpression) -> Location;
```
## AttributeExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: AttributeExpression) -> Scope;
```
## AttributeExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AttributeExpression) -> string;
```
## AttributeExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: AttributeExpression) -> int;
```
## AttributeExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: AttributeExpression) -> string;
```
## AttributeExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AttributeExpression;
```
## AttributeExpression::is\<T\>

```rust
pub fn is<T>(self: AttributeExpression) -> bool;
```
## AttributeExpression::to\<T\>

```rust
pub fn to<T>(self: AttributeExpression) -> <any>;
```
## AttributeExpression::key\_neq

```rust
pub fn key_neq(self: AttributeExpression, object: <any>) -> bool;
```
## AttributeExpression::key\_eq

```rust
pub fn key_eq(self: AttributeExpression, object: <any>) -> bool;
```
## AttributeExpression::to\_set

```rust
pub fn to_set(self: AttributeExpression) -> *AttributeExpression;
```
