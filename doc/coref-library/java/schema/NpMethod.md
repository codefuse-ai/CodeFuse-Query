# NpMethod

Primary key: `element_hash_id: int`

```rust
schema NpMethod {
  @primary element_hash_id: int,
  name: string,
  signature: string,
  type_hash_id: int,
  parent_hash_id: int,
}
```
## NpMethod::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpMethod) -> string;
```
## NpMethod::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: NpMethod) -> string;
```
## NpMethod::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return ElementParent
     */
```
```rust
pub fn getParent(self: NpMethod) -> ElementParent;
```
## NpMethod::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NpMethod) -> int;
```
## NpMethod::getType

```rust
/**
     * @brief gets the type for this element.
     * @return Type
     */
```
```rust
pub fn getType(self: NpMethod) -> ReferenceType;
```
## NpMethod::getTypeHashId

```rust
/**
     * @brief gets the return type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: NpMethod) -> int;
```
## NpMethod::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpMethod;
```
## NpMethod::is\<T\>

```rust
pub fn is<T>(self: NpMethod) -> bool;
```
## NpMethod::to\<T\>

```rust
pub fn to<T>(self: NpMethod) -> <any>;
```
## NpMethod::key\_neq

```rust
pub fn key_neq(self: NpMethod, object: <any>) -> bool;
```
## NpMethod::key\_eq

```rust
pub fn key_eq(self: NpMethod, object: <any>) -> bool;
```
## NpMethod::to\_set

```rust
pub fn to_set(self: NpMethod) -> *NpMethod;
```
