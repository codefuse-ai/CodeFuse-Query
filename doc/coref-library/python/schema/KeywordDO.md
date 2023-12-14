# KeywordDO

Primary key: `element_oid: int`

```rust
schema KeywordDO {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  value_oid: int,
  arg_value: string,
  @primary element_oid: int,
}
```
## KeywordDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: KeywordDO) -> int;
```
## KeywordDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: KeywordDO) -> string;
```
## KeywordDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: KeywordDO) -> int;
```
## KeywordDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: KeywordDO) -> int;
```
## KeywordDO::getArgValue

```java
/**
* @brief gets the arg value of this element.
* @return string
*/
```
```rust
pub fn getArgValue(self: KeywordDO) -> string;
```
## KeywordDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: KeywordDO) -> int;
```
## KeywordDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *KeywordDO;
```
