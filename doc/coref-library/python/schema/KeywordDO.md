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

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: KeywordDO) -> int;
```
## KeywordDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: KeywordDO) -> string;
```
## KeywordDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: KeywordDO) -> int;
```
## KeywordDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: KeywordDO) -> int;
```
## KeywordDO::getArgValue

```rust
/**
     * @brief gets the arg value of this element.
     * @return string
     */
```
```rust
pub fn getArgValue(self: KeywordDO) -> string;
```
## KeywordDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: KeywordDO) -> int;
```
## KeywordDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *KeywordDO;
```
## KeywordDO::is\<T\>

```rust
pub fn is<T>(self: KeywordDO) -> bool;
```
## KeywordDO::to\<T\>

```rust
pub fn to<T>(self: KeywordDO) -> <any>;
```
## KeywordDO::key\_neq

```rust
pub fn key_neq(self: KeywordDO, object: <any>) -> bool;
```
## KeywordDO::key\_eq

```rust
pub fn key_eq(self: KeywordDO, object: <any>) -> bool;
```
## KeywordDO::to\_set

```rust
pub fn to_set(self: KeywordDO) -> *KeywordDO;
```
