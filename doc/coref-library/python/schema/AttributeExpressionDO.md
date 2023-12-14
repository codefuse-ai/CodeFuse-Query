# AttributeExpressionDO

Primary key: `element_oid: int`

```rust
schema AttributeExpressionDO {
  ctx_type: string,
  value_oid: int,
  @primary element_oid: int,
}
```
## AttributeExpressionDO::getCtxType

```rust
/**
     * @brief gets the ctx type of this element.
     * @return string
     */
```
```rust
pub fn getCtxType(self: AttributeExpressionDO) -> string;
```
## AttributeExpressionDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: AttributeExpressionDO) -> int;
```
## AttributeExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AttributeExpressionDO;
```
## AttributeExpressionDO::is\<T\>

```rust
pub fn is<T>(self: AttributeExpressionDO) -> bool;
```
## AttributeExpressionDO::to\<T\>

```rust
pub fn to<T>(self: AttributeExpressionDO) -> <any>;
```
## AttributeExpressionDO::key\_neq

```rust
pub fn key_neq(self: AttributeExpressionDO, object: <any>) -> bool;
```
## AttributeExpressionDO::key\_eq

```rust
pub fn key_eq(self: AttributeExpressionDO, object: <any>) -> bool;
```
## AttributeExpressionDO::to\_set

```rust
pub fn to_set(self: AttributeExpressionDO) -> *AttributeExpressionDO;
```
