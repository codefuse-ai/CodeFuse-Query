# CallExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema CallExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## CallExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *ElementParent;
```
## CallExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: CallExpression) -> string;
```
## CallExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: CallExpression) -> Statement;
```
## CallExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: CallExpression) -> int;
```
## CallExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: CallExpression) -> Callable;
```
## CallExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: CallExpression) -> string;
```
## CallExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CallExpression) -> int;
```
## CallExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallExpression;
```
## CallExpression::getArguments

```rust
pub fn getArguments(self: CallExpression) -> *Expression;
```
## CallExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: CallExpression) -> int;
```
## CallExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: CallExpression) -> ElementParent;
```
## CallExpression::getLombokField

```rust
pub fn getLombokField(self: CallExpression) -> LombokField;
```
## CallExpression::getCallSite

```rust
pub fn getCallSite(self: CallExpression) -> ReferenceExpression;
```
## CallExpression::getMethodName

```rust
pub fn getMethodName(self: CallExpression) -> string;
```
## CallExpression::getReference

```rust
pub fn getReference(self: CallExpression) -> ReferenceExpression;
```
## CallExpression::getCallSiteDefinition

```rust
pub fn getCallSiteDefinition(self: CallExpression) -> ClassOrInterface;
```
## CallExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: CallExpression) -> NumberOfLines;
```
## CallExpression::getMethod

```rust
pub fn getMethod(self: CallExpression) -> Method;
```
