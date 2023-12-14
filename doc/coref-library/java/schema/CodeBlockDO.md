# CodeBlockDO

Primary key: `element_hash_id: int`

```rust
schema CodeBlockDO {
  printable_text: string,
  is_empty: int,
  parent_hash_id: int,
  number_of_statement: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## CodeBlockDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CodeBlockDO) -> int;
```
## CodeBlockDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CodeBlockDO) -> string;
```
## CodeBlockDO::getNumberOfStatement

```rust
/**
     * @brief gets the number of statement of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfStatement(self: CodeBlockDO) -> int;
```
## CodeBlockDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CodeBlockDO;
```
## CodeBlockDO::getIsEmpty

```rust
/**
     * @brief gets the is empty of this element.
     * @return int
     */
```
```rust
pub fn getIsEmpty(self: CodeBlockDO) -> int;
```
## CodeBlockDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: CodeBlockDO) -> int;
```
## CodeBlockDO::is\<T\>

```rust
pub fn is<T>(self: CodeBlockDO) -> bool;
```
## CodeBlockDO::to\<T\>

```rust
pub fn to<T>(self: CodeBlockDO) -> <any>;
```
## CodeBlockDO::key\_neq

```rust
pub fn key_neq(self: CodeBlockDO, object: <any>) -> bool;
```
## CodeBlockDO::key\_eq

```rust
pub fn key_eq(self: CodeBlockDO, object: <any>) -> bool;
```
## CodeBlockDO::to\_set

```rust
pub fn to_set(self: CodeBlockDO) -> *CodeBlockDO;
```
