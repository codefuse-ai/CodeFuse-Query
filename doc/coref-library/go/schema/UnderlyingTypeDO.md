# UnderlyingTypeDO

Primary key: `oid: int`

```rust
schema UnderlyingTypeDO {
  tp: int,
  named: int,
  @primary oid: int
}
```
## UnderlyingTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: UnderlyingTypeDO) -> int;
```
## UnderlyingTypeDO::getNamed

```java
/**
* @brief gets the named of this element.
* @return int
*/
```
```rust
pub fn getNamed(self: UnderlyingTypeDO) -> int;
```
## UnderlyingTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *UnderlyingTypeDO;
```
