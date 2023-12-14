# FieldDO

Primary key: `element_hash_id: int`

```rust
schema FieldDO {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## FieldDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: FieldDO) -> int;
```
## FieldDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: FieldDO) -> string;
```
## FieldDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: FieldDO) -> int;
```
## FieldDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: FieldDO) -> string;
```
## FieldDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *FieldDO;
```
## FieldDO::is\<T\>

```rust
pub fn is<T>(self: FieldDO) -> bool;
```
## FieldDO::to\<T\>

```rust
pub fn to<T>(self: FieldDO) -> <any>;
```
## FieldDO::key\_neq

```rust
pub fn key_neq(self: FieldDO, object: <any>) -> bool;
```
## FieldDO::key\_eq

```rust
pub fn key_eq(self: FieldDO, object: <any>) -> bool;
```
## FieldDO::to\_set

```rust
pub fn to_set(self: FieldDO) -> *FieldDO;
```
