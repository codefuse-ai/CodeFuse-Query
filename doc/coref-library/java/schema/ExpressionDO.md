# ExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ExpressionDO {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ExpressionDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ExpressionDO) -> string;
```
## ExpressionDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ExpressionDO) -> int;
```
## ExpressionDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ExpressionDO) -> int;
```
## ExpressionDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ExpressionDO) -> int;
```
## ExpressionDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ExpressionDO) -> string;
```
## ExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionDO;
```
## ExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionDO) -> bool;
```
## ExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionDO) -> <any>;
```
## ExpressionDO::key\_neq

```rust
pub fn key_neq(self: ExpressionDO, object: <any>) -> bool;
```
## ExpressionDO::key\_eq

```rust
pub fn key_eq(self: ExpressionDO, object: <any>) -> bool;
```
## ExpressionDO::to\_set

```rust
pub fn to_set(self: ExpressionDO) -> *ExpressionDO;
```
