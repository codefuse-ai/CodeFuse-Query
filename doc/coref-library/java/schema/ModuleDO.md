# ModuleDO

Primary key: `element_hash_id: int`

```rust
schema ModuleDO {
  name: string,
  @primary element_hash_id: int,
}
```
## ModuleDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ModuleDO) -> string;
```
## ModuleDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ModuleDO;
```
