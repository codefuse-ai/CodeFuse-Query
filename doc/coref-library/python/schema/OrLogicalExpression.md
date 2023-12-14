# OrLogicalExpression

Primary key: `element_oid: int`

```rust
schema OrLogicalExpression {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## OrLogicalExpression::getType

```rust
/**
     * @brief gets the type of the expression.
     * @return string
     */
```
```rust
pub fn getType(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return int
     */
```
```rust
pub fn getSize(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: OrLogicalExpression) -> Scope;
```
## OrLogicalExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: OrLogicalExpression) -> CombineElement;
```
## OrLogicalExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: OrLogicalExpression) -> Location;
```
## OrLogicalExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: OrLogicalExpression) -> *CombineElement;
```
## OrLogicalExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *OrLogicalExpression;
```
## OrLogicalExpression::is\<T\>

```rust
pub fn is<T>(self: OrLogicalExpression) -> bool;
```
## OrLogicalExpression::to\<T\>

```rust
pub fn to<T>(self: OrLogicalExpression) -> <any>;
```
## OrLogicalExpression::key\_neq

```rust
pub fn key_neq(self: OrLogicalExpression, object: <any>) -> bool;
```
## OrLogicalExpression::key\_eq

```rust
pub fn key_eq(self: OrLogicalExpression, object: <any>) -> bool;
```
## OrLogicalExpression::to\_set

```rust
pub fn to_set(self: OrLogicalExpression) -> *OrLogicalExpression;
```
