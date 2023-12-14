# CompareExpressionDO

Primary key: `element_oid: int`

```rust
schema CompareExpressionDO {
  left_expr_oid: int,
  @primary element_oid: int,
}
```
## CompareExpressionDO::getLeftExprOid

```rust
/**
     * @brief gets the left expr oid of this element.
     * @return int
     */
```
```rust
pub fn getLeftExprOid(self: CompareExpressionDO) -> int;
```
## CompareExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CompareExpressionDO;
```
## CompareExpressionDO::is\<T\>

```rust
pub fn is<T>(self: CompareExpressionDO) -> bool;
```
## CompareExpressionDO::to\<T\>

```rust
pub fn to<T>(self: CompareExpressionDO) -> <any>;
```
## CompareExpressionDO::key\_neq

```rust
pub fn key_neq(self: CompareExpressionDO, object: <any>) -> bool;
```
## CompareExpressionDO::key\_eq

```rust
pub fn key_eq(self: CompareExpressionDO, object: <any>) -> bool;
```
## CompareExpressionDO::to\_set

```rust
pub fn to_set(self: CompareExpressionDO) -> *CompareExpressionDO;
```
