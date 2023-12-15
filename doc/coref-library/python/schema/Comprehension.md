# Comprehension

Inherit from [ComprehensionDO](./ComprehensionDO.md)

Primary key: `element_oid: int`

```rust
schema Comprehension extends ComprehensionDO {
  @primary element_oid: int,
  target_expr_oid: int,
  iter_expr_oid: int,
  printable_text: string,
  element_index: int,
  parent_oid: int
}
```
## Comprehension::getTargetExprOid

```java
/**
* @brief gets the target expr oid of this element.
* @return int
*/
```
```rust
pub fn getTargetExprOid(self: Comprehension) -> int;
```
## Comprehension::getIterExprOid

```java
/**
* @brief gets the iter expr oid of this element.
* @return int
*/
```
```rust
pub fn getIterExprOid(self: Comprehension) -> int;
```
## Comprehension::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Comprehension) -> int;
```
## Comprehension::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Comprehension) -> int;
```
## Comprehension::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Comprehension) -> string;
```
## Comprehension::getLocation

```java
/**
* @brief gets the location for the element's parent since this type has no location info.
* @return Location
*/
```
```rust
pub fn getLocation(self: Comprehension) -> Location;
```
## Comprehension::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Comprehension) -> CombineElement;
```
## Comprehension::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Comprehension) -> *CombineElement;
```
## Comprehension::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Comprehension;
```
