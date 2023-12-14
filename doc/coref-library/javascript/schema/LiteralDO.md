# LiteralDO

Primary key: `oid: int`

```rust
schema LiteralDO {
  value: string,
  @primary oid: int,
}
```
## LiteralDO::getValue

```rust
pub fn getValue(self: LiteralDO) -> string;
```
## LiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LiteralDO;
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
