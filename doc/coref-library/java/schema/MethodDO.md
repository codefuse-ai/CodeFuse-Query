# MethodDO

Primary key: `element_hash_id: int`

```rust
schema MethodDO {
  definition_body: string,
  parent_hash_id: int,
  type_hash_id: int,
  signature: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodDO::getDefinitionBody

```rust
pub fn getDefinitionBody(self: MethodDO) -> string;
```
## MethodDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: MethodDO) -> int;
```
## MethodDO::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: MethodDO) -> string;
```
## MethodDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: MethodDO) -> int;
```
## MethodDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodDO;
```
## MethodDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: MethodDO) -> int;
```
## MethodDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: MethodDO) -> string;
```
## MethodDO::is\<T\>

```rust
pub fn is<T>(self: MethodDO) -> bool;
```
## MethodDO::to\<T\>

```rust
pub fn to<T>(self: MethodDO) -> <any>;
```
## MethodDO::key\_neq

```rust
pub fn key_neq(self: MethodDO, object: <any>) -> bool;
```
## MethodDO::key\_eq

```rust
pub fn key_eq(self: MethodDO, object: <any>) -> bool;
```
## MethodDO::to\_set

```rust
pub fn to_set(self: MethodDO) -> *MethodDO;
```
