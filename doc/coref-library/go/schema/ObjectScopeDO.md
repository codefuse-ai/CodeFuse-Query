# ObjectScopeDO

Primary key: `oid: int`

```rust
schema ObjectScopeDO {
  scope: int,
  object: int,
  @primary oid: int,
}
```
## ObjectScopeDO::getScope

```java
/**
* @brief gets the scope of this element.
* @return int
*/
```
```rust
pub fn getScope(self: ObjectScopeDO) -> int;
```
## ObjectScopeDO::getObject

```java
/**
* @brief gets the object of this element.
* @return int
*/
```
```rust
pub fn getObject(self: ObjectScopeDO) -> int;
```
## ObjectScopeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ObjectScopeDO;
```
