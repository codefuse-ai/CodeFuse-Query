# NameStringDO

Primary key: `parent_hash_id: int`

```rust
schema NameStringDO {
  name_element_hash_id: int,
  value_element_hash_id: int,
  @primary parent_hash_id: int
}
```
## NameStringDO::getValueElementHashId

```java
/**
* @brief gets the value element hash id of this element.
* @return int
*/
```
```rust
pub fn getValueElementHashId(self: NameStringDO) -> int;
```
## NameStringDO::getNameElementHashId

```java
/**
* @brief gets the name element hash id of this element.
* @return int
*/
```
```rust
pub fn getNameElementHashId(self: NameStringDO) -> int;
```
## NameStringDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NameStringDO;
```
