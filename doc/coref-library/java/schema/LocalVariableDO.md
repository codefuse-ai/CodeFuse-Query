# LocalVariableDO

Primary key: `element_hash_id: int`

```rust
schema LocalVariableDO {
  index_order: int,
  printable_text: string,
  parent_hash_id: int,
  name: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## LocalVariableDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LocalVariableDO) -> int;
```
## LocalVariableDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LocalVariableDO) -> string;
```
## LocalVariableDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LocalVariableDO) -> int;
```
## LocalVariableDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: LocalVariableDO) -> string;
```
## LocalVariableDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LocalVariableDO) -> int;
```
## LocalVariableDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LocalVariableDO;
```
## LocalVariableDO::is\<T\>

```rust
pub fn is<T>(self: LocalVariableDO) -> bool;
```
## LocalVariableDO::to\<T\>

```rust
pub fn to<T>(self: LocalVariableDO) -> <any>;
```
## LocalVariableDO::key\_neq

```rust
pub fn key_neq(self: LocalVariableDO, object: <any>) -> bool;
```
## LocalVariableDO::key\_eq

```rust
pub fn key_eq(self: LocalVariableDO, object: <any>) -> bool;
```
## LocalVariableDO::to\_set

```rust
pub fn to_set(self: LocalVariableDO) -> *LocalVariableDO;
```
