# BlockStatement

Primary key: `element_hash_id: int`

```rust
schema BlockStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## BlockStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: BlockStatement) -> NumberOfLines;
```
## BlockStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: BlockStatement) -> ElementParent;
```
## BlockStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: BlockStatement) -> int;
```
## BlockStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: BlockStatement) -> Callable;
```
## BlockStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: BlockStatement) -> int;
```
## BlockStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: BlockStatement) -> string;
```
## BlockStatement::getCodeBlock

```rust
/**
     * @brief gets the code block of the block statement.
     * @return CodeBlock 
     */
```
```rust
pub fn getCodeBlock(self: BlockStatement) -> CodeBlock;
```
## BlockStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: BlockStatement) -> *Statement;
```
## BlockStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: BlockStatement) -> *ElementParent;
```
## BlockStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: BlockStatement) -> Statement;
```
## BlockStatement::getNumberOfStatement

```rust
/**
     * @brief gets the number of immediate child statements in this block.
     * @return int 
     */
```
```rust
pub fn getNumberOfStatement(self: BlockStatement) -> int;
```
## BlockStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: BlockStatement) -> *Statement;
```
## BlockStatement::getLastStatement

```rust
/**
     * @brief description
     * @return Statement 
     */
```
```rust
pub fn getLastStatement(self: BlockStatement) -> Statement;
```
## BlockStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: BlockStatement) -> string;
```
## BlockStatement::getStatement

```rust
/**
     * @brief gets a statement that is an immediate child of the block.
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: BlockStatement, idx: int) -> Statement;
```
## BlockStatement::getAStatement

```rust
/**
     * @brief gets a statement that is an immediate child of the block.
     * @return Statement 
     */
```
```rust
pub fn getAStatement(self: BlockStatement) -> *Statement;
```
## BlockStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: BlockStatement) -> Location;
```
## BlockStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: BlockStatement) -> int;
```
## BlockStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BlockStatement;
```
## BlockStatement::is\<T\>

```rust
pub fn is<T>(self: BlockStatement) -> bool;
```
## BlockStatement::to\<T\>

```rust
pub fn to<T>(self: BlockStatement) -> <any>;
```
## BlockStatement::key\_neq

```rust
pub fn key_neq(self: BlockStatement, object: <any>) -> bool;
```
## BlockStatement::key\_eq

```rust
pub fn key_eq(self: BlockStatement, object: <any>) -> bool;
```
## BlockStatement::to\_set

```rust
pub fn to_set(self: BlockStatement) -> *BlockStatement;
```
