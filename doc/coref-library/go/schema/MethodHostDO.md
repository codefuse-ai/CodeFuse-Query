# MethodHostDO

Primary key: `oid: int`

```rust
schema MethodHostDO {
  method: int,
  host: int,
  @primary oid: int
}
```
## MethodHostDO::getHost

```java
/**
* @brief gets the host of this element.
* @return int
*/
```
```rust
pub fn getHost(self: MethodHostDO) -> int;
```
## MethodHostDO::getMethod

```java
/**
* @brief gets the method of this element.
* @return int
*/
```
```rust
pub fn getMethod(self: MethodHostDO) -> int;
```
## MethodHostDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *MethodHostDO;
```
