# EnumConstantDO

Primary key: `element_hash_id: int`

```rust
schema EnumConstantDO {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## EnumConstantDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: EnumConstantDO) -> string;
```
## EnumConstantDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: EnumConstantDO) -> int;
```
## EnumConstantDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: EnumConstantDO) -> int;
```
## EnumConstantDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: EnumConstantDO) -> string;
```
## EnumConstantDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EnumConstantDO;
```
## EnumConstantDO::is\<T\>

```rust
pub fn is<T>(self: EnumConstantDO) -> bool;
```
## EnumConstantDO::to\<T\>

```rust
pub fn to<T>(self: EnumConstantDO) -> <any>;
```
## EnumConstantDO::key\_neq

```rust
pub fn key_neq(self: EnumConstantDO, object: <any>) -> bool;
```
## EnumConstantDO::key\_eq

```rust
pub fn key_eq(self: EnumConstantDO, object: <any>) -> bool;
```
## EnumConstantDO::to\_set

```rust
pub fn to_set(self: EnumConstantDO) -> *EnumConstantDO;
```
