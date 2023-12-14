# CatchSectionDO

Primary key: `element_hash_id: int`

```rust
schema CatchSectionDO {
  index_order: int,
  try_statement_hash_id: int,
  type_hash_id: int,
  parameter_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## CatchSectionDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getTryStatementHashId

```java
/**
* @brief gets the try statement hash id of this element.
* @return int
*/
```
```rust
pub fn getTryStatementHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: CatchSectionDO) -> string;
```
## CatchSectionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CatchSectionDO;
```
## CatchSectionDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getParameterHashId

```java
/**
* @brief gets the parameter hash id of this element.
* @return int
*/
```
```rust
pub fn getParameterHashId(self: CatchSectionDO) -> int;
```
