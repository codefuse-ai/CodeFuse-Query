# KeywordWithoutName

Primary key: `element_oid: int`

```rust
schema KeywordWithoutName {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  value_oid: int,
  arg_value: string,
  @primary element_oid: int,
}
```
## KeywordWithoutName::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: KeywordWithoutName) -> *CombineElement;
```
## KeywordWithoutName::getArgValue

```rust
/**
     * @brief gets the arg value of this element.
     * @return string
     */
```
```rust
pub fn getArgValue(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::getArgName

```rust
/**
     * @brief gets the parameter name of the keyword.
     * @return string 
     */
```
```rust
pub fn getArgName(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *KeywordWithoutName;
```
## KeywordWithoutName::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: KeywordWithoutName) -> Location;
```
## KeywordWithoutName::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getValue

```rust
/**
     * @brief gets the value of the keyword.
     * @return Expression 
     */
```
```rust
pub fn getValue(self: KeywordWithoutName) -> Expression;
```
## KeywordWithoutName::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: KeywordWithoutName) -> CombineElement;
```
## KeywordWithoutName::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::is\<T\>

```rust
pub fn is<T>(self: KeywordWithoutName) -> bool;
```
## KeywordWithoutName::to\<T\>

```rust
pub fn to<T>(self: KeywordWithoutName) -> <any>;
```
## KeywordWithoutName::key\_neq

```rust
pub fn key_neq(self: KeywordWithoutName, object: <any>) -> bool;
```
## KeywordWithoutName::key\_eq

```rust
pub fn key_eq(self: KeywordWithoutName, object: <any>) -> bool;
```
## KeywordWithoutName::to\_set

```rust
pub fn to_set(self: KeywordWithoutName) -> *KeywordWithoutName;
```
