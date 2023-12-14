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

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: OperatorDO) -> string;
```
## OperatorDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: OperatorDO) -> int;
```
## OperatorDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: OperatorDO) -> int;
```
## OperatorDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *OperatorDO;
```
