# LabeledStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema LabeledStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## LabeledStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: LabeledStatement) -> NumberOfLines;
```
## LabeledStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: LabeledStatement) -> ElementParent;
```
## LabeledStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LabeledStatement) -> int;
```
## LabeledStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: LabeledStatement) -> Callable;
```
## LabeledStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LabeledStatement) -> int;
```
## LabeledStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LabeledStatement) -> *ElementParent;
```
## LabeledStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: LabeledStatement) -> *Statement;
```
## LabeledStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: LabeledStatement) -> Statement;
```
## LabeledStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: LabeledStatement) -> *Statement;
```
## LabeledStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: LabeledStatement) -> string;
```
## LabeledStatement::getStatement

```java
/**
* @brief gets the labeled statement.
* @return Statement 
*/
```
```rust
pub fn getStatement(self: LabeledStatement) -> Statement;
```
## LabeledStatement::getLabel

```java
/**
* @brief gets the label name of the statement.
* @return string 
*/
```
```rust
pub fn getLabel(self: LabeledStatement) -> string;
```
## LabeledStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LabeledStatement) -> string;
```
## LabeledStatement::getStatementLabel

```java
/**
* @brief gets the identifier of the element's label.
* @return Identifier 
*/
```
```rust
pub fn getStatementLabel(self: LabeledStatement) -> Identifier;
```
## LabeledStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: LabeledStatement) -> Location;
```
## LabeledStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LabeledStatement) -> int;
```
## LabeledStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LabeledStatement;
```
