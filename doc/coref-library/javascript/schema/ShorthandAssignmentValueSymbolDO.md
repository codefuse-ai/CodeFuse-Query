# ShorthandAssignmentValueSymbolDO

Primary key: `node_oid: int`

```rust
schema ShorthandAssignmentValueSymbolDO {
  symbol_oid: int,
  @primary node_oid: int,
}
```
## ShorthandAssignmentValueSymbolDO::getSymbolOid

```rust
pub fn getSymbolOid(self: ShorthandAssignmentValueSymbolDO) -> int;
```
## ShorthandAssignmentValueSymbolDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ShorthandAssignmentValueSymbolDO;
```
