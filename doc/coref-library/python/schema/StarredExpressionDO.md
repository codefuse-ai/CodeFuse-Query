# StarredExpressionDO

Primary key: `element_oid: int`

```rust
schema StarredExpressionDO {
  ctx: string,
  @primary element_oid: int,
}
```
## StarredExpressionDO::getCtx

```rust
/**
     * @brief gets the ctx of this element.
     * @return string
     */
```
```rust
pub fn getCtx(self: StarredExpressionDO) -> string;
```
## StarredExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *StarredExpressionDO;
```
## StarredExpressionDO::is\<T\>

```rust
pub fn is<T>(self: StarredExpressionDO) -> bool;
```
## StarredExpressionDO::to\<T\>

```rust
pub fn to<T>(self: StarredExpressionDO) -> <any>;
```
## StarredExpressionDO::key\_neq

```rust
pub fn key_neq(self: StarredExpressionDO, object: <any>) -> bool;
```
## StarredExpressionDO::key\_eq

```rust
pub fn key_eq(self: StarredExpressionDO, object: <any>) -> bool;
```
## StarredExpressionDO::to\_set

```rust
pub fn to_set(self: StarredExpressionDO) -> *StarredExpressionDO;
```
