# JavadocTagValue

Primary key: `element_hash_id: int`

```rust
schema JavadocTagValue {
  @primary element_hash_id: int,
  value: string,
  location_hash_id: int,
  parent_hash_id: int,
}
```
## JavadocTagValue::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocTagValue) -> int;
```
## JavadocTagValue::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: JavadocTagValue) -> string;
```
## JavadocTagValue::getJavaDocTag

```rust
/**
     * @brief gets the doc tag in which the element is contained.
     * @return JavadocTag 
     */
```
```rust
pub fn getJavaDocTag(self: JavadocTagValue) -> JavadocTag;
```
## JavadocTagValue::getParentHashId

```rust
/**
     * @brief gets the containing comment hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JavadocTagValue) -> int;
```
## JavadocTagValue::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: JavadocTagValue) -> Location;
```
## JavadocTagValue::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: JavadocTagValue) -> *ElementParent;
```
## JavadocTagValue::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagValue;
```
## JavadocTagValue::is\<T\>

```rust
pub fn is<T>(self: JavadocTagValue) -> bool;
```
## JavadocTagValue::to\<T\>

```rust
pub fn to<T>(self: JavadocTagValue) -> <any>;
```
## JavadocTagValue::key\_neq

```rust
pub fn key_neq(self: JavadocTagValue, object: <any>) -> bool;
```
## JavadocTagValue::key\_eq

```rust
pub fn key_eq(self: JavadocTagValue, object: <any>) -> bool;
```
## JavadocTagValue::to\_set

```rust
pub fn to_set(self: JavadocTagValue) -> *JavadocTagValue;
```
