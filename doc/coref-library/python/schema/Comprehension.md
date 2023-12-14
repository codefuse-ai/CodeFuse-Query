# Comprehension

Primary key: `element_oid: int`

```rust
schema Comprehension {
  @primary element_oid: int,
  target_expr_oid: int,
  iter_expr_oid: int,
  printable_text: string,
  element_index: int,
  parent_oid: int,
}
```
## Comprehension::getTargetExprOid

```rust
/**
     * @brief gets the target expr oid of this element.
     * @return int
     */
```
```rust
pub fn getTargetExprOid(self: Comprehension) -> int;
```
## Comprehension::getIterExprOid

```rust
/**
     * @brief gets the iter expr oid of this element.
     * @return int
     */
```
```rust
pub fn getIterExprOid(self: Comprehension) -> int;
```
## Comprehension::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Comprehension) -> int;
```
## Comprehension::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Comprehension) -> int;
```
## Comprehension::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Comprehension) -> string;
```
## Comprehension::getLocation

```rust
/**
     * @brief gets the location for the element's parent since this type has no location info.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Comprehension) -> Location;
```
## Comprehension::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Comprehension) -> CombineElement;
```
## Comprehension::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Comprehension) -> *CombineElement;
```
## Comprehension::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Comprehension;
```
## Comprehension::is\<T\>

```rust
pub fn is<T>(self: Comprehension) -> bool;
```
## Comprehension::to\<T\>

```rust
pub fn to<T>(self: Comprehension) -> <any>;
```
## Comprehension::key\_neq

```rust
pub fn key_neq(self: Comprehension, object: <any>) -> bool;
```
## Comprehension::key\_eq

```rust
pub fn key_eq(self: Comprehension, object: <any>) -> bool;
```
## Comprehension::to\_set

```rust
pub fn to_set(self: Comprehension) -> *Comprehension;
```
