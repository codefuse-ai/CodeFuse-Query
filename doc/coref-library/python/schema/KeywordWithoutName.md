# KeywordWithoutName

Inherit from [Keyword](./Keyword.md)

Primary key: `element_oid: int`

```rust
schema KeywordWithoutName extends Keyword {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  value_oid: int,
  arg_value: string,
  @primary element_oid: int
}
```
## KeywordWithoutName::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: KeywordWithoutName) -> *CombineElement;
```
## KeywordWithoutName::getArgValue

```java
/**
* @brief gets the arg value of this element.
* @return string
*/
```
```rust
pub fn getArgValue(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::getArgName

```java
/**
* @brief gets the parameter name of the keyword.
* @return string 
*/
```
```rust
pub fn getArgName(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *KeywordWithoutName;
```
## KeywordWithoutName::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: KeywordWithoutName) -> Location;
```
## KeywordWithoutName::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: KeywordWithoutName) -> string;
```
## KeywordWithoutName::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getValue

```java
/**
* @brief gets the value of the keyword.
* @return Expression 
*/
```
```rust
pub fn getValue(self: KeywordWithoutName) -> Expression;
```
## KeywordWithoutName::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: KeywordWithoutName) -> CombineElement;
```
## KeywordWithoutName::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: KeywordWithoutName) -> int;
```
## KeywordWithoutName::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: KeywordWithoutName) -> int;
```
