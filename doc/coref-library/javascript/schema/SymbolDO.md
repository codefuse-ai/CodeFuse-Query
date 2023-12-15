# SymbolDO

Primary key: `oid: int`

```rust
schema SymbolDO {
  description: string,
  name: string,
  @primary oid: int
}
```
## SymbolDO::getDescription

```rust
pub fn getDescription(self: SymbolDO) -> string;
```
## SymbolDO::getName

```rust
pub fn getName(self: SymbolDO) -> string;
```
## SymbolDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SymbolDO;
```
