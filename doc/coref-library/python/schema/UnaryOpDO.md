# UnaryOpDO

Primary key: `element_oid: int`

```rust
schema UnaryOpDO {
  parent_oid: int,
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## UnaryOpDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: UnaryOpDO) -> int;
```
## UnaryOpDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: UnaryOpDO) -> int;
```
## UnaryOpDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: UnaryOpDO) -> string;
```
## UnaryOpDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *UnaryOpDO;
```
