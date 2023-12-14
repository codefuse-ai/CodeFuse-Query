# VariableDO

Primary key: `element_oid: int`

```rust
schema VariableDO {
  printable_text: string,
  location_oid: int,
  name: string,
  parent_oid: int,
  @primary element_oid: int,
}
```
## VariableDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: VariableDO) -> string;
```
## VariableDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: VariableDO) -> int;
```
## VariableDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: VariableDO) -> int;
```
## VariableDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: VariableDO) -> string;
```
## VariableDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *VariableDO;
```
## VariableDO::is\<T\>

```rust
pub fn is<T>(self: VariableDO) -> bool;
```
## VariableDO::to\<T\>

```rust
pub fn to<T>(self: VariableDO) -> <any>;
```
## VariableDO::key\_neq

```rust
pub fn key_neq(self: VariableDO, object: <any>) -> bool;
```
## VariableDO::key\_eq

```rust
pub fn key_eq(self: VariableDO, object: <any>) -> bool;
```
## VariableDO::to\_set

```rust
pub fn to_set(self: VariableDO) -> *VariableDO;
```
