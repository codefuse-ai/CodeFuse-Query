# TypeParameterDO

Primary key: `element_hash_id: int`

```rust
schema TypeParameterDO {
  parent_hash_id: int,
  extends_list_hash_id: int,
  index_order: int,
  printable_text: string,
  owner_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## TypeParameterDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getOwnerHashId

```java
/**
* @brief gets the owner hash id of this element.
* @return int
*/
```
```rust
pub fn getOwnerHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getExtendsListHashId

```java
/**
* @brief gets the extends list hash id of this element.
* @return int
*/
```
```rust
pub fn getExtendsListHashId(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TypeParameterDO) -> int;
```
## TypeParameterDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TypeParameterDO) -> string;
```
## TypeParameterDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeParameterDO;
```
