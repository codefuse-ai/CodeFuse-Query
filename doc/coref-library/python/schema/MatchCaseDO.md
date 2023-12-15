# MatchCaseDO

Primary key: `element_oid: int`

```rust
schema MatchCaseDO {
  is_default: int,
  printable_text: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  pattern_oid: int,
  @primary element_oid: int
}
```
## MatchCaseDO::getIsDefault

```java
/**
* @brief gets the is default of this element.
* @return int
*/
```
```rust
pub fn getIsDefault(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getPatternOid

```java
/**
* @brief gets the pattern oid of this element.
* @return int
*/
```
```rust
pub fn getPatternOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: MatchCaseDO) -> string;
```
## MatchCaseDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: MatchCaseDO) -> int;
```
## MatchCaseDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MatchCaseDO;
```
