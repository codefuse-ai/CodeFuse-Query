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

```rust
pub fn __all__(db: JavascriptDB) -> *ShorthandAssignmentValueSymbolDO;
```
## ShorthandAssignmentValueSymbolDO::is\<T\>

```rust
pub fn is<T>(self: ShorthandAssignmentValueSymbolDO) -> bool;
```
## ShorthandAssignmentValueSymbolDO::to\<T\>

```rust
pub fn to<T>(self: ShorthandAssignmentValueSymbolDO) -> <any>;
```
## ShorthandAssignmentValueSymbolDO::key\_neq

```rust
pub fn key_neq(self: ShorthandAssignmentValueSymbolDO, object: <any>) -> bool;
```
## ShorthandAssignmentValueSymbolDO::key\_eq

```rust
pub fn key_eq(self: ShorthandAssignmentValueSymbolDO, object: <any>) -> bool;
```
## ShorthandAssignmentValueSymbolDO::to\_set

```rust
pub fn to_set(self: ShorthandAssignmentValueSymbolDO) -> *ShorthandAssignmentValueSymbolDO;
```
