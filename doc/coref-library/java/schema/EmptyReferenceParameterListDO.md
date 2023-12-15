# EmptyReferenceParameterListDO

Primary key: `list_hash_id: int`

```rust
schema EmptyReferenceParameterListDO {
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
  @primary list_hash_id: int
}
```
## EmptyReferenceParameterListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: EmptyReferenceParameterListDO) -> int;
```
## EmptyReferenceParameterListDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: EmptyReferenceParameterListDO) -> string;
```
## EmptyReferenceParameterListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: EmptyReferenceParameterListDO) -> int;
```
## EmptyReferenceParameterListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *EmptyReferenceParameterListDO;
```
