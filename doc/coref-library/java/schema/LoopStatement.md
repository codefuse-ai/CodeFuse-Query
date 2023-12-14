# LoopStatement

Primary key: `element_hash_id: int`

```rust
schema LoopStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## LoopStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: LoopStatement) -> NumberOfLines;
```
## LoopStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: LoopStatement) -> ElementParent;
```
## LoopStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LoopStatement) -> int;
```
## LoopStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LoopStatement) -> int;
```
## LoopStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: LoopStatement) -> Callable;
```
## LoopStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LoopStatement) -> string;
```
## LoopStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LoopStatement) -> *ElementParent;
```
## LoopStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: LoopStatement) -> *Statement;
```
## LoopStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: LoopStatement) -> Statement;
```
## LoopStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: LoopStatement) -> *Statement;
```
## LoopStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: LoopStatement) -> string;
```
## LoopStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: LoopStatement) -> Location;
```
## LoopStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LoopStatement) -> int;
```
## LoopStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LoopStatement;
```
## LoopStatement::is\<T\>

```rust
pub fn is<T>(self: LoopStatement) -> bool;
```
## LoopStatement::to\<T\>

```rust
pub fn to<T>(self: LoopStatement) -> <any>;
```
## LoopStatement::key\_neq

```rust
pub fn key_neq(self: LoopStatement, object: <any>) -> bool;
```
## LoopStatement::key\_eq

```rust
pub fn key_eq(self: LoopStatement, object: <any>) -> bool;
```
## LoopStatement::to\_set

```rust
pub fn to_set(self: LoopStatement) -> *LoopStatement;
```
