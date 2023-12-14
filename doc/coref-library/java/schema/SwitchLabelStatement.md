# SwitchLabelStatement

Primary key: `element_hash_id: int`

```rust
schema SwitchLabelStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchLabelStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SwitchLabelStatement) -> NumberOfLines;
```
## SwitchLabelStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SwitchLabelStatement) -> Callable;
```
## SwitchLabelStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SwitchLabelStatement) -> string;
```
## SwitchLabelStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SwitchLabelStatement) -> *ElementParent;
```
## SwitchLabelStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SwitchLabelStatement) -> Statement;
```
## SwitchLabelStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getExecutionStatement

```rust
pub fn getExecutionStatement(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getNextSwitchCaseStatement

```rust
pub fn getNextSwitchCaseStatement(self: SwitchLabelStatement) -> SwitchLabelStatement;
```
## SwitchLabelStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: SwitchLabelStatement) -> ElementParent;
```
## SwitchLabelStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getEnclosingSwitchBlock

```rust
/**
     * @brief gets the enclosing switch statement of this case.
     * @return SwitchStatement 
     */
```
```rust
pub fn getEnclosingSwitchBlock(self: SwitchLabelStatement) -> SwitchStatement;
```
## SwitchLabelStatement::isDefaultValue

```rust
/**
     * @brief the element represents a default section or not, 1 means true.
     * @return int 
     */
```
```rust
pub fn isDefaultValue(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getNext

```rust
/**
     * @brief the element represents a default section or not, 1 means true.
     * @return int 
     */
```
```rust
pub fn getNext(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getDefault

```rust
/**
     * @brief get the default label statement.
     * @return SwitchLabelStatement
     */
```
```rust
pub fn getDefault(self: SwitchLabelStatement) -> SwitchLabelStatement;
```
## SwitchLabelStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SwitchLabelStatement) -> string;
```
## SwitchLabelStatement::getStatement

```rust
pub fn getStatement(self: SwitchLabelStatement, index: int) -> Statement;
```
## SwitchLabelStatement::getSelector

```rust
/**
     * @brief gets the expression of the surrounding switch that this case is compared against.
     * @return ExpressionListElement 
     */
```
```rust
pub fn getSelector(self: SwitchLabelStatement) -> ExpressionListElement;
```
## SwitchLabelStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: SwitchLabelStatement) -> Location;
```
## SwitchLabelStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SwitchLabelStatement;
```
## SwitchLabelStatement::is\<T\>

```rust
pub fn is<T>(self: SwitchLabelStatement) -> bool;
```
## SwitchLabelStatement::to\<T\>

```rust
pub fn to<T>(self: SwitchLabelStatement) -> <any>;
```
## SwitchLabelStatement::key\_neq

```rust
pub fn key_neq(self: SwitchLabelStatement, object: <any>) -> bool;
```
## SwitchLabelStatement::key\_eq

```rust
pub fn key_eq(self: SwitchLabelStatement, object: <any>) -> bool;
```
## SwitchLabelStatement::to\_set

```rust
pub fn to_set(self: SwitchLabelStatement) -> *SwitchLabelStatement;
```
