# TypeNameDO

Primary key: `oid: int`

```rust
schema TypeNameDO {
  name: string,
  @primary oid: int
}
```
## TypeNameDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: TypeNameDO) -> string;
```
## TypeNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeNameDO;
```
