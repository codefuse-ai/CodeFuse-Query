# ClassDO

Primary key: `element_hash_id: int`

```rust
schema ClassDO {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## ClassDO::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: ClassDO) -> int;
```
## ClassDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ClassDO) -> int;
```
## ClassDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: ClassDO) -> string;
```
## ClassDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ClassDO) -> int;
```
## ClassDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassDO;
```
## ClassDO::is\<T\>

```rust
pub fn is<T>(self: ClassDO) -> bool;
```
## ClassDO::to\<T\>

```rust
pub fn to<T>(self: ClassDO) -> <any>;
```
## ClassDO::key\_neq

```rust
pub fn key_neq(self: ClassDO, object: <any>) -> bool;
```
## ClassDO::key\_eq

```rust
pub fn key_eq(self: ClassDO, object: <any>) -> bool;
```
## ClassDO::to\_set

```rust
pub fn to_set(self: ClassDO) -> *ClassDO;
```
