# NpProjectDO

Primary key: `element_hash_id: int`

```rust
schema NpProjectDO {
  extension: string,
  name: string,
  @primary element_hash_id: int,
}
```
## NpProjectDO::getExtension

```java
/**
* @brief gets the extension of this element.
* @return string
*/
```
```rust
pub fn getExtension(self: NpProjectDO) -> string;
```
## NpProjectDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpProjectDO) -> string;
```
## NpProjectDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpProjectDO;
```
