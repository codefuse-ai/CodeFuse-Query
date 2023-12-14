# HasEllipsisDO

Primary key: `oid: int`

```rust
schema HasEllipsisDO {
  call_or_conversion_expr_id: int,
  @primary oid: int,
}
```
## HasEllipsisDO::getCallOrConversionExprId

```java
/**
* @brief gets the call or conversion expr id of this element.
* @return int
*/
```
```rust
pub fn getCallOrConversionExprId(self: HasEllipsisDO) -> int;
```
## HasEllipsisDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *HasEllipsisDO;
```
