# ReferenceTypeDO

Primary key: `oid: int`

```rust
schema ReferenceTypeDO {
  qualified_name: string,
  name: string,
  @primary oid: int,
}
```
## ReferenceTypeDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: ReferenceTypeDO) -> string;
```
## ReferenceTypeDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ReferenceTypeDO) -> string;
```
## ReferenceTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceTypeDO;
```
## ReferenceTypeDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceTypeDO) -> bool;
```
## ReferenceTypeDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceTypeDO) -> <any>;
```
## ReferenceTypeDO::key\_neq

```rust
pub fn key_neq(self: ReferenceTypeDO, object: <any>) -> bool;
```
## ReferenceTypeDO::key\_eq

```rust
pub fn key_eq(self: ReferenceTypeDO, object: <any>) -> bool;
```
## ReferenceTypeDO::to\_set

```rust
pub fn to_set(self: ReferenceTypeDO) -> *ReferenceTypeDO;
```
