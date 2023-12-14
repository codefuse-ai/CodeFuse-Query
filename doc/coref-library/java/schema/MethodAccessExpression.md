# MethodAccessExpression

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodAccessExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: MethodAccessExpression) -> string;
```
## MethodAccessExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: MethodAccessExpression) -> ElementParent;
```
## MethodAccessExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: MethodAccessExpression) -> Callable;
```
## MethodAccessExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MethodAccessExpression) -> Statement;
```
## MethodAccessExpression::getArgument

```java
/**
* @brief gets the call site of the call.
* @return ReferenceExpression 
*/
```
```rust
pub fn getArgument(self: MethodAccessExpression, idx: int) -> Expression;
```
## MethodAccessExpression::getNpMethod

```java
/**
* @brief gets the np-method of the call.
* @return NpMethod
*/
```
```rust
pub fn getNpMethod(self: MethodAccessExpression) -> NpMethod;
```
## MethodAccessExpression::getCallable

```java
/**
* @brief gets the callable of the call.
* @return Callable 
*/
```
```rust
pub fn getCallable(self: MethodAccessExpression) -> Callable;
```
## MethodAccessExpression::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: MethodAccessExpression) -> Type;
```
## MethodAccessExpression::getConstructor

```java
/**
* @brief gets the constructor of the call.
* @return Constructor 
*/
```
```rust
pub fn getConstructor(self: MethodAccessExpression) -> Constructor;
```
## MethodAccessExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MethodAccessExpression) -> NumberOfLines;
```
## MethodAccessExpression::getMethod

```java
/**
* @brief gets the method of the call.
* @return Method 
*/
```
```rust
pub fn getMethod(self: MethodAccessExpression) -> Method;
```
## MethodAccessExpression::getReference

```java
/**
* @brief gets the reference expression of the element.
* @return ReferenceExpression 
*/
```
```rust
pub fn getReference(self: MethodAccessExpression) -> ReferenceExpression;
```
## MethodAccessExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: MethodAccessExpression) -> *ElementParent;
```
## MethodAccessExpression::getExpressionList

```rust
pub fn getExpressionList(self: MethodAccessExpression) -> ExpressionList;
```
## MethodAccessExpression::getCallSite

```java
/**
* @brief gets the call site of the call.
* @return ReferenceExpression 
*/
```
```rust
pub fn getCallSite(self: MethodAccessExpression) -> ReferenceExpression;
```
## MethodAccessExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MethodAccessExpression) -> Location;
```
## MethodAccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpression;
```
