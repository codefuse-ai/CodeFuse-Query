# Array

Primary key: `element_hash_id: int`

```rust
schema Array {
  @primary element_hash_id: int,
  name: string,
}
```
## Array::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Array) -> string;
```
## Array::getTypeElement

```rust
/**
     * @brief gets the type for the element.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: Array) -> TypeElement;
```
## Array::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Array;
```
## Array::is\<T\>

```rust
pub fn is<T>(self: Array) -> bool;
```
## Array::to\<T\>

```rust
pub fn to<T>(self: Array) -> <any>;
```
## Array::key\_neq

```rust
pub fn key_neq(self: Array, object: <any>) -> bool;
```
## Array::key\_eq

```rust
pub fn key_eq(self: Array, object: <any>) -> bool;
```
## Array::to\_set

```rust
pub fn to_set(self: Array) -> *Array;
```
