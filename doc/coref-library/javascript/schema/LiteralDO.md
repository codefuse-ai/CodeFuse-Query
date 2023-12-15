# LiteralDO

Primary key: `oid: int`

```rust
schema LiteralDO {
  value: string,
  @primary oid: int
}
```
## LiteralDO::getValue

```rust
pub fn getValue(self: LiteralDO) -> string;
```
## LiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LiteralDO;
```
