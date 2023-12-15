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
  @primary oid: int
}
```
## ErrorDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: ErrorDO) -> int;
```
## ErrorDO::getPkg

```java
/**
* @brief gets the pkg of this element.
* @return int
*/
```
```rust
pub fn getPkg(self: ErrorDO) -> int;
```
## ErrorDO::getCol

```java
/**
* @brief gets the col of this element.
* @return int
*/
```
```rust
pub fn getCol(self: ErrorDO) -> int;
```
## ErrorDO::getFile

```java
/**
* @brief gets the file of this element.
* @return string
*/
```
```rust
pub fn getFile(self: ErrorDO) -> string;
```
## ErrorDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ErrorDO;
```
## ErrorDO::getRawPos

```java
/**
* @brief gets the raw pos of this element.
* @return string
*/
```
```rust
pub fn getRawPos(self: ErrorDO) -> string;
```
## ErrorDO::getLine

```java
/**
* @brief gets the line of this element.
* @return int
*/
```
```rust
pub fn getLine(self: ErrorDO) -> int;
```
## ErrorDO::getMsg

```java
/**
* @brief gets the msg of this element.
* @return string
*/
```
```rust
pub fn getMsg(self: ErrorDO) -> string;
```
## ErrorDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: ErrorDO) -> int;
```
