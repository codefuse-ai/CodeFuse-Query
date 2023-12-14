# Scope

Primary key: `id: int`

```rust
schema Scope {
  @primary id: int,
}
```
## Scope::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Scope) -> *CombineElement;
```
## Scope::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Scope) -> CombineElement;
```
## Scope::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Scope) -> Location;
```
## Scope::getParentOid

```rust
pub fn getParentOid(self: Scope) -> int;
```
## Scope::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Scope) -> Scope;
```
## Scope::getType

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn getType(self: Scope) -> string;
```
## Scope::getAnAncestorForIndex

```rust
/**
     * @brief gets the index for printing AST.
     * @return int 
     */
```
```rust
pub fn getAnAncestorForIndex(self: Scope, index: int) -> CombineElement;
```
## Scope::print

```rust
/**
     * @brief gets the printable text for printing AST
     * @return string 
     */
```
```rust
pub fn print(self: Scope) -> string;
```
## Scope::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Scope;
```
## Scope::is\<T\>

```rust
pub fn is<T>(self: Scope) -> bool;
```
## Scope::to\<T\>

```rust
pub fn to<T>(self: Scope) -> <any>;
```
## Scope::key\_neq

```rust
pub fn key_neq(self: Scope, object: <any>) -> bool;
```
## Scope::key\_eq

```rust
pub fn key_eq(self: Scope, object: <any>) -> bool;
```
## Scope::to\_set

```rust
pub fn to_set(self: Scope) -> *Scope;
```
