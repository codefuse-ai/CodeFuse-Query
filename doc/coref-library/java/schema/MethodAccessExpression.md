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

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: MethodAccessExpression) -> string;
```
## MethodAccessExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: MethodAccessExpression) -> ElementParent;
```
## MethodAccessExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: MethodAccessExpression) -> Callable;
```
## MethodAccessExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: MethodAccessExpression) -> Statement;
```
## MethodAccessExpression::getArgument

```rust
/**
     * @brief gets the call site of the call.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getArgument(self: MethodAccessExpression, idx: int) -> Expression;
```
## MethodAccessExpression::getNpMethod

```rust
/**
     * @brief gets the np-method of the call.
     * @return NpMethod
     */
```
```rust
pub fn getNpMethod(self: MethodAccessExpression) -> NpMethod;
```
## MethodAccessExpression::getCallable

```rust
/**
     * @brief gets the callable of the call.
     * @return Callable 
     */
```
```rust
pub fn getCallable(self: MethodAccessExpression) -> Callable;
```
## MethodAccessExpression::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: MethodAccessExpression) -> Type;
```
## MethodAccessExpression::getConstructor

```rust
/**
     * @brief gets the constructor of the call.
     * @return Constructor 
     */
```
```rust
pub fn getConstructor(self: MethodAccessExpression) -> Constructor;
```
## MethodAccessExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: MethodAccessExpression) -> NumberOfLines;
```
## MethodAccessExpression::getMethod

```rust
/**
     * @brief gets the method of the call.
     * @return Method 
     */
```
```rust
pub fn getMethod(self: MethodAccessExpression) -> Method;
```
## MethodAccessExpression::getReference

```rust
/**
     * @brief gets the reference expression of the element.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getReference(self: MethodAccessExpression) -> ReferenceExpression;
```
## MethodAccessExpression::getAnAncestor

```rust
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

```rust
/**
     * @brief gets the call site of the call.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getCallSite(self: MethodAccessExpression) -> ReferenceExpression;
```
## MethodAccessExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: MethodAccessExpression) -> int;
```
## MethodAccessExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: MethodAccessExpression) -> Location;
```
## MethodAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpression;
```
## MethodAccessExpression::is\<T\>

```rust
pub fn is<T>(self: MethodAccessExpression) -> bool;
```
## MethodAccessExpression::to\<T\>

```rust
pub fn to<T>(self: MethodAccessExpression) -> <any>;
```
## MethodAccessExpression::key\_neq

```rust
pub fn key_neq(self: MethodAccessExpression, object: <any>) -> bool;
```
## MethodAccessExpression::key\_eq

```rust
pub fn key_eq(self: MethodAccessExpression, object: <any>) -> bool;
```
## MethodAccessExpression::to\_set

```rust
pub fn to_set(self: MethodAccessExpression) -> *MethodAccessExpression;
```
