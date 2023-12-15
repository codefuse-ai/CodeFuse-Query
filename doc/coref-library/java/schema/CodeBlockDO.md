# CodeBlockDO

Primary key: `element_hash_id: int`

```rust
schema CodeBlockDO {
  printable_text: string,
  is_empty: int,
  parent_hash_id: int,
  number_of_statement: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## CodeBlockDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CodeBlockDO) -> int;
```
## CodeBlockDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: CodeBlockDO) -> string;
```
## CodeBlockDO::getNumberOfStatement

```java
/**
* @brief gets the number of statement of this element.
* @return int
*/
```
```rust
pub fn getNumberOfStatement(self: CodeBlockDO) -> int;
```
## CodeBlockDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CodeBlockDO;
```
## CodeBlockDO::getIsEmpty

```java
/**
* @brief gets the is empty of this element.
* @return int
*/
```
```rust
pub fn getIsEmpty(self: CodeBlockDO) -> int;
```
## CodeBlockDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: CodeBlockDO) -> int;
```
