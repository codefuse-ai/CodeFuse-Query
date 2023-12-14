# NodeSymbolDO

Primary key: `node_oid: int`

```rust
schema NodeSymbolDO {
  symbol_oid: int,
  @primary node_oid: int,
}
```
## NodeSymbolDO::getSymbolOid

```rust
pub fn getSymbolOid(self: NodeSymbolDO) -> int;
```
## NodeSymbolDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NodeSymbolDO;
```
## NodeSymbolDO::is\<T\>

```rust
pub fn is<T>(self: NodeSymbolDO) -> bool;
```
## NodeSymbolDO::to\<T\>

```rust
pub fn to<T>(self: NodeSymbolDO) -> <any>;
```
## NodeSymbolDO::key\_neq

```rust
pub fn key_neq(self: NodeSymbolDO, object: <any>) -> bool;
```
## NodeSymbolDO::key\_eq

```rust
pub fn key_eq(self: NodeSymbolDO, object: <any>) -> bool;
```
## NodeSymbolDO::to\_set

```rust
pub fn to_set(self: NodeSymbolDO) -> *NodeSymbolDO;
```
