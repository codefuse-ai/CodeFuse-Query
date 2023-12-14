# YieldStatement

Primary key: `element_hash_id: int`

```rust
schema YieldStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## YieldStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: YieldStatement) -> NumberOfLines;
```
## YieldStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: YieldStatement) -> ElementParent;
```
## YieldStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: YieldStatement) -> int;
```
## YieldStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: YieldStatement) -> int;
```
## YieldStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: YieldStatement) -> Callable;
```
## YieldStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: YieldStatement) -> string;
```
## YieldStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: YieldStatement) -> *ElementParent;
```
## YieldStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: YieldStatement) -> *Statement;
```
## YieldStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: YieldStatement) -> Statement;
```
## YieldStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: YieldStatement) -> *Statement;
```
## YieldStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: YieldStatement) -> string;
```
## YieldStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: YieldStatement) -> Location;
```
## YieldStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: YieldStatement) -> int;
```
## YieldStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *YieldStatement;
```
## YieldStatement::is\<T\>

```rust
pub fn is<T>(self: YieldStatement) -> bool;
```
## YieldStatement::to\<T\>

```rust
pub fn to<T>(self: YieldStatement) -> <any>;
```
## YieldStatement::key\_neq

```rust
pub fn key_neq(self: YieldStatement, object: <any>) -> bool;
```
## YieldStatement::key\_eq

```rust
pub fn key_eq(self: YieldStatement, object: <any>) -> bool;
```
## YieldStatement::to\_set

```rust
pub fn to_set(self: YieldStatement) -> *YieldStatement;
```
