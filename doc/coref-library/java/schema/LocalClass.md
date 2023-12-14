# LocalClass

Primary key: `element_hash_id: int`

```rust
schema LocalClass {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## LocalClass::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: LocalClass) -> string;
```
## LocalClass::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LocalClass) -> string;
```
## LocalClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LocalClass) -> int;
```
## LocalClass::getParent

```rust
/**
     * @brief gets the declaration statement of the element
     * @return Statement 
     */
```
```rust
pub fn getParent(self: LocalClass) -> ElementParent;
```
## LocalClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LocalClass) -> int;
```
## LocalClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: LocalClass) -> Location;
```
## LocalClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LocalClass) -> *ElementParent;
```
## LocalClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LocalClass;
```
## LocalClass::is\<T\>

```rust
pub fn is<T>(self: LocalClass) -> bool;
```
## LocalClass::to\<T\>

```rust
pub fn to<T>(self: LocalClass) -> <any>;
```
## LocalClass::key\_neq

```rust
pub fn key_neq(self: LocalClass, object: <any>) -> bool;
```
## LocalClass::key\_eq

```rust
pub fn key_eq(self: LocalClass, object: <any>) -> bool;
```
## LocalClass::to\_set

```rust
pub fn to_set(self: LocalClass) -> *LocalClass;
```
