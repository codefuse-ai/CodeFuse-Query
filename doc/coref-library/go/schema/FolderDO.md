# FolderDO

Primary key: `oid: int`

```rust
schema FolderDO {
  name: string,
  @primary oid: int,
}
```
## FolderDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: FolderDO) -> string;
```
## FolderDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *FolderDO;
```
## FolderDO::is\<T\>

```rust
pub fn is<T>(self: FolderDO) -> bool;
```
## FolderDO::to\<T\>

```rust
pub fn to<T>(self: FolderDO) -> <any>;
```
## FolderDO::key\_neq

```rust
pub fn key_neq(self: FolderDO, object: <any>) -> bool;
```
## FolderDO::key\_eq

```rust
pub fn key_eq(self: FolderDO, object: <any>) -> bool;
```
## FolderDO::to\_set

```rust
pub fn to_set(self: FolderDO) -> *FolderDO;
```
