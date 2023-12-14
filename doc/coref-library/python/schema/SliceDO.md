# SliceDO

Primary key: `element_oid: int`

```rust
schema SliceDO {
  has_step: int,
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## SliceDO::getHasStep

```rust
/**
     * @brief gets the has step of this element.
     * @return int
     */
```
```rust
pub fn getHasStep(self: SliceDO) -> int;
```
## SliceDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: SliceDO) -> int;
```
## SliceDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: SliceDO) -> int;
```
## SliceDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: SliceDO) -> string;
```
## SliceDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: SliceDO) -> int;
```
## SliceDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *SliceDO;
```
## SliceDO::is\<T\>

```rust
pub fn is<T>(self: SliceDO) -> bool;
```
## SliceDO::to\<T\>

```rust
pub fn to<T>(self: SliceDO) -> <any>;
```
## SliceDO::key\_neq

```rust
pub fn key_neq(self: SliceDO, object: <any>) -> bool;
```
## SliceDO::key\_eq

```rust
pub fn key_eq(self: SliceDO, object: <any>) -> bool;
```
## SliceDO::to\_set

```rust
pub fn to_set(self: SliceDO) -> *SliceDO;
```
