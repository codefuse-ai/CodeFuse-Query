# KeyTypeDO

Primary key: `oid: int`

```rust
schema KeyTypeDO {
  tp: int,
  map: int,
  @primary oid: int,
}
```
## KeyTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: KeyTypeDO) -> int;
```
## KeyTypeDO::getMap

```java
/**
* @brief gets the map of this element.
* @return int
*/
```
```rust
pub fn getMap(self: KeyTypeDO) -> int;
```
## KeyTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *KeyTypeDO;
```
