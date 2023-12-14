# MatchCase

Primary key: `element_oid: int`

```rust
schema MatchCase {
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

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: MatchCase) -> int;
```
## MatchCase::getIsDefault

```rust
/**
     * @brief gets the is default of this element.
     * @return int
     */
```
```rust
pub fn getIsDefault(self: MatchCase) -> int;
```
## MatchCase::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: MatchCase) -> int;
```
## MatchCase::getPatternOid

```rust
/**
     * @brief gets the pattern oid of this element.
     * @return int
     */
```
```rust
pub fn getPatternOid(self: MatchCase) -> int;
```
## MatchCase::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: MatchCase) -> CombineElement;
```
## MatchCase::getMatchStatement

```rust
/**
     * @brief gets the match statement for the case.
     * @return MatchStatement 
     */
```
```rust
pub fn getMatchStatement(self: MatchCase) -> MatchStatement;
```
## MatchCase::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: MatchCase) -> *CombineElement;
```
## MatchCase::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: MatchCase) -> int;
```
## MatchCase::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: MatchCase) -> string;
```
## MatchCase::isDefault

```rust
/**
     * @brief gets the default case pattern.
     * @return int 
     */
```
```rust
pub fn isDefault(self: MatchCase) -> int;
```
## MatchCase::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MatchCase;
```
## MatchCase::is\<T\>

```rust
pub fn is<T>(self: MatchCase) -> bool;
```
## MatchCase::to\<T\>

```rust
pub fn to<T>(self: MatchCase) -> <any>;
```
## MatchCase::key\_neq

```rust
pub fn key_neq(self: MatchCase, object: <any>) -> bool;
```
## MatchCase::key\_eq

```rust
pub fn key_eq(self: MatchCase, object: <any>) -> bool;
```
## MatchCase::to\_set

```rust
pub fn to_set(self: MatchCase) -> *MatchCase;
```
