# Statement

Primary key: `element_hash_id: int`

```rust
schema Statement {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
  type: string,
}
```
## Statement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Statement) -> string;
```
## Statement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: Statement) -> *Statement;
```
## Statement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Statement) -> Statement;
```
## Statement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Statement) -> *ElementParent;
```
## Statement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: Statement) -> *Statement;
```
## Statement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: Statement) -> string;
```
## Statement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: Statement) -> int;
```
## Statement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: Statement) -> Callable;
```
## Statement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Statement) -> int;
```
## Statement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: Statement) -> ElementParent;
```
## Statement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Statement) -> int;
```
## Statement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Statement;
```
## Statement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: Statement) -> Location;
```
## Statement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Statement) -> NumberOfLines;
```
## Statement::is\<T\>

```rust
pub fn is<T>(self: Statement) -> bool;
```
## Statement::to\<T\>

```rust
pub fn to<T>(self: Statement) -> <any>;
```
## Statement::key\_neq

```rust
pub fn key_neq(self: Statement, object: <any>) -> bool;
```
## Statement::key\_eq

```rust
pub fn key_eq(self: Statement, object: <any>) -> bool;
```
## Statement::to\_set

```rust
pub fn to_set(self: Statement) -> *Statement;
```
