# Symbol

Primary key: `oid: int`

```rust
schema Symbol {
  @primary oid: int,
  name: string,
  description: string,
}
```
## Symbol::getANode

```rust
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

```rust
pub fn __all__(db: JavascriptDB) -> *Symbol;
```
## Symbol::is\<T\>

```rust
pub fn is<T>(self: Symbol) -> bool;
```
## Symbol::to\<T\>

```rust
pub fn to<T>(self: Symbol) -> <any>;
```
## Symbol::key\_neq

```rust
pub fn key_neq(self: Symbol, object: <any>) -> bool;
```
## Symbol::key\_eq

```rust
pub fn key_eq(self: Symbol, object: <any>) -> bool;
```
## Symbol::to\_set

```rust
pub fn to_set(self: Symbol) -> *Symbol;
```
