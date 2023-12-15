# NodeSymbolDO

Primary key: `node_oid: int`

```rust
schema NodeSymbolDO {
  symbol_oid: int,
  @primary node_oid: int
}
```
## NodeSymbolDO::getSymbolOid

```rust
pub fn getSymbolOid(self: NodeSymbolDO) -> int;
```
## NodeSymbolDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NodeSymbolDO;
```
