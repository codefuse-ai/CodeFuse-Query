# StatementDO

Primary key: `element_oid: int`

```rust
schema StatementDO {
  printable_text: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## StatementDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: StatementDO) -> int;
```
## StatementDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: StatementDO) -> string;
```
## StatementDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: StatementDO) -> int;
```
## StatementDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: StatementDO) -> int;
```
## StatementDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: StatementDO) -> string;
```
## StatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *StatementDO;
```
## StatementDO::is\<T\>

```rust
pub fn is<T>(self: StatementDO) -> bool;
```
## StatementDO::to\<T\>

```rust
pub fn to<T>(self: StatementDO) -> <any>;
```
## StatementDO::key\_neq

```rust
pub fn key_neq(self: StatementDO, object: <any>) -> bool;
```
## StatementDO::key\_eq

```rust
pub fn key_eq(self: StatementDO, object: <any>) -> bool;
```
## StatementDO::to\_set

```rust
pub fn to_set(self: StatementDO) -> *StatementDO;
```
