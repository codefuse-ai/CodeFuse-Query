# ExpressionListDO

Primary key: `element_hash_id: int`

```rust
schema ExpressionListDO {
  printable_text: string,
  size: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ExpressionListDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ExpressionListDO) -> string;
```
## ExpressionListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ExpressionListDO) -> int;
```
## ExpressionListDO::getSize

```rust
pub fn getSize(self: ExpressionListDO) -> int;
```
## ExpressionListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ExpressionListDO) -> int;
```
## ExpressionListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListDO;
```
