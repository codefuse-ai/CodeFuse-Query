# ModDO

Primary key: `element_oid: int`

```rust
schema ModDO {
  location_oid: int,
  type: string,
  @primary element_oid: int
}
```
## ModDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ModDO) -> int;
```
## ModDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ModDO) -> string;
```
## ModDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ModDO;
```
