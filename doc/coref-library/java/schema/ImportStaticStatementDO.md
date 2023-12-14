# ImportStaticStatementDO

Primary key: `element_hash_id: int`

```rust
schema ImportStaticStatementDO {
  parent_hash_id: int,
  reference_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ImportStaticStatementDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::getPrintableText

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ImportStaticStatementDO) -> string;
```
## ImportStaticStatementDO::getReferenceHashId

```java
/**
* @brief gets the reference hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticStatementDO;
```
