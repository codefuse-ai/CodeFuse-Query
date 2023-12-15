# VariableDO

Primary key: `element_oid: int`

```rust
schema VariableDO {
  printable_text: string,
  location_oid: int,
  name: string,
  parent_oid: int,
  @primary element_oid: int
}
```
## VariableDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: VariableDO) -> string;
```
## VariableDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: VariableDO) -> int;
```
## VariableDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: VariableDO) -> int;
```
## VariableDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: VariableDO) -> string;
```
## VariableDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *VariableDO;
```
