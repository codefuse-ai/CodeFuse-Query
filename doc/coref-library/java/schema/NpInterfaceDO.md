# NpInterfaceDO

Primary key: `element_hash_id: int`

```rust
schema NpInterfaceDO {
  parent_hash_id: int,
  qualified_name: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpInterfaceDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpInterfaceDO) -> string;
```
## NpInterfaceDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpInterfaceDO) -> int;
```
## NpInterfaceDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpInterfaceDO) -> string;
```
## NpInterfaceDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpInterfaceDO;
```
## NpInterfaceDO::is\<T\>

```rust
pub fn is<T>(self: NpInterfaceDO) -> bool;
```
## NpInterfaceDO::to\<T\>

```rust
pub fn to<T>(self: NpInterfaceDO) -> <any>;
```
## NpInterfaceDO::key\_neq

```rust
pub fn key_neq(self: NpInterfaceDO, object: <any>) -> bool;
```
## NpInterfaceDO::key\_eq

```rust
pub fn key_eq(self: NpInterfaceDO, object: <any>) -> bool;
```
## NpInterfaceDO::to\_set

```rust
pub fn to_set(self: NpInterfaceDO) -> *NpInterfaceDO;
```
