# NpInterface

Primary key: `element_hash_id: int`

```rust
schema NpInterface {
  @primary element_hash_id: int,
  name: string,
  qualified_name: string,
  parent_hash_id: int,
}
```
## NpInterface::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpInterface) -> string;
```
## NpInterface::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return ElementParent
     */
```
```rust
pub fn getParent(self: NpInterface) -> ElementParent;
```
## NpInterface::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpInterface) -> string;
```
## NpInterface::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpInterface) -> int;
```
## NpInterface::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpInterface;
```
## NpInterface::is\<T\>

```rust
pub fn is<T>(self: NpInterface) -> bool;
```
## NpInterface::to\<T\>

```rust
pub fn to<T>(self: NpInterface) -> <any>;
```
## NpInterface::key\_neq

```rust
pub fn key_neq(self: NpInterface, object: <any>) -> bool;
```
## NpInterface::key\_eq

```rust
pub fn key_eq(self: NpInterface, object: <any>) -> bool;
```
## NpInterface::to\_set

```rust
pub fn to_set(self: NpInterface) -> *NpInterface;
```
