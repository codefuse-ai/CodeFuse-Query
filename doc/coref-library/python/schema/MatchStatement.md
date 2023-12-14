# MatchStatement

Primary key: `element_oid: int`

```rust
schema MatchStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## MatchStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: MatchStatement) -> NumberOfLines;
```
## MatchStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: MatchStatement) -> CombineElement;
```
## MatchStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: MatchStatement) -> int;
```
## MatchStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: MatchStatement) -> Scope;
```
## MatchStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: MatchStatement) -> string;
```
## MatchStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: MatchStatement) -> int;
```
## MatchStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: MatchStatement) -> *Statement;
```
## MatchStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: MatchStatement) -> *CombineElement;
```
## MatchStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: MatchStatement) -> Statement;
```
## MatchStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: MatchStatement) -> int;
```
## MatchStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: MatchStatement) -> Location;
```
## MatchStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MatchStatement;
```
## MatchStatement::getMatchCase

```rust
/**
     * @brief gets a case pattern in the statement.
     * @return MatchCase 
     */
```
```rust
pub fn getMatchCase(self: MatchStatement) -> MatchCase;
```
## MatchStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: MatchStatement) -> string;
```
## MatchStatement::is\<T\>

```rust
pub fn is<T>(self: MatchStatement) -> bool;
```
## MatchStatement::to\<T\>

```rust
pub fn to<T>(self: MatchStatement) -> <any>;
```
## MatchStatement::key\_neq

```rust
pub fn key_neq(self: MatchStatement, object: <any>) -> bool;
```
## MatchStatement::key\_eq

```rust
pub fn key_eq(self: MatchStatement, object: <any>) -> bool;
```
## MatchStatement::to\_set

```rust
pub fn to_set(self: MatchStatement) -> *MatchStatement;
```
