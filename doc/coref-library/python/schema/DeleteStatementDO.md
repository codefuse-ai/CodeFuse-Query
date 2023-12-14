# DeleteStatementDO

Primary key: `element_oid: int`

```rust
schema DeleteStatementDO {
  targets_size: int,
  @primary element_oid: int,
}
```
## DeleteStatementDO::getTargetsSize

```rust
/**
     * @brief gets the targets size of this element.
     * @return int
     */
```
```rust
pub fn getTargetsSize(self: DeleteStatementDO) -> int;
```
## DeleteStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DeleteStatementDO;
```
## DeleteStatementDO::is\<T\>

```rust
pub fn is<T>(self: DeleteStatementDO) -> bool;
```
## DeleteStatementDO::to\<T\>

```rust
pub fn to<T>(self: DeleteStatementDO) -> <any>;
```
## DeleteStatementDO::key\_neq

```rust
pub fn key_neq(self: DeleteStatementDO, object: <any>) -> bool;
```
## DeleteStatementDO::key\_eq

```rust
pub fn key_eq(self: DeleteStatementDO, object: <any>) -> bool;
```
## DeleteStatementDO::to\_set

```rust
pub fn to_set(self: DeleteStatementDO) -> *DeleteStatementDO;
```
