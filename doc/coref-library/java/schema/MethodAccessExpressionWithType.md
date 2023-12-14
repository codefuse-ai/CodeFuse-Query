# MethodAccessExpressionWithType

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithType {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodAccessExpressionWithType::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: MethodAccessExpressionWithType) -> *ElementParent;
```
## MethodAccessExpressionWithType::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: MethodAccessExpressionWithType) -> string;
```
## MethodAccessExpressionWithType::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: MethodAccessExpressionWithType) -> Statement;
```
## MethodAccessExpressionWithType::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: MethodAccessExpressionWithType) -> ElementParent;
```
## MethodAccessExpressionWithType::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithType;
```
## MethodAccessExpressionWithType::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: MethodAccessExpressionWithType) -> Location;
```
## MethodAccessExpressionWithType::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: MethodAccessExpressionWithType) -> Callable;
```
## MethodAccessExpressionWithType::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: MethodAccessExpressionWithType) -> NumberOfLines;
```
## MethodAccessExpressionWithType::getReference

```rust
/**
     * @brief gets the reference expression of the element.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getReference(self: MethodAccessExpressionWithType) -> ReferenceExpression;
```
## MethodAccessExpressionWithType::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: MethodAccessExpressionWithType) -> Type;
```
## MethodAccessExpressionWithType::is\<T\>

```rust
pub fn is<T>(self: MethodAccessExpressionWithType) -> bool;
```
## MethodAccessExpressionWithType::to\<T\>

```rust
pub fn to<T>(self: MethodAccessExpressionWithType) -> <any>;
```
## MethodAccessExpressionWithType::key\_neq

```rust
pub fn key_neq(self: MethodAccessExpressionWithType, object: <any>) -> bool;
```
## MethodAccessExpressionWithType::key\_eq

```rust
pub fn key_eq(self: MethodAccessExpressionWithType, object: <any>) -> bool;
```
## MethodAccessExpressionWithType::to\_set

```rust
pub fn to_set(self: MethodAccessExpressionWithType) -> *MethodAccessExpressionWithType;
```
