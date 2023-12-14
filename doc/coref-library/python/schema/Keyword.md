# Keyword

Inherit from [KeywordDO](./KeywordDO.md)

Primary key: `element_oid: int`

```rust
schema Keyword extends KeywordDO {
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

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: Keyword) -> int;
```
## Keyword::getValue

```java
/**
* @brief gets the value of the keyword.
* @return Expression 
*/
```
```rust
pub fn getValue(self: Keyword) -> Expression;
```
## Keyword::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: Keyword) -> int;
```
## Keyword::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Keyword) -> int;
```
## Keyword::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Keyword) -> string;
```
## Keyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Keyword;
```
## Keyword::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Keyword) -> Location;
```
## Keyword::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Keyword) -> int;
```
## Keyword::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Keyword) -> CombineElement;
```
## Keyword::getArgName

```java
/**
* @brief gets the parameter name of the keyword.
* @return string 
*/
```
```rust
pub fn getArgName(self: Keyword) -> string;
```
## Keyword::getArgValue

```java
/**
* @brief gets the arg value of this element.
* @return string
*/
```
```rust
pub fn getArgValue(self: Keyword) -> string;
```
## Keyword::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Keyword) -> *CombineElement;
```
