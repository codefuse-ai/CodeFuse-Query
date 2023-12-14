# FormattedValueExpressionDO

Primary key: `element_oid: int`

```rust
schema FormattedValueExpressionDO {
  value_oid: int,
  @primary element_oid: int,
}
```
## FormattedValueExpressionDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: FormattedValueExpressionDO) -> int;
```
## FormattedValueExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *FormattedValueExpressionDO;
```
## FormattedValueExpressionDO::is\<T\>

```rust
pub fn is<T>(self: FormattedValueExpressionDO) -> bool;
```
## FormattedValueExpressionDO::to\<T\>

```rust
pub fn to<T>(self: FormattedValueExpressionDO) -> <any>;
```
## FormattedValueExpressionDO::key\_neq

```rust
pub fn key_neq(self: FormattedValueExpressionDO, object: <any>) -> bool;
```
## FormattedValueExpressionDO::key\_eq

```rust
pub fn key_eq(self: FormattedValueExpressionDO, object: <any>) -> bool;
```
## FormattedValueExpressionDO::to\_set

```rust
pub fn to_set(self: FormattedValueExpressionDO) -> *FormattedValueExpressionDO;
```
