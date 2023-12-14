# ArrayLengthDO

Primary key: `oid: int`

```rust
schema ArrayLengthDO {
  len: int,
  file_id: int,
  tp: int,
  @primary oid: int,
}
```
## ArrayLengthDO::getLen

```java
/**
* @brief gets the len of this element.
* @return int
*/
```
```rust
pub fn getLen(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ArrayLengthDO;
```
