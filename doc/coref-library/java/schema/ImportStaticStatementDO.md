# ImportStaticStatementDO

Primary key: `element_hash_id: int`

```rust
schema ImportStaticStatementDO {
  parent_hash_id: int,
  reference_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ImportStaticStatementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::getPrintableText

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ImportStaticStatementDO) -> string;
```
## ImportStaticStatementDO::getReferenceHashId

```rust
/**
     * @brief gets the reference hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ImportStaticStatementDO) -> int;
```
## ImportStaticStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticStatementDO;
```
## ImportStaticStatementDO::is\<T\>

```rust
pub fn is<T>(self: ImportStaticStatementDO) -> bool;
```
## ImportStaticStatementDO::to\<T\>

```rust
pub fn to<T>(self: ImportStaticStatementDO) -> <any>;
```
## ImportStaticStatementDO::key\_neq

```rust
pub fn key_neq(self: ImportStaticStatementDO, object: <any>) -> bool;
```
## ImportStaticStatementDO::key\_eq

```rust
pub fn key_eq(self: ImportStaticStatementDO, object: <any>) -> bool;
```
## ImportStaticStatementDO::to\_set

```rust
pub fn to_set(self: ImportStaticStatementDO) -> *ImportStaticStatementDO;
```
