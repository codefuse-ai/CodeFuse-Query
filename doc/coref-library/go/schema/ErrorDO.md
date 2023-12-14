# ErrorDO

Primary key: `oid: int`

```rust
schema ErrorDO {
  idx: int,
  pkg: int,
  col: int,
  file: string,
  raw_pos: string,
  kind: int,
  line: int,
  msg: string,
  @primary oid: int,
}
```
## ErrorDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: ErrorDO) -> int;
```
## ErrorDO::getPkg

```rust
/**
     * @brief gets the pkg of this element.
     * @return int
     */
```
```rust
pub fn getPkg(self: ErrorDO) -> int;
```
## ErrorDO::getCol

```rust
/**
     * @brief gets the col of this element.
     * @return int
     */
```
```rust
pub fn getCol(self: ErrorDO) -> int;
```
## ErrorDO::getFile

```rust
/**
     * @brief gets the file of this element.
     * @return string
     */
```
```rust
pub fn getFile(self: ErrorDO) -> string;
```
## ErrorDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ErrorDO;
```
## ErrorDO::getRawPos

```rust
/**
     * @brief gets the raw pos of this element.
     * @return string
     */
```
```rust
pub fn getRawPos(self: ErrorDO) -> string;
```
## ErrorDO::getLine

```rust
/**
     * @brief gets the line of this element.
     * @return int
     */
```
```rust
pub fn getLine(self: ErrorDO) -> int;
```
## ErrorDO::getMsg

```rust
/**
     * @brief gets the msg of this element.
     * @return string
     */
```
```rust
pub fn getMsg(self: ErrorDO) -> string;
```
## ErrorDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: ErrorDO) -> int;
```
## ErrorDO::is\<T\>

```rust
pub fn is<T>(self: ErrorDO) -> bool;
```
## ErrorDO::to\<T\>

```rust
pub fn to<T>(self: ErrorDO) -> <any>;
```
## ErrorDO::key\_neq

```rust
pub fn key_neq(self: ErrorDO, object: <any>) -> bool;
```
## ErrorDO::key\_eq

```rust
pub fn key_eq(self: ErrorDO, object: <any>) -> bool;
```
## ErrorDO::to\_set

```rust
pub fn to_set(self: ErrorDO) -> *ErrorDO;
```
