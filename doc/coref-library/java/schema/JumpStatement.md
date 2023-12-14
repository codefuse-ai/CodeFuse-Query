# JumpStatement

Primary key: `element_hash_id: int`

```rust
schema JumpStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## JumpStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: JumpStatement) -> NumberOfLines;
```
## JumpStatement::getTargetLabel

```rust
/**
     * @brief gets the labeled statement that the break or continue statement refers to.
     * @return LabeledStatement 
     */
```
```rust
pub fn getTargetLabel(self: JumpStatement) -> LabeledStatement;
```
## JumpStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: JumpStatement) -> string;
```
## JumpStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: JumpStatement) -> *ElementParent;
```
## JumpStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: JumpStatement) -> *Statement;
```
## JumpStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: JumpStatement) -> *Statement;
```
## JumpStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: JumpStatement) -> string;
```
## JumpStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: JumpStatement) -> Callable;
```
## JumpStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: JumpStatement) -> int;
```
## JumpStatement::getEnclosingTarget

```rust
pub fn getEnclosingTarget(self: JumpStatement) -> Statement;
```
## JumpStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: JumpStatement) -> ElementParent;
```
## JumpStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JumpStatement) -> int;
```
## JumpStatement::getLabelTarget

```rust
/**
     * @brief gets the statement of the labeled statement.
     * @return Statement 
     */
```
```rust
pub fn getLabelTarget(self: JumpStatement) -> Statement;
```
## JumpStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: JumpStatement) -> Statement;
```
## JumpStatement::getTarget

```rust
/**
     * @brief description
     * @return StatementParent 
     */
```
```rust
pub fn getTarget(self: JumpStatement) -> StatementParent;
```
## JumpStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: JumpStatement) -> Location;
```
## JumpStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JumpStatement) -> int;
```
## JumpStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JumpStatement;
```
## JumpStatement::is\<T\>

```rust
pub fn is<T>(self: JumpStatement) -> bool;
```
## JumpStatement::to\<T\>

```rust
pub fn to<T>(self: JumpStatement) -> <any>;
```
## JumpStatement::key\_neq

```rust
pub fn key_neq(self: JumpStatement, object: <any>) -> bool;
```
## JumpStatement::key\_eq

```rust
pub fn key_eq(self: JumpStatement, object: <any>) -> bool;
```
## JumpStatement::to\_set

```rust
pub fn to_set(self: JumpStatement) -> *JumpStatement;
```
