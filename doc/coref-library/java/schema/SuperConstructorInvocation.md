# SuperConstructorInvocation

Primary key: `element_hash_id: int`

```rust
schema SuperConstructorInvocation {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## SuperConstructorInvocation::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SuperConstructorInvocation) -> *ElementParent;
```
## SuperConstructorInvocation::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SuperConstructorInvocation) -> string;
```
## SuperConstructorInvocation::getEnclosingStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SuperConstructorInvocation) -> Statement;
```
## SuperConstructorInvocation::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SuperConstructorInvocation) -> int;
```
## SuperConstructorInvocation::getParent

```rust
/**
     * @brief gets the parent of the expression.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: SuperConstructorInvocation) -> ElementParent;
```
## SuperConstructorInvocation::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SuperConstructorInvocation) -> NumberOfLines;
```
## SuperConstructorInvocation::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperConstructorInvocation;
```
## SuperConstructorInvocation::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SuperConstructorInvocation) -> int;
```
## SuperConstructorInvocation::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: SuperConstructorInvocation) -> Location;
```
## SuperConstructorInvocation::getEnclosingCallable

```rust
/**
     * @brief gets the callable in which this expression occurs.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SuperConstructorInvocation) -> Callable;
```
## SuperConstructorInvocation::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SuperConstructorInvocation) -> int;
```
## SuperConstructorInvocation::getConstructor

```rust
pub fn getConstructor(self: SuperConstructorInvocation) -> Constructor;
```
## SuperConstructorInvocation::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SuperConstructorInvocation) -> string;
```
## SuperConstructorInvocation::is\<T\>

```rust
pub fn is<T>(self: SuperConstructorInvocation) -> bool;
```
## SuperConstructorInvocation::to\<T\>

```rust
pub fn to<T>(self: SuperConstructorInvocation) -> <any>;
```
## SuperConstructorInvocation::key\_neq

```rust
pub fn key_neq(self: SuperConstructorInvocation, object: <any>) -> bool;
```
## SuperConstructorInvocation::key\_eq

```rust
pub fn key_eq(self: SuperConstructorInvocation, object: <any>) -> bool;
```
## SuperConstructorInvocation::to\_set

```rust
pub fn to_set(self: SuperConstructorInvocation) -> *SuperConstructorInvocation;
```
