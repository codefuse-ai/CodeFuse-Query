# ElementTypeDO

Primary key: `oid: int`

```rust
schema ElementTypeDO {
  tp: int,
  container: int,
  @primary oid: int
}
```
## ElementTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: ElementTypeDO) -> int;
```
## ElementTypeDO::getContainer

```java
/**
* @brief gets the container of this element.
* @return int
*/
```
```rust
pub fn getContainer(self: ElementTypeDO) -> int;
```
## ElementTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ElementTypeDO;
```
