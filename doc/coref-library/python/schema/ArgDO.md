# ArgDO

Primary key: `element_oid: int`

```rust
schema ArgDO {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  annotation: int,
  @primary element_oid: int,
}
```
## ArgDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ArgDO) -> int;
```
## ArgDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ArgDO) -> string;
```
## ArgDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ArgDO) -> int;
```
## ArgDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ArgDO) -> int;
```
## ArgDO::getAnnotationOid

```rust
/**
     * @brief gets the annotation of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationOid(self: ArgDO) -> int;
```
## ArgDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ArgDO;
```
## ArgDO::is\<T\>

```rust
pub fn is<T>(self: ArgDO) -> bool;
```
## ArgDO::to\<T\>

```rust
pub fn to<T>(self: ArgDO) -> <any>;
```
## ArgDO::key\_neq

```rust
pub fn key_neq(self: ArgDO, object: <any>) -> bool;
```
## ArgDO::key\_eq

```rust
pub fn key_eq(self: ArgDO, object: <any>) -> bool;
```
## ArgDO::to\_set

```rust
pub fn to_set(self: ArgDO) -> *ArgDO;
```
