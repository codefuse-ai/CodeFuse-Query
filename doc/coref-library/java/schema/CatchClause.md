# CatchClause

Primary key: `element_hash_id: int`

```rust
schema CatchClause {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parameter_hash_id: int,
  type_hash_id: int,
  try_statement_hash_id: int,
  index_order: int,
}
```
## CatchClause::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: CatchClause) -> string;
```
## CatchClause::getParameterHashId

```java
/**
* @brief gets the parameter hash id of this element.
* @return int
*/
```
```rust
pub fn getParameterHashId(self: CatchClause) -> int;
```
## CatchClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CatchClause;
```
## CatchClause::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: CatchClause) -> Location;
```
## CatchClause::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CatchClause) -> int;
```
## CatchClause::getTryStatementHashId

```java
/**
* @brief gets the try statement hash id of this element.
* @return int
*/
```
```rust
pub fn getTryStatementHashId(self: CatchClause) -> int;
```
## CatchClause::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: CatchClause) -> int;
```
## CatchClause::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: CatchClause) -> int;
```
## CatchClause::getBlock

```java
/**
* @brief gets the block of this catch clause
* @return CodeBlock 
*/
```
```rust
pub fn getBlock(self: CatchClause) -> CodeBlock;
```
## CatchClause::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: CatchClause) -> Type;
```
## CatchClause::getParameter

```java
/**
* @brief gets the parameter of this catch clause.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: CatchClause) -> Parameter;
```
## CatchClause::getTryStatement

```java
/**
* @brief get the try statement in which this catch clause occurs.
* @return TryStatement 
*/
```
```rust
pub fn getTryStatement(self: CatchClause) -> TryStatement;
```
## CatchClause::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: CatchClause) -> ElementParent;
```
## CatchClause::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: CatchClause) -> *ElementParent;
```
