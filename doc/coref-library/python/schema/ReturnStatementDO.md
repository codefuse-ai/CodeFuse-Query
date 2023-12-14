# ReturnStatementDO

Primary key: `element_oid: int`

```rust
schema ReturnStatementDO {
  is_return_empty: int,
  @primary element_oid: int,
}
```
## ReturnStatementDO::getIsReturnEmpty

```rust
/**
     * @brief gets the is return empty of this element.
     * @return int
     */
```
```rust
pub fn getIsReturnEmpty(self: ReturnStatementDO) -> int;
```
## ReturnStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ReturnStatementDO;
```
## ReturnStatementDO::is\<T\>

```rust
pub fn is<T>(self: ReturnStatementDO) -> bool;
```
## ReturnStatementDO::to\<T\>

```rust
pub fn to<T>(self: ReturnStatementDO) -> <any>;
```
## ReturnStatementDO::key\_neq

```rust
pub fn key_neq(self: ReturnStatementDO, object: <any>) -> bool;
```
## ReturnStatementDO::key\_eq

```rust
pub fn key_eq(self: ReturnStatementDO, object: <any>) -> bool;
```
## ReturnStatementDO::to\_set

```rust
pub fn to_set(self: ReturnStatementDO) -> *ReturnStatementDO;
```
