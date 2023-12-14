# ParameterDO

Primary key: `element_hash_id: int`

```rust
schema ParameterDO {
  type_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
  index_order: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ParameterDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ParameterDO) -> string;
```
## ParameterDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ParameterDO) -> int;
```
## ParameterDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ParameterDO) -> int;
```
## ParameterDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ParameterDO) -> int;
```
## ParameterDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ParameterDO) -> string;
```
## ParameterDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: ParameterDO) -> int;
```
## ParameterDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ParameterDO;
```
