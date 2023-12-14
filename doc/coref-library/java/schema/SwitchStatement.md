# SwitchStatement

Primary key: `element_hash_id: int`

```rust
schema SwitchStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: SwitchStatement) -> NumberOfLines;
```
## SwitchStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: SwitchStatement) -> ElementParent;
```
## SwitchStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: SwitchStatement) -> int;
```
## SwitchStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: SwitchStatement) -> Callable;
```
## SwitchStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: SwitchStatement) -> int;
```
## SwitchStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: SwitchStatement) -> string;
```
## SwitchStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: SwitchStatement) -> *Statement;
```
## SwitchStatement::getCodeBlock

```java
/**
* @brief gets switch Block
* @return codeBlock
*/
```
```rust
pub fn getCodeBlock(self: SwitchStatement) -> CodeBlock;
```
## SwitchStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: SwitchStatement) -> *ElementParent;
```
## SwitchStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: SwitchStatement) -> Statement;
```
## SwitchStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: SwitchStatement) -> string;
```
## SwitchStatement::getACase

```java
/**
* @brief gets a case of this switch statement, which maybe either a normal or a default.
* @return SwitchLabelStatement 
*/
```
```rust
pub fn getACase(self: SwitchStatement) -> *SwitchLabelStatement;
```
## SwitchStatement::getAStmt

```java
/**
* @brief gets an immediate child statement of this switch statement.
* @return Statement 
*/
```
```rust
pub fn getAStmt(self: SwitchStatement) -> Statement;
```
## SwitchStatement::getDefaultStmt

```java
/**
* @brief gets the i-th child statement of this switch statement.
* @return Statement 
*/
```
```rust
pub fn getDefaultStmt(self: SwitchStatement) -> DefaultSwitchLabelStatement;
```
## SwitchStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: SwitchStatement) -> *Statement;
```
## SwitchStatement::getIthStmt

```java
/**
* @brief gets the i-th child statement of this switch statement.
* @return Statement 
*/
```
```rust
pub fn getIthStmt(self: SwitchStatement, idx: int) -> Statement;
```
## SwitchStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: SwitchStatement) -> Location;
```
## SwitchStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: SwitchStatement) -> int;
```
## SwitchStatement::getExpr

```java
/**
* @brief gets the expression of this switch statement.
* @return Expression 
*/
```
```rust
pub fn getExpr(self: SwitchStatement) -> Expression;
```
## SwitchStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SwitchStatement;
```
