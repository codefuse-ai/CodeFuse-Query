# Scope

Inherit from [CombineElement](./CombineElement.md)

Primary key: `id: int`

```rust
schema Scope extends CombineElement {
  @primary id: int,
}
```
## Scope::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Scope) -> *CombineElement;
```
## Scope::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Scope) -> CombineElement;
```
## Scope::getLocation

```java
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

```java
/**
* @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
* @return Scope 
*/
```
```rust
pub fn getEnclosingScope(self: Scope) -> Scope;
```
## Scope::getType

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn getType(self: Scope) -> string;
```
## Scope::getAnAncestorForIndex

```java
/**
* @brief gets the index for printing AST.
* @return int 
*/
```
```rust
pub fn getAnAncestorForIndex(self: Scope, index: int) -> CombineElement;
```
## Scope::print

```java
/**
* @brief gets the printable text for printing AST
* @return string 
*/
```
```rust
pub fn print(self: Scope) -> string;
```
## Scope::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Scope;
```
