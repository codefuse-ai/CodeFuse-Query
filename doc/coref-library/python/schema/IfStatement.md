# IfStatement

Primary key: `element_oid: int`

```rust
schema IfStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## IfStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: IfStatement) -> NumberOfLines;
```
## IfStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: IfStatement) -> CombineElement;
```
## IfStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: IfStatement) -> int;
```
## IfStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: IfStatement) -> Scope;
```
## IfStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: IfStatement) -> string;
```
## IfStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: IfStatement) -> int;
```
## IfStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: IfStatement) -> *CombineElement;
```
## IfStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: IfStatement) -> *Statement;
```
## IfStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: IfStatement) -> Statement;
```
## IfStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: IfStatement) -> int;
```
## IfStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: IfStatement) -> string;
```
## IfStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: IfStatement) -> Location;
```
## IfStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *IfStatement;
```
## IfStatement::is\<T\>

```rust
pub fn is<T>(self: IfStatement) -> bool;
```
## IfStatement::to\<T\>

```rust
pub fn to<T>(self: IfStatement) -> <any>;
```
## IfStatement::key\_neq

```rust
pub fn key_neq(self: IfStatement, object: <any>) -> bool;
```
## IfStatement::key\_eq

```rust
pub fn key_eq(self: IfStatement, object: <any>) -> bool;
```
## IfStatement::to\_set

```rust
pub fn to_set(self: IfStatement) -> *IfStatement;
```
