# ReferenceType

Primary key: `oid: int`

```rust
schema ReferenceType {
  @primary oid: int,
  name: string,
  qualified_name: string,
}
```
## ReferenceType::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: ReferenceType) -> string;
```
## ReferenceType::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ReferenceType) -> string;
```
## ReferenceType::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceType;
```
## ReferenceType::is\<T\>

```rust
pub fn is<T>(self: ReferenceType) -> bool;
```
## ReferenceType::to\<T\>

```rust
pub fn to<T>(self: ReferenceType) -> <any>;
```
## ReferenceType::key\_neq

```rust
pub fn key_neq(self: ReferenceType, object: <any>) -> bool;
```
## ReferenceType::key\_eq

```rust
pub fn key_eq(self: ReferenceType, object: <any>) -> bool;
```
## ReferenceType::to\_set

```rust
pub fn to_set(self: ReferenceType) -> *ReferenceType;
```
