# EnumConstantDO

Primary key: `element_hash_id: int`

```rust
schema EnumConstantDO {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## EnumConstantDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: EnumConstantDO) -> string;
```
## EnumConstantDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: EnumConstantDO) -> int;
```
## EnumConstantDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: EnumConstantDO) -> int;
```
## EnumConstantDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: EnumConstantDO) -> string;
```
## EnumConstantDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *EnumConstantDO;
```
