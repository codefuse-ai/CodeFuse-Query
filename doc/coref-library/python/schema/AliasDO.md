# AliasDO

Primary key: `element_oid: int`

```rust
schema AliasDO {
  printable_text: string,
  location_oid: int,
  element_index: int,
  parent_oid: int,
  asname: string,
  name: string,
  @primary element_oid: int,
}
```
## AliasDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: AliasDO) -> int;
```
## AliasDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AliasDO) -> string;
```
## AliasDO::getAsname

```rust
/**
     * @brief gets the asname of this element.
     * @return string
     */
```
```rust
pub fn getAsname(self: AliasDO) -> string;
```
## AliasDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: AliasDO) -> int;
```
## AliasDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: AliasDO) -> int;
```
## AliasDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: AliasDO) -> string;
```
## AliasDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AliasDO;
```
## AliasDO::is\<T\>

```rust
pub fn is<T>(self: AliasDO) -> bool;
```
## AliasDO::to\<T\>

```rust
pub fn to<T>(self: AliasDO) -> <any>;
```
## AliasDO::key\_neq

```rust
pub fn key_neq(self: AliasDO, object: <any>) -> bool;
```
## AliasDO::key\_eq

```rust
pub fn key_eq(self: AliasDO, object: <any>) -> bool;
```
## AliasDO::to\_set

```rust
pub fn to_set(self: AliasDO) -> *AliasDO;
```
