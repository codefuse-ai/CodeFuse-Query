# SwitchLabelStatement

Primary key: `element_hash_id: int`

```rust
schema SwitchLabelStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## SwitchLabelStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: SwitchLabelStatement) -> NumberOfLines;
```
## SwitchLabelStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: SwitchLabelStatement) -> Callable;
```
## SwitchLabelStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: SwitchLabelStatement) -> string;
```
## SwitchLabelStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: SwitchLabelStatement) -> *ElementParent;
```
## SwitchLabelStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: SwitchLabelStatement) -> Statement;
```
## SwitchLabelStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getExecutionStatement

```rust
pub fn getExecutionStatement(self: SwitchLabelStatement) -> *Statement;
```
## SwitchLabelStatement::getNextSwitchCaseStatement

```rust
pub fn getNextSwitchCaseStatement(self: SwitchLabelStatement) -> SwitchLabelStatement;
```
## SwitchLabelStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: SwitchLabelStatement) -> ElementParent;
```
## SwitchLabelStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getEnclosingSwitchBlock

```java
/**
* @brief gets the enclosing switch statement of this case.
* @return SwitchStatement 
*/
```
```rust
pub fn getEnclosingSwitchBlock(self: SwitchLabelStatement) -> SwitchStatement;
```
## SwitchLabelStatement::isDefaultValue

```java
/**
* @brief the element represents a default section or not, 1 means true.
* @return int 
*/
```
```rust
pub fn isDefaultValue(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getNext

```java
/**
* @brief the element represents a default section or not, 1 means true.
* @return int 
*/
```
```rust
pub fn getNext(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::getDefault

```java
/**
* @brief get the default label statement.
* @return SwitchLabelStatement
*/
```
```rust
pub fn getDefault(self: SwitchLabelStatement) -> SwitchLabelStatement;
```
## SwitchLabelStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: SwitchLabelStatement) -> string;
```
## SwitchLabelStatement::getStatement

```rust
pub fn getStatement(self: SwitchLabelStatement, index: int) -> Statement;
```
## SwitchLabelStatement::getSelector

```java
/**
* @brief gets the expression of the surrounding switch that this case is compared against.
* @return ExpressionListElement 
*/
```
```rust
pub fn getSelector(self: SwitchLabelStatement) -> ExpressionListElement;
```
## SwitchLabelStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: SwitchLabelStatement) -> Location;
```
## SwitchLabelStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: SwitchLabelStatement) -> int;
```
## SwitchLabelStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SwitchLabelStatement;
```
