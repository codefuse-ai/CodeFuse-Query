# FolderDO

Primary key: `oid: int`

```rust
schema FolderDO {
  name: string,
  @primary oid: int,
}
```
## FolderDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FolderDO) -> string;
```
## FolderDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FolderDO;
```
