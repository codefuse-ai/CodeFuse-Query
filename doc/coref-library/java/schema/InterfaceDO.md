# InterfaceDO

Primary key: `element_hash_id: int`

```rust
schema InterfaceDO {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## InterfaceDO::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: InterfaceDO) -> string;
```
## InterfaceDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: InterfaceDO) -> int;
```
## InterfaceDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *InterfaceDO;
```
## InterfaceDO::is\<T\>

```rust
pub fn is<T>(self: InterfaceDO) -> bool;
```
## InterfaceDO::to\<T\>

```rust
pub fn to<T>(self: InterfaceDO) -> <any>;
```
## InterfaceDO::key\_neq

```rust
pub fn key_neq(self: InterfaceDO, object: <any>) -> bool;
```
## InterfaceDO::key\_eq

```rust
pub fn key_eq(self: InterfaceDO, object: <any>) -> bool;
```
## InterfaceDO::to\_set

```rust
pub fn to_set(self: InterfaceDO) -> *InterfaceDO;
```
