# ExpressionDO

Primary key: `element_oid: int`

```rust
schema ExpressionDO {
  printable_text: string,
  parent_oid: int,
  element_index: int,
  location_oid: int,
  type: string,
  @primary element_oid: int
}
```
## ExpressionDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ExpressionDO) -> int;
```
## ExpressionDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ExpressionDO) -> string;
```
## ExpressionDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ExpressionDO) -> int;
```
## ExpressionDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ExpressionDO) -> int;
```
## ExpressionDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ExpressionDO) -> string;
```
## ExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ExpressionDO;
```
