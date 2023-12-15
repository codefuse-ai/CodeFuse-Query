# FieldDO

Primary key: `element_hash_id: int`

```rust
schema FieldDO {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## FieldDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: FieldDO) -> int;
```
## FieldDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: FieldDO) -> string;
```
## FieldDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: FieldDO) -> int;
```
## FieldDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FieldDO) -> string;
```
## FieldDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *FieldDO;
```
