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

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getTryStatementHashId

```rust
/**
     * @brief gets the try statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getTryStatementHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CatchSectionDO) -> string;
```
## CatchSectionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CatchSectionDO;
```
## CatchSectionDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::getParameterHashId

```rust
/**
     * @brief gets the parameter hash id of this element.
     * @return int
     */
```
```rust
pub fn getParameterHashId(self: CatchSectionDO) -> int;
```
## CatchSectionDO::is\<T\>

```rust
pub fn is<T>(self: CatchSectionDO) -> bool;
```
## CatchSectionDO::to\<T\>

```rust
pub fn to<T>(self: CatchSectionDO) -> <any>;
```
## CatchSectionDO::key\_neq

```rust
pub fn key_neq(self: CatchSectionDO, object: <any>) -> bool;
```
## CatchSectionDO::key\_eq

```rust
pub fn key_eq(self: CatchSectionDO, object: <any>) -> bool;
```
## CatchSectionDO::to\_set

```rust
pub fn to_set(self: CatchSectionDO) -> *CatchSectionDO;
```
