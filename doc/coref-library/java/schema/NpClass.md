# NpClass

Primary key: `element_hash_id: int`

```rust
schema NpClass {
  @primary element_hash_id: int,
  name: string,
  qualified_name: string,
  parent_hash_id: int,
}
```
## NpClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NpClass) -> string;
```
## NpClass::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return ElementParent
     */
```
```rust
pub fn getParent(self: NpClass) -> ElementParent;
```
## NpClass::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpClass) -> string;
```
## NpClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpClass) -> int;
```
## NpClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpClass;
```
## NpClass::is\<T\>

```rust
pub fn is<T>(self: NpClass) -> bool;
```
## NpClass::to\<T\>

```rust
pub fn to<T>(self: NpClass) -> <any>;
```
## NpClass::key\_neq

```rust
pub fn key_neq(self: NpClass, object: <any>) -> bool;
```
## NpClass::key\_eq

```rust
pub fn key_eq(self: NpClass, object: <any>) -> bool;
```
## NpClass::to\_set

```rust
pub fn to_set(self: NpClass) -> *NpClass;
```
