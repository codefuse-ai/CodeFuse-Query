# InstanceofExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema InstanceofExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## InstanceofExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: InstanceofExpression) -> string;
```
## InstanceofExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: InstanceofExpression) -> ElementParent;
```
## InstanceofExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: InstanceofExpression) -> NumberOfLines;
```
## InstanceofExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *InstanceofExpression;
```
## InstanceofExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: InstanceofExpression) -> Location;
```
## InstanceofExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: InstanceofExpression) -> *ElementParent;
```
## InstanceofExpression::getInstanceType

```java
/**
* @brief gets the instance type of the instanceof expression
* @return TypeElement
*/
```
```rust
pub fn getInstanceType(self: InstanceofExpression) -> TypeElement;
```
## InstanceofExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: InstanceofExpression) -> Callable;
```
## InstanceofExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: InstanceofExpression) -> int;
```
## InstanceofExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: InstanceofExpression) -> Statement;
```
## InstanceofExpression::getOperand

```java
/**
* @brief gets the operand expression of the instanceof expression
* @return Expression 
*/
```
```rust
pub fn getOperand(self: InstanceofExpression) -> Expression;
```
## InstanceofExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: InstanceofExpression) -> string;
```
