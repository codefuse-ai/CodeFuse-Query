# ObjectTypeDO

Primary key: `object: int`

```rust
schema ObjectTypeDO {
  tp: int,
  @primary object: int
}
```
## ObjectTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: ObjectTypeDO) -> int;
```
## ObjectTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ObjectTypeDO;
```
