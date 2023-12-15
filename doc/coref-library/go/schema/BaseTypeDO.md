# BaseTypeDO

Primary key: `oid: int`

```rust
schema BaseTypeDO {
  tp: int,
  ptr: int,
  @primary oid: int
}
```
## BaseTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: BaseTypeDO) -> int;
```
## BaseTypeDO::getPtr

```java
/**
* @brief gets the ptr of this element.
* @return int
*/
```
```rust
pub fn getPtr(self: BaseTypeDO) -> int;
```
## BaseTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *BaseTypeDO;
```
