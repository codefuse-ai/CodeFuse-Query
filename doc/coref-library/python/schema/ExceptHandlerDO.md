# ExceptHandlerDO

Primary key: `element_oid: int`

```rust
schema ExceptHandlerDO {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ExceptHandlerDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ExceptHandlerDO) -> string;
```
## ExceptHandlerDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ExceptHandlerDO;
```
## ExceptHandlerDO::is\<T\>

```rust
pub fn is<T>(self: ExceptHandlerDO) -> bool;
```
## ExceptHandlerDO::to\<T\>

```rust
pub fn to<T>(self: ExceptHandlerDO) -> <any>;
```
## ExceptHandlerDO::key\_neq

```rust
pub fn key_neq(self: ExceptHandlerDO, object: <any>) -> bool;
```
## ExceptHandlerDO::key\_eq

```rust
pub fn key_eq(self: ExceptHandlerDO, object: <any>) -> bool;
```
## ExceptHandlerDO::to\_set

```rust
pub fn to_set(self: ExceptHandlerDO) -> *ExceptHandlerDO;
```
