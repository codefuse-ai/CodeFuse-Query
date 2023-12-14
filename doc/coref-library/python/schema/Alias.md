# Alias

Primary key: `element_oid: int`

```rust
schema Alias {
  @primary element_oid: int,
  name: string,
  asname: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  printable_text: string,
}
```
## Alias::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Alias) -> string;
```
## Alias::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Alias) -> int;
```
## Alias::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Alias) -> int;
```
## Alias::getAsname

```rust
/**
     * @brief gets the asname of this element.
     * @return string
     */
```
```rust
pub fn getAsname(self: Alias) -> string;
```
## Alias::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Alias) -> string;
```
## Alias::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Alias) -> CombineElement;
```
## Alias::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Alias) -> int;
```
## Alias::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Alias) -> Location;
```
## Alias::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Alias) -> *CombineElement;
```
## Alias::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Alias;
```
## Alias::is\<T\>

```rust
pub fn is<T>(self: Alias) -> bool;
```
## Alias::to\<T\>

```rust
pub fn to<T>(self: Alias) -> <any>;
```
## Alias::key\_neq

```rust
pub fn key_neq(self: Alias, object: <any>) -> bool;
```
## Alias::key\_eq

```rust
pub fn key_eq(self: Alias, object: <any>) -> bool;
```
## Alias::to\_set

```rust
pub fn to_set(self: Alias) -> *Alias;
```
