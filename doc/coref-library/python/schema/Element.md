# Element

Inherit from [ElementDO](./ElementDO.md)

Primary key: `oid: int`

```rust
schema Element extends ElementDO {
  @primary oid: int,
  value: string,
  parent_oid: int,
  type: string,
}
```
## Element::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Element) -> string;
```
## Element::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Element) -> CombineElement;
```
## Element::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: Element) -> string;
```
## Element::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Element) -> int;
```
## Element::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Element) -> *CombineElement;
```
## Element::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Element;
```
