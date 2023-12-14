# ReferenceParameterList

Primary key: `id: int`

```rust
schema ReferenceParameterList {
  @primary id: int,
}
```
## ReferenceParameterList::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ReferenceParameterList) -> *ElementParent;
```
## ReferenceParameterList::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ReferenceParameterList) -> ElementParent;
```
## ReferenceParameterList::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ReferenceParameterList) -> Location;
```
## ReferenceParameterList::getPrintableText

```java
/**
* @brief gets the printable text for the element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ReferenceParameterList) -> string;
```
## ReferenceParameterList::getTypeElement

```java
/**
* @brief gets the type element for the element, if any.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: ReferenceParameterList) -> *TypeElement;
```
## ReferenceParameterList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceParameterList;
```
