# ImportDO

Primary key: `element_hash_id: int`

```rust
schema ImportDO {
  is_foreign_import: int,
  parent_hash_id: int,
  reference_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## ImportDO::getIsForeignImport

```java
/**
* @brief gets the is foreign import of this element.
* @return int
*/
```
```rust
pub fn getIsForeignImport(self: ImportDO) -> int;
```
## ImportDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ImportDO) -> int;
```
## ImportDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ImportDO) -> string;
```
## ImportDO::getReferenceHashId

```java
/**
* @brief gets the reference hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceHashId(self: ImportDO) -> int;
```
## ImportDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ImportDO) -> int;
```
## ImportDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ImportDO;
```
