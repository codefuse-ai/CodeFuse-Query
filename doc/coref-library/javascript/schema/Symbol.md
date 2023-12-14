# Symbol

Inherit from [SymbolDO](./SymbolDO.md)

Primary key: `oid: int`

```rust
schema Symbol extends SymbolDO {
  @primary oid: int,
  name: string,
  description: string,
}
```
## Symbol::getANode

```java
/**
* Gets a node associated with this symbol.
*/
```
```rust
pub fn getANode(self: Symbol) -> *Node;
```
## Symbol::getName

```rust
pub fn getName(self: Symbol) -> string;
```
## Symbol::getDescription

```rust
pub fn getDescription(self: Symbol) -> string;
```
## Symbol::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Symbol;
```
