# ReferenceParameterList

Primary key: `id: int`

```rust
schema ReferenceParameterList {
  @primary id: int,
}
```
## ReferenceParameterList::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ReferenceParameterList) -> *ElementParent;
```
## ReferenceParameterList::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ReferenceParameterList) -> ElementParent;
```
## ReferenceParameterList::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ReferenceParameterList) -> Location;
```
## ReferenceParameterList::getPrintableText

```rust
/**
     * @brief gets the printable text for the element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ReferenceParameterList) -> string;
```
## ReferenceParameterList::getTypeElement

```rust
/**
     * @brief gets the type element for the element, if any.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: ReferenceParameterList) -> *TypeElement;
```
## ReferenceParameterList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceParameterList;
```
## ReferenceParameterList::is\<T\>

```rust
pub fn is<T>(self: ReferenceParameterList) -> bool;
```
## ReferenceParameterList::to\<T\>

```rust
pub fn to<T>(self: ReferenceParameterList) -> <any>;
```
## ReferenceParameterList::key\_neq

```rust
pub fn key_neq(self: ReferenceParameterList, object: <any>) -> bool;
```
## ReferenceParameterList::key\_eq

```rust
pub fn key_eq(self: ReferenceParameterList, object: <any>) -> bool;
```
## ReferenceParameterList::to\_set

```rust
pub fn to_set(self: ReferenceParameterList) -> *ReferenceParameterList;
```
