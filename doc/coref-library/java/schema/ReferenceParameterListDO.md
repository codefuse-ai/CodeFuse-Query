# ReferenceParameterListDO

Primary key: `list_hash_id: int`

```rust
schema ReferenceParameterListDO {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary list_hash_id: int,
  type_element_hash_id: int
}
```
## ReferenceParameterListDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ReferenceParameterListDO) -> string;
```
## ReferenceParameterListDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getListHashId

```java
/**
* @brief gets the list hash id of this element.
* @return int
*/
```
```rust
pub fn getListHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getTypeElementHashId

```java
/**
* @brief gets the type element of the list.
* @return int 
*/
```
```rust
pub fn getTypeElementHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ReferenceParameterListDO) -> int;
```
## ReferenceParameterListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceParameterListDO;
```
