# ReferenceType

Inherit from [ReferenceTypeDO](./ReferenceTypeDO.md)

Primary key: `oid: int`

```rust
schema ReferenceType extends ReferenceTypeDO {
  @primary oid: int,
  name: string,
  qualified_name: string
}
```
## ReferenceType::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: ReferenceType) -> string;
```
## ReferenceType::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ReferenceType) -> string;
```
## ReferenceType::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceType;
```
