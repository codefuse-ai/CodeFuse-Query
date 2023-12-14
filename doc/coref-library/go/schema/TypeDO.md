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

```rust
/**
     * @brief gets the format string of this element.
     * @return string
     */
```
```rust
pub fn getFormatString(self: TypeDO) -> string;
```
## TypeDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: TypeDO) -> int;
```
## TypeDO::getRawString

```rust
/**
     * @brief gets the raw string of this element.
     * @return string
     */
```
```rust
pub fn getRawString(self: TypeDO) -> string;
```
## TypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeDO;
```
## TypeDO::is\<T\>

```rust
pub fn is<T>(self: TypeDO) -> bool;
```
## TypeDO::to\<T\>

```rust
pub fn to<T>(self: TypeDO) -> <any>;
```
## TypeDO::key\_neq

```rust
pub fn key_neq(self: TypeDO, object: <any>) -> bool;
```
## TypeDO::key\_eq

```rust
pub fn key_eq(self: TypeDO, object: <any>) -> bool;
```
## TypeDO::to\_set

```rust
pub fn to_set(self: TypeDO) -> *TypeDO;
```
