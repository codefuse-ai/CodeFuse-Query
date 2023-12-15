# TypeParamDeclsDO

Primary key: `oid: int`

```rust
schema TypeParamDeclsDO {
  index: int,
  parent: int,
  @primary oid: int
}
```
## TypeParamDeclsDO::getIndex

```java
/**
* @brief gets the index of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TypeParamDeclsDO) -> int;
```
## TypeParamDeclsDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: TypeParamDeclsDO) -> int;
```
## TypeParamDeclsDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeParamDeclsDO;
```
