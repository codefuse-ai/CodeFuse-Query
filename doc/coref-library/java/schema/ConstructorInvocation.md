# ConstructorInvocation

Primary key: `element_hash_id: int`

```rust
schema ConstructorInvocation {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ConstructorInvocation::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ConstructorInvocation) -> string;
```
## ConstructorInvocation::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ConstructorInvocation) -> Statement;
```
## ConstructorInvocation::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ConstructorInvocation) -> ElementParent;
```
## ConstructorInvocation::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConstructorInvocation;
```
## ConstructorInvocation::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ConstructorInvocation) -> Location;
```
## ConstructorInvocation::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ConstructorInvocation) -> Callable;
```
## ConstructorInvocation::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ConstructorInvocation) -> NumberOfLines;
```
## ConstructorInvocation::getReference

```rust
/**
     * @brief gets the reference element of the expression
     * @return ReferenceElement 
     */
```
```rust
pub fn getReference(self: ConstructorInvocation) -> ReferenceElement;
```
## ConstructorInvocation::getConstructor

```rust
/**
     * @brief gets the constructor of the expression
     * @return Constructor 
     */
```
```rust
pub fn getConstructor(self: ConstructorInvocation) -> Constructor;
```
## ConstructorInvocation::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ConstructorInvocation) -> string;
```
## ConstructorInvocation::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ConstructorInvocation) -> *ElementParent;
```
## ConstructorInvocation::getExpressionList

```rust
/**
    * @brief gets the argument of the expression
    * @return ExpressionList 
    */
```
```rust
pub fn getExpressionList(self: ConstructorInvocation) -> ExpressionList;
```
## ConstructorInvocation::is\<T\>

```rust
pub fn is<T>(self: ConstructorInvocation) -> bool;
```
## ConstructorInvocation::to\<T\>

```rust
pub fn to<T>(self: ConstructorInvocation) -> <any>;
```
## ConstructorInvocation::key\_neq

```rust
pub fn key_neq(self: ConstructorInvocation, object: <any>) -> bool;
```
## ConstructorInvocation::key\_eq

```rust
pub fn key_eq(self: ConstructorInvocation, object: <any>) -> bool;
```
## ConstructorInvocation::to\_set

```rust
pub fn to_set(self: ConstructorInvocation) -> *ConstructorInvocation;
```
