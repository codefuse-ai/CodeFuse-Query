# SliceDO

Primary key: `element_oid: int`

```rust
schema SliceDO {
  has_step: int,
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int
}
```
## SliceDO::getHasStep

```java
/**
* @brief gets the has step of this element.
* @return int
*/
```
```rust
pub fn getHasStep(self: SliceDO) -> int;
```
## SliceDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: SliceDO) -> int;
```
## SliceDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: SliceDO) -> int;
```
## SliceDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: SliceDO) -> string;
```
## SliceDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: SliceDO) -> int;
```
## SliceDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *SliceDO;
```
