# GlobalStatementDO

Primary key: `element_oid: int`

```rust
schema GlobalStatementDO {
  names: string,
  @primary element_oid: int,
}
```
## GlobalStatementDO::getNames

```rust
/**
     * @brief gets the names of this element.
     * @return string
     */
```
```rust
pub fn getNames(self: GlobalStatementDO) -> string;
```
## GlobalStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *GlobalStatementDO;
```
## GlobalStatementDO::is\<T\>

```rust
pub fn is<T>(self: GlobalStatementDO) -> bool;
```
## GlobalStatementDO::to\<T\>

```rust
pub fn to<T>(self: GlobalStatementDO) -> <any>;
```
## GlobalStatementDO::key\_neq

```rust
pub fn key_neq(self: GlobalStatementDO, object: <any>) -> bool;
```
## GlobalStatementDO::key\_eq

```rust
pub fn key_eq(self: GlobalStatementDO, object: <any>) -> bool;
```
## GlobalStatementDO::to\_set

```rust
pub fn to_set(self: GlobalStatementDO) -> *GlobalStatementDO;
```
