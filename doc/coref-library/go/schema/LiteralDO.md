# LiteralDO

Primary key: `oid: int`

```rust
schema LiteralDO {
  value: string,
  raw: string,
  expr: int,
  @primary oid: int,
}
```
## LiteralDO::getRaw

```rust
/**
     * @brief gets the raw of this element.
     * @return string
     */
```
```rust
pub fn getRaw(self: LiteralDO) -> string;
```
## LiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: LiteralDO) -> string;
```
## LiteralDO::getExpr

```rust
/**
     * @brief gets the expr of this element.
     * @return int
     */
```
```rust
pub fn getExpr(self: LiteralDO) -> int;
```
## LiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *LiteralDO;
```
## LiteralDO::is\<T\>

```rust
pub fn is<T>(self: LiteralDO) -> bool;
```
## LiteralDO::to\<T\>

```rust
pub fn to<T>(self: LiteralDO) -> <any>;
```
## LiteralDO::key\_neq

```rust
pub fn key_neq(self: LiteralDO, object: <any>) -> bool;
```
## LiteralDO::key\_eq

```rust
pub fn key_eq(self: LiteralDO, object: <any>) -> bool;
```
## LiteralDO::to\_set

```rust
pub fn to_set(self: LiteralDO) -> *LiteralDO;
```
