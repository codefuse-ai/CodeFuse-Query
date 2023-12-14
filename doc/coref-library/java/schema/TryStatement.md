# TryStatement

Primary key: `element_hash_id: int`

```rust
schema TryStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## TryStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: TryStatement) -> NumberOfLines;
```
## TryStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: TryStatement) -> ElementParent;
```
## TryStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TryStatement) -> int;
```
## TryStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: TryStatement) -> Callable;
```
## TryStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: TryStatement) -> int;
```
## TryStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: TryStatement) -> string;
```
## TryStatement::getIthCatchBlock

```rust
/**
     * @brief gets the i-th catch clause of the try statement.
     * @return CatchClauseStatement 
     */
```
```rust
pub fn getIthCatchBlock(self: TryStatement, index: int) -> CatchClause;
```
## TryStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: TryStatement) -> *Statement;
```
## TryStatement::getTryBlock

```rust
/**
     * @brief gets the try block of the try statement.
     * @return Statement 
     */
```
```rust
pub fn getTryBlock(self: TryStatement) -> CodeBlock;
```
## TryStatement::getFinallyBlock

```rust
/**
     * @brief gets the finally block of the try statement
     * @return CodeBlock 
     */
```
```rust
pub fn getFinallyBlock(self: TryStatement) -> CodeBlock;
```
## TryStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: TryStatement) -> Statement;
```
## TryStatement::getCatchBlock

```rust
/**
     * @brief gets the catch clause of the try statement.
     * @return CatchClauseStatement 
     */
```
```rust
pub fn getCatchBlock(self: TryStatement) -> *CatchClause;
```
## TryStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: TryStatement) -> *Statement;
```
## TryStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *ElementParent;
```
## TryStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TryStatement) -> string;
```
## TryStatement::getResourceList

```rust
/**
     * @brief gets the ResourceList of the try statement
     * @return ResourceList 
     */
```
```rust
pub fn getResourceList(self: TryStatement) -> ResourceList;
```
## TryStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TryStatement) -> int;
```
## TryStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TryStatement;
```
## TryStatement::is\<T\>

```rust
pub fn is<T>(self: TryStatement) -> bool;
```
## TryStatement::to\<T\>

```rust
pub fn to<T>(self: TryStatement) -> <any>;
```
## TryStatement::key\_neq

```rust
pub fn key_neq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::key\_eq

```rust
pub fn key_eq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::to\_set

```rust
pub fn to_set(self: TryStatement) -> *TryStatement;
```
