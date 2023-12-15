# ExceptHandlerDO

Primary key: `element_oid: int`

```rust
schema ExceptHandlerDO {
  printable_text: string,
  location_oid: int,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int
}
```
## ExceptHandlerDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ExceptHandlerDO) -> string;
```
## ExceptHandlerDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ExceptHandlerDO) -> int;
```
## ExceptHandlerDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ExceptHandlerDO;
```
