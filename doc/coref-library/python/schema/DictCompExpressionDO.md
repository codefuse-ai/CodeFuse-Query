# DictCompExpressionDO

Primary key: `element_oid: int`

```rust
schema DictCompExpressionDO {
  comprehension_size: int,
  @primary element_oid: int,
}
```
## DictCompExpressionDO::getComprehensionSize

```rust
/**
     * @brief gets the comprehension size of this element.
     * @return int
     */
```
```rust
pub fn getComprehensionSize(self: DictCompExpressionDO) -> int;
```
## DictCompExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DictCompExpressionDO;
```
## DictCompExpressionDO::is\<T\>

```rust
pub fn is<T>(self: DictCompExpressionDO) -> bool;
```
## DictCompExpressionDO::to\<T\>

```rust
pub fn to<T>(self: DictCompExpressionDO) -> <any>;
```
## DictCompExpressionDO::key\_neq

```rust
pub fn key_neq(self: DictCompExpressionDO, object: <any>) -> bool;
```
## DictCompExpressionDO::key\_eq

```rust
pub fn key_eq(self: DictCompExpressionDO, object: <any>) -> bool;
```
## DictCompExpressionDO::to\_set

```rust
pub fn to_set(self: DictCompExpressionDO) -> *DictCompExpressionDO;
```
