# TypeDO

Primary key: `oid: int`

```rust
schema TypeDO {
  format_string: string,
  raw_string: string,
  kind: int,
  @primary oid: int,
}
```
## TypeDO::getFormatString

```java
/**
* @brief gets the format string of this element.
* @return string
*/
```
```rust
pub fn getFormatString(self: TypeDO) -> string;
```
## TypeDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: TypeDO) -> int;
```
## TypeDO::getRawString

```java
/**
* @brief gets the raw string of this element.
* @return string
*/
```
```rust
pub fn getRawString(self: TypeDO) -> string;
```
## TypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeDO;
```
