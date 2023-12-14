# CallExpression

Primary key: `element_oid: int`

```rust
schema CallExpression {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## CallExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *CombineElement;
```
## CallExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: CallExpression) -> NumberOfLines;
```
## CallExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: CallExpression) -> CombineElement;
```
## CallExpression::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: CallExpression) -> int;
```
## CallExpression::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: CallExpression) -> Scope;
```
## CallExpression::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: CallExpression) -> string;
```
## CallExpression::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: CallExpression) -> int;
```
## CallExpression::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CallExpression;
```
## CallExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::getArgs

```rust
/**
     * @brief gets the arguments in the call.
     * @return CombineElement
     */
```
```rust
pub fn getArgs(self: CallExpression) -> *CombineElement;
```
## CallExpression::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: CallExpression) -> int;
```
## CallExpression::getFunctionExpression

```rust
/**
     * @brief gets the function expression in the call.
     * @return Expression
     */
```
```rust
pub fn getFunctionExpression(self: CallExpression) -> Expression;
```
## CallExpression::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: CallExpression) -> string;
```
## CallExpression::is\<T\>

```rust
pub fn is<T>(self: CallExpression) -> bool;
```
## CallExpression::to\<T\>

```rust
pub fn to<T>(self: CallExpression) -> <any>;
```
## CallExpression::key\_neq

```rust
pub fn key_neq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::key\_eq

```rust
pub fn key_eq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::to\_set

```rust
pub fn to_set(self: CallExpression) -> *CallExpression;
```
