# ImportFromStatementDO

Primary key: `element_oid: int`

```rust
schema ImportFromStatementDO {
  module: string,
  level: int,
  @primary element_oid: int,
}
```
## ImportFromStatementDO::getLevel

```rust
/**
     * @brief gets the level of this element.
     * @return int
     */
```
```rust
pub fn getLevel(self: ImportFromStatementDO) -> int;
```
## ImportFromStatementDO::getModule

```rust
/**
     * @brief gets the module of this element.
     * @return string
     */
```
```rust
pub fn getModule(self: ImportFromStatementDO) -> string;
```
## ImportFromStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ImportFromStatementDO;
```
## ImportFromStatementDO::is\<T\>

```rust
pub fn is<T>(self: ImportFromStatementDO) -> bool;
```
## ImportFromStatementDO::to\<T\>

```rust
pub fn to<T>(self: ImportFromStatementDO) -> <any>;
```
## ImportFromStatementDO::key\_neq

```rust
pub fn key_neq(self: ImportFromStatementDO, object: <any>) -> bool;
```
## ImportFromStatementDO::key\_eq

```rust
pub fn key_eq(self: ImportFromStatementDO, object: <any>) -> bool;
```
## ImportFromStatementDO::to\_set

```rust
pub fn to_set(self: ImportFromStatementDO) -> *ImportFromStatementDO;
```
