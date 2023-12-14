# MatchCase

Inherit from [MatchCaseDO](./MatchCaseDO.md)

Primary key: `element_oid: int`

```rust
schema MatchCase extends MatchCaseDO {
  @primary element_oid: int,
  pattern_oid: int,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  printable_text: string,
  is_default: int,
}
```
## MatchCase::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: MatchCase) -> int;
```
## MatchCase::getIsDefault

```java
/**
* @brief gets the is default of this element.
* @return int
*/
```
```rust
pub fn getIsDefault(self: MatchCase) -> int;
```
## MatchCase::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: MatchCase) -> int;
```
## MatchCase::getPatternOid

```java
/**
* @brief gets the pattern oid of this element.
* @return int
*/
```
```rust
pub fn getPatternOid(self: MatchCase) -> int;
```
## MatchCase::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: MatchCase) -> CombineElement;
```
## MatchCase::getMatchStatement

```java
/**
* @brief gets the match statement for the case.
* @return MatchStatement 
*/
```
```rust
pub fn getMatchStatement(self: MatchCase) -> MatchStatement;
```
## MatchCase::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: MatchCase) -> *CombineElement;
```
## MatchCase::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: MatchCase) -> int;
```
## MatchCase::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: MatchCase) -> string;
```
## MatchCase::isDefault

```java
/**
* @brief gets the default case pattern.
* @return int 
*/
```
```rust
pub fn isDefault(self: MatchCase) -> int;
```
## MatchCase::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MatchCase;
```
