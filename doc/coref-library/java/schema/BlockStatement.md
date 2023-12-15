# BlockStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema BlockStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## BlockStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: BlockStatement) -> NumberOfLines;
```
## BlockStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: BlockStatement) -> ElementParent;
```
## BlockStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: BlockStatement) -> int;
```
## BlockStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: BlockStatement) -> Callable;
```
## BlockStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: BlockStatement) -> int;
```
## BlockStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: BlockStatement) -> string;
```
## BlockStatement::getCodeBlock

```java
/**
* @brief gets the code block of the block statement.
* @return CodeBlock 
*/
```
```rust
pub fn getCodeBlock(self: BlockStatement) -> CodeBlock;
```
## BlockStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: BlockStatement) -> *Statement;
```
## BlockStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: BlockStatement) -> *ElementParent;
```
## BlockStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: BlockStatement) -> Statement;
```
## BlockStatement::getNumberOfStatement

```java
/**
* @brief gets the number of immediate child statements in this block.
* @return int 
*/
```
```rust
pub fn getNumberOfStatement(self: BlockStatement) -> int;
```
## BlockStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: BlockStatement) -> *Statement;
```
## BlockStatement::getLastStatement

```java
/**
* @brief description
* @return Statement 
*/
```
```rust
pub fn getLastStatement(self: BlockStatement) -> Statement;
```
## BlockStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: BlockStatement) -> string;
```
## BlockStatement::getStatement

```java
/**
* @brief gets a statement that is an immediate child of the block.
* @return Statement 
*/
```
```rust
pub fn getStatement(self: BlockStatement, idx: int) -> Statement;
```
## BlockStatement::getAStatement

```java
/**
* @brief gets a statement that is an immediate child of the block.
* @return Statement 
*/
```
```rust
pub fn getAStatement(self: BlockStatement) -> *Statement;
```
## BlockStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: BlockStatement) -> Location;
```
## BlockStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: BlockStatement) -> int;
```
## BlockStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BlockStatement;
```
