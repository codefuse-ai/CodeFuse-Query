# NpProject

Inherit from [NpProjectDO](./NpProjectDO.md)

Primary key: `element_hash_id: int`

```rust
schema NpProject extends NpProjectDO {
  @primary element_hash_id: int,
  name: string,
  extension: string
}
```
## NpProject::getExtension

```java
/**
* @brief gets the extension of this element.
* @return string
*/
```
```rust
pub fn getExtension(self: NpProject) -> string;
```
## NpProject::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpProject) -> string;
```
## NpProject::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpProject;
```
