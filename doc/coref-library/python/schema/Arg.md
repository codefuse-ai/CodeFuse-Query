# Arg

Primary key: `element_oid: int`

```rust
schema Arg {
  @primary element_oid: int,
  annotation: int,
  element_index: int,
  parent_oid: int,
  location_oid: int,
  printable_text: string,
}
```
## Arg::getAnnotationOid

```rust
/**
     * @brief gets the annotation of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationOid(self: Arg) -> int;
```
## Arg::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Arg) -> int;
```
## Arg::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Arg) -> int;
```
## Arg::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Arg) -> string;
```
## Arg::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Arg) -> Location;
```
## Arg::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Arg) -> int;
```
## Arg::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Arg) -> CombineElement;
```
## Arg::getAnnotation

```rust
/**
     * @brief gets the annotation element of the element, if any.
     * @return Expression 
     */
```
```rust
pub fn getAnnotation(self: Arg) -> Expression;
```
## Arg::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Arg) -> *CombineElement;
```
## Arg::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Arg;
```
## Arg::is\<T\>

```rust
pub fn is<T>(self: Arg) -> bool;
```
## Arg::to\<T\>

```rust
pub fn to<T>(self: Arg) -> <any>;
```
## Arg::key\_neq

```rust
pub fn key_neq(self: Arg, object: <any>) -> bool;
```
## Arg::key\_eq

```rust
pub fn key_eq(self: Arg, object: <any>) -> bool;
```
## Arg::to\_set

```rust
pub fn to_set(self: Arg) -> *Arg;
```
