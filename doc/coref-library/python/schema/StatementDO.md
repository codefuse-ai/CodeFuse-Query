# StatementDO

Primary key: `element_oid: int`

```rust
schema StatementDO {
  printable_text: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## StatementDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: StatementDO) -> int;
```
## StatementDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: StatementDO) -> string;
```
## StatementDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: StatementDO) -> int;
```
## StatementDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: StatementDO) -> int;
```
## StatementDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: StatementDO) -> string;
```
## StatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *StatementDO;
```
