# GeneratorExpressionDO

Primary key: `element_oid: int`

```rust
schema GeneratorExpressionDO {
  elt_oid: int,
  @primary element_oid: int,
}
```
## GeneratorExpressionDO::getEltOid

```rust
/**
     * @brief gets the elt oid of this element.
     * @return int
     */
```
```rust
pub fn getEltOid(self: GeneratorExpressionDO) -> int;
```
## GeneratorExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *GeneratorExpressionDO;
```
## GeneratorExpressionDO::is\<T\>

```rust
pub fn is<T>(self: GeneratorExpressionDO) -> bool;
```
## GeneratorExpressionDO::to\<T\>

```rust
pub fn to<T>(self: GeneratorExpressionDO) -> <any>;
```
## GeneratorExpressionDO::key\_neq

```rust
pub fn key_neq(self: GeneratorExpressionDO, object: <any>) -> bool;
```
## GeneratorExpressionDO::key\_eq

```rust
pub fn key_eq(self: GeneratorExpressionDO, object: <any>) -> bool;
```
## GeneratorExpressionDO::to\_set

```rust
pub fn to_set(self: GeneratorExpressionDO) -> *GeneratorExpressionDO;
```
