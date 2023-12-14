# NonLocalStatementDO

Primary key: `element_oid: int`

```rust
schema NonLocalStatementDO {
  names: int,
  @primary element_oid: int,
}
```
## NonLocalStatementDO::getNames

```rust
/**
     * @brief gets the names of this element.
     * @return int
     */
```
```rust
pub fn getNames(self: NonLocalStatementDO) -> int;
```
## NonLocalStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *NonLocalStatementDO;
```
## NonLocalStatementDO::is\<T\>

```rust
pub fn is<T>(self: NonLocalStatementDO) -> bool;
```
## NonLocalStatementDO::to\<T\>

```rust
pub fn to<T>(self: NonLocalStatementDO) -> <any>;
```
## NonLocalStatementDO::key\_neq

```rust
pub fn key_neq(self: NonLocalStatementDO, object: <any>) -> bool;
```
## NonLocalStatementDO::key\_eq

```rust
pub fn key_eq(self: NonLocalStatementDO, object: <any>) -> bool;
```
## NonLocalStatementDO::to\_set

```rust
pub fn to_set(self: NonLocalStatementDO) -> *NonLocalStatementDO;
```
