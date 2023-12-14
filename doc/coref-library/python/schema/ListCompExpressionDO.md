# ListCompExpressionDO

Primary key: `element_oid: int`

```rust
schema ListCompExpressionDO {
  elt_oid: int,
  generator_size: int,
  @primary element_oid: int,
}
```
## ListCompExpressionDO::getGeneratorSize

```rust
/**
     * @brief gets the generator size of this element.
     * @return int
     */
```
```rust
pub fn getGeneratorSize(self: ListCompExpressionDO) -> int;
```
## ListCompExpressionDO::getEltOid

```rust
/**
     * @brief gets the elt oid of this element.
     * @return int
     */
```
```rust
pub fn getEltOid(self: ListCompExpressionDO) -> int;
```
## ListCompExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ListCompExpressionDO;
```
## ListCompExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ListCompExpressionDO) -> bool;
```
## ListCompExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ListCompExpressionDO) -> <any>;
```
## ListCompExpressionDO::key\_neq

```rust
pub fn key_neq(self: ListCompExpressionDO, object: <any>) -> bool;
```
## ListCompExpressionDO::key\_eq

```rust
pub fn key_eq(self: ListCompExpressionDO, object: <any>) -> bool;
```
## ListCompExpressionDO::to\_set

```rust
pub fn to_set(self: ListCompExpressionDO) -> *ListCompExpressionDO;
```
