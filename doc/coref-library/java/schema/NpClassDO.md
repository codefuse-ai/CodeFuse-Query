# NpClassDO

Primary key: `element_hash_id: int`

```rust
schema NpClassDO {
  parent_hash_id: int,
  qualified_name: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpClassDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpClassDO) -> string;
```
## NpClassDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpClassDO) -> int;
```
## NpClassDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpClassDO) -> string;
```
## NpClassDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpClassDO;
```
## NpClassDO::is\<T\>

```rust
pub fn is<T>(self: NpClassDO) -> bool;
```
## NpClassDO::to\<T\>

```rust
pub fn to<T>(self: NpClassDO) -> <any>;
```
## NpClassDO::key\_neq

```rust
pub fn key_neq(self: NpClassDO, object: <any>) -> bool;
```
## NpClassDO::key\_eq

```rust
pub fn key_eq(self: NpClassDO, object: <any>) -> bool;
```
## NpClassDO::to\_set

```rust
pub fn to_set(self: NpClassDO) -> *NpClassDO;
```
