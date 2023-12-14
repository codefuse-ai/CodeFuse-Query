# ConstSwitchLabelStatement

Primary key: `element_hash_id: int`

```rust
schema ConstSwitchLabelStatement {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
  type: string,
}
```
## ConstSwitchLabelStatement::getSelector

```rust
/**
     * @brief gets the expression of the surrounding switch that this case is compared against.
     * @return ExpressionListElement 
     */
```
```rust
pub fn getSelector(self: ConstSwitchLabelStatement) -> ExpressionListElement;
```
## ConstSwitchLabelStatement::getStatement

```rust
pub fn getStatement(self: ConstSwitchLabelStatement, index: int) -> Statement;
```
## ConstSwitchLabelStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ConstSwitchLabelStatement) -> string;
```
## ConstSwitchLabelStatement::getDefault

```rust
/**
     * @brief get the default label statement.
     * @return SwitchLabelStatement
     */
```
```rust
pub fn getDefault(self: ConstSwitchLabelStatement) -> SwitchLabelStatement;
```
## ConstSwitchLabelStatement::getNext

```rust
/**
     * @brief the element represents a default section or not, 1 means true.
     * @return int 
     */
```
```rust
pub fn getNext(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::isDefaultValue

```rust
/**
     * @brief the element represents a default section or not, 1 means true.
     * @return int 
     */
```
```rust
pub fn isDefaultValue(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getEnclosingSwitchBlock

```rust
/**
     * @brief gets the enclosing switch statement of this case.
     * @return SwitchStatement 
     */
```
```rust
pub fn getEnclosingSwitchBlock(self: ConstSwitchLabelStatement) -> SwitchStatement;
```
## ConstSwitchLabelStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ConstSwitchLabelStatement) -> ElementParent;
```
## ConstSwitchLabelStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ConstSwitchLabelStatement) -> Statement;
```
## ConstSwitchLabelStatement::getNextSwitchCaseStatement

```rust
pub fn getNextSwitchCaseStatement(self: ConstSwitchLabelStatement) -> SwitchLabelStatement;
```
## ConstSwitchLabelStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ConstSwitchLabelStatement) -> *ElementParent;
```
## ConstSwitchLabelStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getExecutionStatement

```rust
pub fn getExecutionStatement(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ConstSwitchLabelStatement) -> Callable;
```
## ConstSwitchLabelStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ConstSwitchLabelStatement) -> string;
```
## ConstSwitchLabelStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ConstSwitchLabelStatement) -> NumberOfLines;
```
## ConstSwitchLabelStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: ConstSwitchLabelStatement) -> Location;
```
## ConstSwitchLabelStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConstSwitchLabelStatement;
```
## ConstSwitchLabelStatement::is\<T\>

```rust
pub fn is<T>(self: ConstSwitchLabelStatement) -> bool;
```
## ConstSwitchLabelStatement::to\<T\>

```rust
pub fn to<T>(self: ConstSwitchLabelStatement) -> <any>;
```
## ConstSwitchLabelStatement::key\_neq

```rust
pub fn key_neq(self: ConstSwitchLabelStatement, object: <any>) -> bool;
```
## ConstSwitchLabelStatement::key\_eq

```rust
pub fn key_eq(self: ConstSwitchLabelStatement, object: <any>) -> bool;
```
## ConstSwitchLabelStatement::to\_set

```rust
pub fn to_set(self: ConstSwitchLabelStatement) -> *ConstSwitchLabelStatement;
```
