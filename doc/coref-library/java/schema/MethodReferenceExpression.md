# MethodReferenceExpression

Primary key: `element_hash_id: int`

```rust
schema MethodReferenceExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodReferenceExpression::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: MethodReferenceExpression) -> *ElementParent;
```
## MethodReferenceExpression::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: MethodReferenceExpression) -> string;
```
## MethodReferenceExpression::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: MethodReferenceExpression) -> Statement;
```
## MethodReferenceExpression::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: MethodReferenceExpression) -> ElementParent;
```
## MethodReferenceExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodReferenceExpression;
```
## MethodReferenceExpression::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: MethodReferenceExpression) -> Location;
```
## MethodReferenceExpression::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: MethodReferenceExpression) -> Callable;
```
## MethodReferenceExpression::getMethod

```rust
/**
     * @brief gets the method of the call.
     * @return Method 
     */
```
```rust
pub fn getMethod(self: MethodReferenceExpression) -> Method;
```
## MethodReferenceExpression::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: MethodReferenceExpression) -> NumberOfLines;
```
## MethodReferenceExpression::getReference

```rust
/**
     * @brief gets the reference expression of the element.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getReference(self: MethodReferenceExpression) -> ReferenceExpression;
```
## MethodReferenceExpression::getCallable

```rust
/**
     * @brief gets the callable of the call.
     * @return Callable 
     */
```
```rust
pub fn getCallable(self: MethodReferenceExpression) -> Callable;
```
## MethodReferenceExpression::getConstructor

```rust
/**
     * @brief gets the constructor of the call.
     * @return Constructor 
     */
```
```rust
pub fn getConstructor(self: MethodReferenceExpression) -> Constructor;
```
## MethodReferenceExpression::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: MethodReferenceExpression) -> Type;
```
## MethodReferenceExpression::is\<T\>

```rust
pub fn is<T>(self: MethodReferenceExpression) -> bool;
```
## MethodReferenceExpression::to\<T\>

```rust
pub fn to<T>(self: MethodReferenceExpression) -> <any>;
```
## MethodReferenceExpression::key\_neq

```rust
pub fn key_neq(self: MethodReferenceExpression, object: <any>) -> bool;
```
## MethodReferenceExpression::key\_eq

```rust
pub fn key_eq(self: MethodReferenceExpression, object: <any>) -> bool;
```
## MethodReferenceExpression::to\_set

```rust
pub fn to_set(self: MethodReferenceExpression) -> *MethodReferenceExpression;
```
