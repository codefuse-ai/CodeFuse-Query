# StatementDO

Primary key: `element_hash_id: int`

```rust
schema StatementDO {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## StatementDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: StatementDO) -> string;
```
## StatementDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: StatementDO) -> string;
```
## StatementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: StatementDO) -> int;
```
## StatementDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: StatementDO) -> int;
```
## StatementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: StatementDO) -> int;
```
## StatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StatementDO;
```
## StatementDO::is\<T\>

```rust
pub fn is<T>(self: StatementDO) -> bool;
```
## StatementDO::to\<T\>

```rust
pub fn to<T>(self: StatementDO) -> <any>;
```
## StatementDO::key\_neq

```rust
pub fn key_neq(self: StatementDO, object: <any>) -> bool;
```
## StatementDO::key\_eq

```rust
pub fn key_eq(self: StatementDO, object: <any>) -> bool;
```
## StatementDO::to\_set

```rust
pub fn to_set(self: StatementDO) -> *StatementDO;
```
