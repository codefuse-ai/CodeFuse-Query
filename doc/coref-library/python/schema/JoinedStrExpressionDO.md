# JoinedStrExpressionDO

Primary key: `element_oid: int`

```rust
schema JoinedStrExpressionDO {
  size: int,
  @primary element_oid: int,
}
```
## JoinedStrExpressionDO::getSize

```rust
/**
     * @brief gets the size of this element.
     * @return int
     */
```
```rust
pub fn getSize(self: JoinedStrExpressionDO) -> int;
```
## JoinedStrExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *JoinedStrExpressionDO;
```
## JoinedStrExpressionDO::is\<T\>

```rust
pub fn is<T>(self: JoinedStrExpressionDO) -> bool;
```
## JoinedStrExpressionDO::to\<T\>

```rust
pub fn to<T>(self: JoinedStrExpressionDO) -> <any>;
```
## JoinedStrExpressionDO::key\_neq

```rust
pub fn key_neq(self: JoinedStrExpressionDO, object: <any>) -> bool;
```
## JoinedStrExpressionDO::key\_eq

```rust
pub fn key_eq(self: JoinedStrExpressionDO, object: <any>) -> bool;
```
## JoinedStrExpressionDO::to\_set

```rust
pub fn to_set(self: JoinedStrExpressionDO) -> *JoinedStrExpressionDO;
```
