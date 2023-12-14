# TypeName

Inherit from [TypeNameDO](./TypeNameDO.md)

Primary key: `oid: int`

```rust
schema TypeName extends TypeNameDO {
  @primary oid: int,
  name: string,
}
```
## TypeName::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: TypeName) -> string;
```
## TypeName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeName;
```
