# TokenDO

Primary key: `element_oid: int`

```rust
schema TokenDO {
  location_oid: int,
  parent_oid: int,
  value: string,
  @primary element_oid: int
}
```
## TokenDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: TokenDO) -> int;
```
## TokenDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: TokenDO) -> int;
```
## TokenDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: TokenDO) -> string;
```
## TokenDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *TokenDO;
```
