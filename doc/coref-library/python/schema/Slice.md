# Slice

Primary key: `element_oid: int`

```rust
schema Slice {
  @primary element_oid: int,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  printable_text: string,
  has_step: int,
}
```
## Slice::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Slice) -> int;
```
## Slice::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Slice) -> string;
```
## Slice::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Slice) -> int;
```
## Slice::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Slice) -> Location;
```
## Slice::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Slice) -> int;
```
## Slice::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Slice) -> CombineElement;
```
## Slice::getHasStep

```rust
/**
     * @brief gets the has step of this element.
     * @return int
     */
```
```rust
pub fn getHasStep(self: Slice) -> int;
```
## Slice::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Slice) -> *CombineElement;
```
## Slice::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Slice;
```
## Slice::is\<T\>

```rust
pub fn is<T>(self: Slice) -> bool;
```
## Slice::to\<T\>

```rust
pub fn to<T>(self: Slice) -> <any>;
```
## Slice::key\_neq

```rust
pub fn key_neq(self: Slice, object: <any>) -> bool;
```
## Slice::key\_eq

```rust
pub fn key_eq(self: Slice, object: <any>) -> bool;
```
## Slice::to\_set

```rust
pub fn to_set(self: Slice) -> *Slice;
```
