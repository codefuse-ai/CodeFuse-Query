# ConstructorDO

Primary key: `element_hash_id: int`

```rust
schema ConstructorDO {
  definition_body: string,
  parent_hash_id: int,
  signature: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ConstructorDO::getDefinitionBody

```rust
pub fn getDefinitionBody(self: ConstructorDO) -> string;
```
## ConstructorDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ConstructorDO) -> int;
```
## ConstructorDO::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: ConstructorDO) -> string;
```
## ConstructorDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ConstructorDO) -> int;
```
## ConstructorDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ConstructorDO) -> string;
```
## ConstructorDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConstructorDO;
```
## ConstructorDO::is\<T\>

```rust
pub fn is<T>(self: ConstructorDO) -> bool;
```
## ConstructorDO::to\<T\>

```rust
pub fn to<T>(self: ConstructorDO) -> <any>;
```
## ConstructorDO::key\_neq

```rust
pub fn key_neq(self: ConstructorDO, object: <any>) -> bool;
```
## ConstructorDO::key\_eq

```rust
pub fn key_eq(self: ConstructorDO, object: <any>) -> bool;
```
## ConstructorDO::to\_set

```rust
pub fn to_set(self: ConstructorDO) -> *ConstructorDO;
```
