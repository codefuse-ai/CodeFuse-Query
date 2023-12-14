# Element

Primary key: `oid: int`

```rust
schema Element {
  @primary oid: int,
  value: string,
  parent_oid: int,
  type: string,
}
```
## Element::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Element) -> string;
```
## Element::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Element) -> CombineElement;
```
## Element::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: Element) -> string;
```
## Element::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Element) -> int;
```
## Element::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Element) -> *CombineElement;
```
## Element::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Element;
```
## Element::is\<T\>

```rust
pub fn is<T>(self: Element) -> bool;
```
## Element::to\<T\>

```rust
pub fn to<T>(self: Element) -> <any>;
```
## Element::key\_neq

```rust
pub fn key_neq(self: Element, object: <any>) -> bool;
```
## Element::key\_eq

```rust
pub fn key_eq(self: Element, object: <any>) -> bool;
```
## Element::to\_set

```rust
pub fn to_set(self: Element) -> *Element;
```
