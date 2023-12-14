# LocalVariableDO

Primary key: `element_hash_id: int`

```rust
schema LocalVariableDO {
  index_order: int,
  printable_text: string,
  parent_hash_id: int,
  name: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## LocalVariableDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LocalVariableDO) -> int;
```
## LocalVariableDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LocalVariableDO) -> string;
```
## LocalVariableDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LocalVariableDO) -> int;
```
## LocalVariableDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: LocalVariableDO) -> string;
```
## LocalVariableDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LocalVariableDO) -> int;
```
## LocalVariableDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LocalVariableDO;
```
