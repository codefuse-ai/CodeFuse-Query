# SetCompExpressionDO

Primary key: `element_oid: int`

```rust
schema SetCompExpressionDO {
  elt_oid: int,
  generator_size: int,
  @primary element_oid: int,
}
```
## SetCompExpressionDO::getGeneratorSize

```rust
/**
     * @brief gets the generator size of this element.
     * @return int
     */
```
```rust
pub fn getGeneratorSize(self: SetCompExpressionDO) -> int;
```
## SetCompExpressionDO::getEltOid

```rust
/**
     * @brief gets the elt oid of this element.
     * @return int
     */
```
```rust
pub fn getEltOid(self: SetCompExpressionDO) -> int;
```
## SetCompExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *SetCompExpressionDO;
```
## SetCompExpressionDO::is\<T\>

```rust
pub fn is<T>(self: SetCompExpressionDO) -> bool;
```
## SetCompExpressionDO::to\<T\>

```rust
pub fn to<T>(self: SetCompExpressionDO) -> <any>;
```
## SetCompExpressionDO::key\_neq

```rust
pub fn key_neq(self: SetCompExpressionDO, object: <any>) -> bool;
```
## SetCompExpressionDO::key\_eq

```rust
pub fn key_eq(self: SetCompExpressionDO, object: <any>) -> bool;
```
## SetCompExpressionDO::to\_set

```rust
pub fn to_set(self: SetCompExpressionDO) -> *SetCompExpressionDO;
```
