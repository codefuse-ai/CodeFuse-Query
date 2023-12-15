# CmpopDO

Primary key: `element_oid: int`

```rust
schema CmpopDO {
  location_oid: int,
  parent_oid: int,
  value: int,
  @primary element_oid: int
}
```
## CmpopDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: CmpopDO) -> int;
```
## CmpopDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: CmpopDO) -> int;
```
## CmpopDO::getValue

```java
/**
* @brief gets the value of this element.
* @return int
*/
```
```rust
pub fn getValue(self: CmpopDO) -> int;
```
## CmpopDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CmpopDO;
```
