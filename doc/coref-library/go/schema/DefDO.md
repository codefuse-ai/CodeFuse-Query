# DefDO

Primary key: `oid: int`

```rust
schema DefDO {
  object: int,
  ident: int,
  @primary oid: int,
}
```
## DefDO::getObject

```java
/**
* @brief gets the object of this element.
* @return int
*/
```
```rust
pub fn getObject(self: DefDO) -> int;
```
## DefDO::getIdent

```java
/**
* @brief gets the ident of this element.
* @return int
*/
```
```rust
pub fn getIdent(self: DefDO) -> int;
```
## DefDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *DefDO;
```
