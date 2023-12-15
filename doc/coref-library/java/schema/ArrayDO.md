# ArrayDO

Primary key: `element_hash_id: int`

```rust
schema ArrayDO {
  name: string,
  @primary element_hash_id: int
}
```
## ArrayDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ArrayDO) -> string;
```
## ArrayDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayDO;
```
