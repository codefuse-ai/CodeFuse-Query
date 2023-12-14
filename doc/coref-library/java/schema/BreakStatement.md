# BreakStatement

Primary key: `element_hash_id: int`

```rust
schema BreakStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## BreakStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: BreakStatement) -> NumberOfLines;
```
## BreakStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: BreakStatement) -> ElementParent;
```
## BreakStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: BreakStatement) -> int;
```
## BreakStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: BreakStatement) -> int;
```
## BreakStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: BreakStatement) -> Callable;
```
## BreakStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: BreakStatement) -> string;
```
## BreakStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: BreakStatement) -> *Statement;
```
## BreakStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: BreakStatement) -> *ElementParent;
```
## BreakStatement::getExitedStatement

```rust
/**
     * @brief gets the exited statement of the break statement, if any.
     * @return Statement 
     */
```
```rust
pub fn getExitedStatement(self: BreakStatement) -> Statement;
```
## BreakStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: BreakStatement) -> Statement;
```
## BreakStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: BreakStatement) -> *Statement;
```
## BreakStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: BreakStatement) -> string;
```
## BreakStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: BreakStatement) -> Location;
```
## BreakStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: BreakStatement) -> int;
```
## BreakStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BreakStatement;
```
## BreakStatement::is\<T\>

```rust
pub fn is<T>(self: BreakStatement) -> bool;
```
## BreakStatement::to\<T\>

```rust
pub fn to<T>(self: BreakStatement) -> <any>;
```
## BreakStatement::key\_neq

```rust
pub fn key_neq(self: BreakStatement, object: <any>) -> bool;
```
## BreakStatement::key\_eq

```rust
pub fn key_eq(self: BreakStatement, object: <any>) -> bool;
```
## BreakStatement::to\_set

```rust
pub fn to_set(self: BreakStatement) -> *BreakStatement;
```
