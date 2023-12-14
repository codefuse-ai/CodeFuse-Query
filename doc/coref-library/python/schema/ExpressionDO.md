# ExpressionDO

Primary key: `element_oid: int`

```rust
schema ExpressionDO {
  printable_text: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## ExpressionDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ExpressionDO) -> int;
```
## ExpressionDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ExpressionDO) -> string;
```
## ExpressionDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ExpressionDO) -> int;
```
## ExpressionDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ExpressionDO) -> int;
```
## ExpressionDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ExpressionDO) -> string;
```
## ExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ExpressionDO;
```
## ExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionDO) -> bool;
```
## ExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionDO) -> <any>;
```
## ExpressionDO::key\_neq

```rust
pub fn key_neq(self: ExpressionDO, object: <any>) -> bool;
```
## ExpressionDO::key\_eq

```rust
pub fn key_eq(self: ExpressionDO, object: <any>) -> bool;
```
## ExpressionDO::to\_set

```rust
pub fn to_set(self: ExpressionDO) -> *ExpressionDO;
```
