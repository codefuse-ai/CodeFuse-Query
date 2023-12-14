# WithItem

Primary key: `element_oid: int`

```rust
schema WithItem {
  @primary element_oid: int,
  printable_text: string,
  element_index: int,
  parent_oid: int,
}
```
## WithItem::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: WithItem) -> int;
```
## WithItem::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: WithItem) -> string;
```
## WithItem::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: WithItem) -> int;
```
## WithItem::getLocation

```rust
/**
     * @brief gets the location for the element's parent since this type has no location info.
     * @return Location
     */
```
```rust
pub fn getLocation(self: WithItem) -> Location;
```
## WithItem::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: WithItem) -> CombineElement;
```
## WithItem::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: WithItem) -> *CombineElement;
```
## WithItem::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WithItem;
```
## WithItem::is\<T\>

```rust
pub fn is<T>(self: WithItem) -> bool;
```
## WithItem::to\<T\>

```rust
pub fn to<T>(self: WithItem) -> <any>;
```
## WithItem::key\_neq

```rust
pub fn key_neq(self: WithItem, object: <any>) -> bool;
```
## WithItem::key\_eq

```rust
pub fn key_eq(self: WithItem, object: <any>) -> bool;
```
## WithItem::to\_set

```rust
pub fn to_set(self: WithItem) -> *WithItem;
```
