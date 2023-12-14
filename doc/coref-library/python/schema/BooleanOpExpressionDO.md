# BooleanOpExpressionDO

Primary key: `element_oid: int`

```rust
schema BooleanOpExpressionDO {
  size: int,
  type: string,
  @primary element_oid: int,
}
```
## BooleanOpExpressionDO::getSize

```rust
/**
     * @brief gets the size of this element.
     * @return int
     */
```
```rust
pub fn getSize(self: BooleanOpExpressionDO) -> int;
```
## BooleanOpExpressionDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: BooleanOpExpressionDO) -> string;
```
## BooleanOpExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *BooleanOpExpressionDO;
```
## BooleanOpExpressionDO::is\<T\>

```rust
pub fn is<T>(self: BooleanOpExpressionDO) -> bool;
```
## BooleanOpExpressionDO::to\<T\>

```rust
pub fn to<T>(self: BooleanOpExpressionDO) -> <any>;
```
## BooleanOpExpressionDO::key\_neq

```rust
pub fn key_neq(self: BooleanOpExpressionDO, object: <any>) -> bool;
```
## BooleanOpExpressionDO::key\_eq

```rust
pub fn key_eq(self: BooleanOpExpressionDO, object: <any>) -> bool;
```
## BooleanOpExpressionDO::to\_set

```rust
pub fn to_set(self: BooleanOpExpressionDO) -> *BooleanOpExpressionDO;
```
