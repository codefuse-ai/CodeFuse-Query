# DeclarationStatement

Primary key: `element_hash_id: int`

```rust
schema DeclarationStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## DeclarationStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: DeclarationStatement) -> NumberOfLines;
```
## DeclarationStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: DeclarationStatement) -> ElementParent;
```
## DeclarationStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: DeclarationStatement) -> Callable;
```
## DeclarationStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: DeclarationStatement) -> *Statement;
```
## DeclarationStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: DeclarationStatement) -> *ElementParent;
```
## DeclarationStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: DeclarationStatement) -> Statement;
```
## DeclarationStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: DeclarationStatement) -> *Statement;
```
## DeclarationStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getDeclaredElement

```rust
/**
     * @brief gets the declared element of the statement.
     * @return DeclaredElement 
     */
```
```rust
pub fn getDeclaredElement(self: DeclarationStatement) -> *DeclaredElement;
```
## DeclarationStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getIthDeclaredElement

```rust
/**
     * @brief gets the i-th declared element of the statement.
     * @return DeclaredElement 
     */
```
```rust
pub fn getIthDeclaredElement(self: DeclarationStatement, idx: int) -> DeclaredElement;
```
## DeclarationStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: DeclarationStatement) -> Location;
```
## DeclarationStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: DeclarationStatement) -> int;
```
## DeclarationStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DeclarationStatement;
```
## DeclarationStatement::is\<T\>

```rust
pub fn is<T>(self: DeclarationStatement) -> bool;
```
## DeclarationStatement::to\<T\>

```rust
pub fn to<T>(self: DeclarationStatement) -> <any>;
```
## DeclarationStatement::key\_neq

```rust
pub fn key_neq(self: DeclarationStatement, object: <any>) -> bool;
```
## DeclarationStatement::key\_eq

```rust
pub fn key_eq(self: DeclarationStatement, object: <any>) -> bool;
```
## DeclarationStatement::to\_set

```rust
pub fn to_set(self: DeclarationStatement) -> *DeclarationStatement;
```
