# SwitchStatement

Primary key: `element_hash_id: int`

```rust
schema SwitchStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SwitchStatement) -> NumberOfLines;
```
## SwitchStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: SwitchStatement) -> ElementParent;
```
## SwitchStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SwitchStatement) -> int;
```
## SwitchStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SwitchStatement) -> Callable;
```
## SwitchStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SwitchStatement) -> int;
```
## SwitchStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SwitchStatement) -> string;
```
## SwitchStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: SwitchStatement) -> *Statement;
```
## SwitchStatement::getCodeBlock

```rust
/**
     * @brief gets switch Block
     * @return codeBlock
     */
```
```rust
pub fn getCodeBlock(self: SwitchStatement) -> CodeBlock;
```
## SwitchStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SwitchStatement) -> *ElementParent;
```
## SwitchStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SwitchStatement) -> Statement;
```
## SwitchStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SwitchStatement) -> string;
```
## SwitchStatement::getACase

```rust
/**
     * @brief gets a case of this switch statement, which maybe either a normal or a default.
     * @return SwitchLabelStatement 
     */
```
```rust
pub fn getACase(self: SwitchStatement) -> *SwitchLabelStatement;
```
## SwitchStatement::getAStmt

```rust
/**
     * @brief gets an immediate child statement of this switch statement.
     * @return Statement 
     */
```
```rust
pub fn getAStmt(self: SwitchStatement) -> Statement;
```
## SwitchStatement::getDefaultStmt

```rust
/**
     * @brief gets the i-th child statement of this switch statement.
     * @return Statement 
     */
```
```rust
pub fn getDefaultStmt(self: SwitchStatement) -> DefaultSwitchLabelStatement;
```
## SwitchStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: SwitchStatement) -> *Statement;
```
## SwitchStatement::getIthStmt

```rust
/**
     * @brief gets the i-th child statement of this switch statement.
     * @return Statement 
     */
```
```rust
pub fn getIthStmt(self: SwitchStatement, idx: int) -> Statement;
```
## SwitchStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: SwitchStatement) -> Location;
```
## SwitchStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SwitchStatement) -> int;
```
## SwitchStatement::getExpr

```rust
/**
     * @brief gets the expression of this switch statement.
     * @return Expression 
     */
```
```rust
pub fn getExpr(self: SwitchStatement) -> Expression;
```
## SwitchStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SwitchStatement;
```
## SwitchStatement::is\<T\>

```rust
pub fn is<T>(self: SwitchStatement) -> bool;
```
## SwitchStatement::to\<T\>

```rust
pub fn to<T>(self: SwitchStatement) -> <any>;
```
## SwitchStatement::key\_neq

```rust
pub fn key_neq(self: SwitchStatement, object: <any>) -> bool;
```
## SwitchStatement::key\_eq

```rust
pub fn key_eq(self: SwitchStatement, object: <any>) -> bool;
```
## SwitchStatement::to\_set

```rust
pub fn to_set(self: SwitchStatement) -> *SwitchStatement;
```
