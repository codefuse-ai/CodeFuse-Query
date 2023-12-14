# IfStatement

Primary key: `element_hash_id: int`

```rust
schema IfStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
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
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: IfStatement) -> ElementParent;
```
## IfStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: IfStatement) -> int;
```
## IfStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: IfStatement) -> Callable;
```
## IfStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: IfStatement) -> int;
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
## IfStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: IfStatement) -> *ElementParent;
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
## IfStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: IfStatement) -> *Statement;
```
## IfStatement::getAlternate

```rust
/**
     * @brief gets the else branch of this if statement.
     * @return Statement 
     */
```
```rust
pub fn getAlternate(self: IfStatement) -> Statement;
```
## IfStatement::getConsequent

```rust
/**
     * @brief get the statement that is executed whenever the condition of this branch evaluates to true.
     * @return Statement 
     */
```
```rust
pub fn getConsequent(self: IfStatement) -> Statement;
```
## IfStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: IfStatement) -> string;
```
## IfStatement::getCondition

```rust
/**
     * @brief gets the boolean condition of this if statement.
     * @return Expression 
     */
```
```rust
pub fn getCondition(self: IfStatement) -> Expression;
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
## IfStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: IfStatement) -> int;
```
## IfStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IfStatement;
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
