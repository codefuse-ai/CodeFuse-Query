# OperatorDO

Primary key: `element_oid: int`

```rust
schema OperatorDO {
  parent_oid: int,
  printable_text: string,
  location_oid: int,
  @primary element_oid: int,
}
```
## OperatorDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: OperatorDO) -> string;
```
## OperatorDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: OperatorDO) -> int;
```
## OperatorDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: OperatorDO) -> int;
```
## OperatorDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *OperatorDO;
```
## OperatorDO::is\<T\>

```rust
pub fn is<T>(self: OperatorDO) -> bool;
```
## OperatorDO::to\<T\>

```rust
pub fn to<T>(self: OperatorDO) -> <any>;
```
## OperatorDO::key\_neq

```rust
pub fn key_neq(self: OperatorDO, object: <any>) -> bool;
```
## OperatorDO::key\_eq

```rust
pub fn key_eq(self: OperatorDO, object: <any>) -> bool;
```
## OperatorDO::to\_set

```rust
pub fn to_set(self: OperatorDO) -> *OperatorDO;
```
