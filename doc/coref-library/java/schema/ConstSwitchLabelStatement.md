# ConstSwitchLabelStatement

Inherit from [SwitchLabelStatement](./SwitchLabelStatement.md)

Primary key: `element_hash_id: int`

```rust
schema ConstSwitchLabelStatement extends SwitchLabelStatement {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
  type: string
}
```
## ConstSwitchLabelStatement::getSelector

```java
/**
* @brief gets the expression of the surrounding switch that this case is compared against.
* @return ExpressionListElement 
*/
```
```rust
pub fn getSelector(self: ConstSwitchLabelStatement) -> ExpressionListElement;
```
## ConstSwitchLabelStatement::getStatement

```rust
pub fn getStatement(self: ConstSwitchLabelStatement, index: int) -> Statement;
```
## ConstSwitchLabelStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ConstSwitchLabelStatement) -> string;
```
## ConstSwitchLabelStatement::getDefault

```java
/**
* @brief get the default label statement.
* @return SwitchLabelStatement
*/
```
```rust
pub fn getDefault(self: ConstSwitchLabelStatement) -> SwitchLabelStatement;
```
## ConstSwitchLabelStatement::getNext

```java
/**
* @brief the element represents a default section or not, 1 means true.
* @return int 
*/
```
```rust
pub fn getNext(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::isDefaultValue

```java
/**
* @brief the element represents a default section or not, 1 means true.
* @return int 
*/
```
```rust
pub fn isDefaultValue(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getEnclosingSwitchBlock

```java
/**
* @brief gets the enclosing switch statement of this case.
* @return SwitchStatement 
*/
```
```rust
pub fn getEnclosingSwitchBlock(self: ConstSwitchLabelStatement) -> SwitchStatement;
```
## ConstSwitchLabelStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ConstSwitchLabelStatement) -> ElementParent;
```
## ConstSwitchLabelStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ConstSwitchLabelStatement) -> Statement;
```
## ConstSwitchLabelStatement::getNextSwitchCaseStatement

```rust
pub fn getNextSwitchCaseStatement(self: ConstSwitchLabelStatement) -> SwitchLabelStatement;
```
## ConstSwitchLabelStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ConstSwitchLabelStatement) -> *ElementParent;
```
## ConstSwitchLabelStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getExecutionStatement

```rust
pub fn getExecutionStatement(self: ConstSwitchLabelStatement) -> *Statement;
```
## ConstSwitchLabelStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ConstSwitchLabelStatement) -> Callable;
```
## ConstSwitchLabelStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ConstSwitchLabelStatement) -> string;
```
## ConstSwitchLabelStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ConstSwitchLabelStatement) -> NumberOfLines;
```
## ConstSwitchLabelStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConstSwitchLabelStatement) -> int;
```
## ConstSwitchLabelStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ConstSwitchLabelStatement) -> Location;
```
## ConstSwitchLabelStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConstSwitchLabelStatement;
```
