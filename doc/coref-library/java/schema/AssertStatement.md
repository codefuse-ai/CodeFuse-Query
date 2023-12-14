# AssertStatement

Primary key: `element_hash_id: int`

```rust
schema AssertStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## AssertStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AssertStatement) -> NumberOfLines;
```
## AssertStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: AssertStatement) -> ElementParent;
```
## AssertStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AssertStatement) -> int;
```
## AssertStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: AssertStatement) -> Callable;
```
## AssertStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: AssertStatement) -> int;
```
## AssertStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: AssertStatement) -> *Statement;
```
## AssertStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AssertStatement) -> *ElementParent;
```
## AssertStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: AssertStatement) -> Statement;
```
## AssertStatement::getAssertDescription

```rust
/**
     * @brief gets the description expression of the assert statement.
     * @return Expression 
     */
```
```rust
pub fn getAssertDescription(self: AssertStatement) -> Expression;
```
## AssertStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: AssertStatement) -> *Statement;
```
## AssertStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AssertStatement) -> string;
```
## AssertStatement::getCondition

```rust
/**
     * @brief gets the boolean expression of the assert statement.
     * @return Expression 
     */
```
```rust
pub fn getCondition(self: AssertStatement) -> Expression;
```
## AssertStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: AssertStatement) -> string;
```
## AssertStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: AssertStatement) -> Location;
```
## AssertStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AssertStatement) -> int;
```
## AssertStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AssertStatement;
```
## AssertStatement::is\<T\>

```rust
pub fn is<T>(self: AssertStatement) -> bool;
```
## AssertStatement::to\<T\>

```rust
pub fn to<T>(self: AssertStatement) -> <any>;
```
## AssertStatement::key\_neq

```rust
pub fn key_neq(self: AssertStatement, object: <any>) -> bool;
```
## AssertStatement::key\_eq

```rust
pub fn key_eq(self: AssertStatement, object: <any>) -> bool;
```
## AssertStatement::to\_set

```rust
pub fn to_set(self: AssertStatement) -> *AssertStatement;
```
