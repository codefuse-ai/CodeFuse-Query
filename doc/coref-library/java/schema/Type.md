# Type

Primary key: `id: int`

```rust
schema Type {
  @primary id: int,
}
```
## Type::getQualifiedName

```rust
/**
     * @brief gets the name of the type.
     * @return string 
     */
```
```rust
pub fn getQualifiedName(self: Type) -> string;
```
## Type::getName

```rust
/**
     * @brief gets the name of the type.
     * @return string 
     */
```
```rust
pub fn getName(self: Type) -> string;
```
## Type::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Type;
```
## Type::is\<T\>

```rust
pub fn is<T>(self: Type) -> bool;
```
## Type::to\<T\>

```rust
pub fn to<T>(self: Type) -> <any>;
```
## Type::key\_neq

```rust
pub fn key_neq(self: Type, object: <any>) -> bool;
```
## Type::key\_eq

```rust
pub fn key_eq(self: Type, object: <any>) -> bool;
```
## Type::to\_set

```rust
pub fn to_set(self: Type) -> *Type;
```
