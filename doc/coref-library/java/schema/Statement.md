# Statement

Inherit from [StatementDO](./StatementDO.md)

Primary key: `element_hash_id: int`

```rust
schema Statement extends StatementDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
  type: string
}
```
## Statement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Statement) -> string;
```
## Statement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: Statement) -> *Statement;
```
## Statement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: Statement) -> Statement;
```
## Statement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Statement) -> *ElementParent;
```
## Statement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: Statement) -> *Statement;
```
## Statement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: Statement) -> string;
```
## Statement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: Statement) -> int;
```
## Statement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: Statement) -> Callable;
```
## Statement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Statement) -> int;
```
## Statement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: Statement) -> ElementParent;
```
## Statement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Statement) -> int;
```
## Statement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Statement;
```
## Statement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Statement) -> Location;
```
## Statement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Statement) -> NumberOfLines;
```
