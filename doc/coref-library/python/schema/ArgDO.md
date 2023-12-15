# ArgDO

Primary key: `element_oid: int`

```rust
schema ArgDO {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  annotation: int,
  @primary element_oid: int
}
```
## ArgDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ArgDO) -> int;
```
## ArgDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ArgDO) -> string;
```
## ArgDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ArgDO) -> int;
```
## ArgDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ArgDO) -> int;
```
## ArgDO::getAnnotationOid

```java
/**
* @brief gets the annotation of this element.
* @return int
*/
```
```rust
pub fn getAnnotationOid(self: ArgDO) -> int;
```
## ArgDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ArgDO;
```
