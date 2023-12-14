# Keyword

Primary key: `element_oid: int`

```rust
schema Keyword {
  @primary element_oid: int,
  arg_value: string,
  value_oid: int,
  element_index: int,
  parent_oid: int,
  location_oid: int,
  printable_text: string,
}
```
## Keyword::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: Keyword) -> int;
```
## Keyword::getValue

```rust
/**
     * @brief gets the value of the keyword.
     * @return Expression 
     */
```
```rust
pub fn getValue(self: Keyword) -> Expression;
```
## Keyword::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Keyword) -> int;
```
## Keyword::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Keyword) -> int;
```
## Keyword::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Keyword) -> string;
```
## Keyword::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Keyword;
```
## Keyword::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Keyword) -> Location;
```
## Keyword::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Keyword) -> int;
```
## Keyword::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Keyword) -> CombineElement;
```
## Keyword::getArgName

```rust
/**
     * @brief gets the parameter name of the keyword.
     * @return string 
     */
```
```rust
pub fn getArgName(self: Keyword) -> string;
```
## Keyword::getArgValue

```rust
/**
     * @brief gets the arg value of this element.
     * @return string
     */
```
```rust
pub fn getArgValue(self: Keyword) -> string;
```
## Keyword::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Keyword) -> *CombineElement;
```
## Keyword::is\<T\>

```rust
pub fn is<T>(self: Keyword) -> bool;
```
## Keyword::to\<T\>

```rust
pub fn to<T>(self: Keyword) -> <any>;
```
## Keyword::key\_neq

```rust
pub fn key_neq(self: Keyword, object: <any>) -> bool;
```
## Keyword::key\_eq

```rust
pub fn key_eq(self: Keyword, object: <any>) -> bool;
```
## Keyword::to\_set

```rust
pub fn to_set(self: Keyword) -> *Keyword;
```
