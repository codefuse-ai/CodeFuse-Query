# ReferenceTypeDO

Primary key: `oid: int`

```rust
schema ReferenceTypeDO {
  qualified_name: string,
  name: string,
  @primary oid: int
}
```
## ReferenceTypeDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: ReferenceTypeDO) -> string;
```
## ReferenceTypeDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ReferenceTypeDO) -> string;
```
## ReferenceTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceTypeDO;
```
