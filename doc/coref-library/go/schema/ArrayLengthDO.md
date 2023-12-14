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

```rust
/**
     * @brief gets the len of this element.
     * @return int
     */
```
```rust
pub fn getLen(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: ArrayLengthDO) -> int;
```
## ArrayLengthDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ArrayLengthDO;
```
## ArrayLengthDO::is\<T\>

```rust
pub fn is<T>(self: ArrayLengthDO) -> bool;
```
## ArrayLengthDO::to\<T\>

```rust
pub fn to<T>(self: ArrayLengthDO) -> <any>;
```
## ArrayLengthDO::key\_neq

```rust
pub fn key_neq(self: ArrayLengthDO, object: <any>) -> bool;
```
## ArrayLengthDO::key\_eq

```rust
pub fn key_eq(self: ArrayLengthDO, object: <any>) -> bool;
```
## ArrayLengthDO::to\_set

```rust
pub fn to_set(self: ArrayLengthDO) -> *ArrayLengthDO;
```
