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
  @primary element_oid: int,
}
```
## MatchCaseDO::getIsDefault

```rust
/**
     * @brief gets the is default of this element.
     * @return int
     */
```
```rust
pub fn getIsDefault(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getPatternOid

```rust
/**
     * @brief gets the pattern oid of this element.
     * @return int
     */
```
```rust
pub fn getPatternOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: MatchCaseDO) -> string;
```
## MatchCaseDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: MatchCaseDO) -> int;
```
## MatchCaseDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: MatchCaseDO) -> int;
```
## MatchCaseDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MatchCaseDO;
```
## MatchCaseDO::is\<T\>

```rust
pub fn is<T>(self: MatchCaseDO) -> bool;
```
## MatchCaseDO::to\<T\>

```rust
pub fn to<T>(self: MatchCaseDO) -> <any>;
```
## MatchCaseDO::key\_neq

```rust
pub fn key_neq(self: MatchCaseDO, object: <any>) -> bool;
```
## MatchCaseDO::key\_eq

```rust
pub fn key_eq(self: MatchCaseDO, object: <any>) -> bool;
```
## MatchCaseDO::to\_set

```rust
pub fn to_set(self: MatchCaseDO) -> *MatchCaseDO;
```
