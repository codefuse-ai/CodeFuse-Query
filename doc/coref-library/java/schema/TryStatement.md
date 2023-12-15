# TryStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema TryStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## TryStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: TryStatement) -> NumberOfLines;
```
## TryStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: TryStatement) -> ElementParent;
```
## TryStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TryStatement) -> int;
```
## TryStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: TryStatement) -> Callable;
```
## TryStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TryStatement) -> int;
```
## TryStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: TryStatement) -> string;
```
## TryStatement::getIthCatchBlock

```java
/**
* @brief gets the i-th catch clause of the try statement.
* @return CatchClauseStatement 
*/
```
```rust
pub fn getIthCatchBlock(self: TryStatement, index: int) -> CatchClause;
```
## TryStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: TryStatement) -> *Statement;
```
## TryStatement::getTryBlock

```java
/**
* @brief gets the try block of the try statement.
* @return Statement 
*/
```
```rust
pub fn getTryBlock(self: TryStatement) -> CodeBlock;
```
## TryStatement::getFinallyBlock

```java
/**
* @brief gets the finally block of the try statement
* @return CodeBlock 
*/
```
```rust
pub fn getFinallyBlock(self: TryStatement) -> CodeBlock;
```
## TryStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: TryStatement) -> Statement;
```
## TryStatement::getCatchBlock

```java
/**
* @brief gets the catch clause of the try statement.
* @return CatchClauseStatement 
*/
```
```rust
pub fn getCatchBlock(self: TryStatement) -> *CatchClause;
```
## TryStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: TryStatement) -> *Statement;
```
## TryStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *ElementParent;
```
## TryStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TryStatement) -> string;
```
## TryStatement::getResourceList

```java
/**
* @brief gets the ResourceList of the try statement
* @return ResourceList 
*/
```
```rust
pub fn getResourceList(self: TryStatement) -> ResourceList;
```
## TryStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TryStatement) -> int;
```
## TryStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TryStatement;
```
