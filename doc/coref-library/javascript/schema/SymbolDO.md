# SymbolDO

Primary key: `oid: int`

```rust
schema SymbolDO {
  description: string,
  name: string,
  @primary oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *SymbolDO;
```
## SymbolDO::is\<T\>

```rust
pub fn is<T>(self: SymbolDO) -> bool;
```
## SymbolDO::to\<T\>

```rust
pub fn to<T>(self: SymbolDO) -> <any>;
```
## SymbolDO::key\_neq

```rust
pub fn key_neq(self: SymbolDO, object: <any>) -> bool;
```
## SymbolDO::key\_eq

```rust
pub fn key_eq(self: SymbolDO, object: <any>) -> bool;
```
## SymbolDO::to\_set

```rust
pub fn to_set(self: SymbolDO) -> *SymbolDO;
```
