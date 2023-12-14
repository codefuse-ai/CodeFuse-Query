# UsesDO

Primary key: `oid: int`

```rust
schema UsesDO {
  object: int,
  ident: int,
  @primary oid: int,
}
```
## UsesDO::getObject

```java
/**
* @brief gets the object of this element.
* @return int
*/
```
```rust
pub fn getObject(self: UsesDO) -> int;
```
## UsesDO::getIdent

```java
/**
* @brief gets the ident of this element.
* @return int
*/
```
```rust
pub fn getIdent(self: UsesDO) -> int;
```
## UsesDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *UsesDO;
```
