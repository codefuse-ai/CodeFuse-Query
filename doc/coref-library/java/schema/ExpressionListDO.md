# ExpressionListDO

Primary key: `element_hash_id: int`

```rust
schema ExpressionListDO {
  printable_text: string,
  size: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ExpressionListDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ExpressionListDO) -> string;
```
## ExpressionListDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ExpressionListDO) -> int;
```
## ExpressionListDO::getSize

```rust
pub fn getSize(self: ExpressionListDO) -> int;
```
## ExpressionListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ExpressionListDO) -> int;
```
## ExpressionListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListDO;
```
## ExpressionListDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionListDO) -> bool;
```
## ExpressionListDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionListDO) -> <any>;
```
## ExpressionListDO::key\_neq

```rust
pub fn key_neq(self: ExpressionListDO, object: <any>) -> bool;
```
## ExpressionListDO::key\_eq

```rust
pub fn key_eq(self: ExpressionListDO, object: <any>) -> bool;
```
## ExpressionListDO::to\_set

```rust
pub fn to_set(self: ExpressionListDO) -> *ExpressionListDO;
```
