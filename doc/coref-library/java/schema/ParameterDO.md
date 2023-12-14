# ParameterDO

Primary key: `element_hash_id: int`

```rust
schema ParameterDO {
  type_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
  index_order: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ParameterDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ParameterDO) -> string;
```
## ParameterDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ParameterDO) -> int;
```
## ParameterDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ParameterDO) -> int;
```
## ParameterDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ParameterDO) -> int;
```
## ParameterDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ParameterDO) -> string;
```
## ParameterDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: ParameterDO) -> int;
```
## ParameterDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ParameterDO;
```
## ParameterDO::is\<T\>

```rust
pub fn is<T>(self: ParameterDO) -> bool;
```
## ParameterDO::to\<T\>

```rust
pub fn to<T>(self: ParameterDO) -> <any>;
```
## ParameterDO::key\_neq

```rust
pub fn key_neq(self: ParameterDO, object: <any>) -> bool;
```
## ParameterDO::key\_eq

```rust
pub fn key_eq(self: ParameterDO, object: <any>) -> bool;
```
## ParameterDO::to\_set

```rust
pub fn to_set(self: ParameterDO) -> *ParameterDO;
```
