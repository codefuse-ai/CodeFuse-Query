# EmptyStatement

Primary key: `element_hash_id: int`

```rust
schema EmptyStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## EmptyStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: EmptyStatement) -> NumberOfLines;
```
## EmptyStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: EmptyStatement) -> ElementParent;
```
## EmptyStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: EmptyStatement) -> int;
```
## EmptyStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: EmptyStatement) -> int;
```
## EmptyStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: EmptyStatement) -> Callable;
```
## EmptyStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: EmptyStatement) -> string;
```
## EmptyStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: EmptyStatement) -> *ElementParent;
```
## EmptyStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: EmptyStatement) -> *Statement;
```
## EmptyStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: EmptyStatement) -> Statement;
```
## EmptyStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: EmptyStatement) -> *Statement;
```
## EmptyStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: EmptyStatement) -> string;
```
## EmptyStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: EmptyStatement) -> Location;
```
## EmptyStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: EmptyStatement) -> int;
```
## EmptyStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EmptyStatement;
```
## EmptyStatement::is\<T\>

```rust
pub fn is<T>(self: EmptyStatement) -> bool;
```
## EmptyStatement::to\<T\>

```rust
pub fn to<T>(self: EmptyStatement) -> <any>;
```
## EmptyStatement::key\_neq

```rust
pub fn key_neq(self: EmptyStatement, object: <any>) -> bool;
```
## EmptyStatement::key\_eq

```rust
pub fn key_eq(self: EmptyStatement, object: <any>) -> bool;
```
## EmptyStatement::to\_set

```rust
pub fn to_set(self: EmptyStatement) -> *EmptyStatement;
```
