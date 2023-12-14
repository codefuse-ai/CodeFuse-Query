# HasEllipsisDO

Primary key: `oid: int`

```rust
schema HasEllipsisDO {
  call_or_conversion_expr_id: int,
  @primary oid: int,
}
```
## HasEllipsisDO::getCallOrConversionExprId

```rust
/**
     * @brief gets the call or conversion expr id of this element.
     * @return int
     */
```
```rust
pub fn getCallOrConversionExprId(self: HasEllipsisDO) -> int;
```
## HasEllipsisDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *HasEllipsisDO;
```
## HasEllipsisDO::is\<T\>

```rust
pub fn is<T>(self: HasEllipsisDO) -> bool;
```
## HasEllipsisDO::to\<T\>

```rust
pub fn to<T>(self: HasEllipsisDO) -> <any>;
```
## HasEllipsisDO::key\_neq

```rust
pub fn key_neq(self: HasEllipsisDO, object: <any>) -> bool;
```
## HasEllipsisDO::key\_eq

```rust
pub fn key_eq(self: HasEllipsisDO, object: <any>) -> bool;
```
## HasEllipsisDO::to\_set

```rust
pub fn to_set(self: HasEllipsisDO) -> *HasEllipsisDO;
```
