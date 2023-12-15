# ReturnStatementDO

Primary key: `element_oid: int`

```rust
schema ReturnStatementDO {
  is_return_empty: int,
  @primary element_oid: int
}
```
## ReturnStatementDO::getIsReturnEmpty

```java
/**
* @brief gets the is return empty of this element.
* @return int
*/
```
```rust
pub fn getIsReturnEmpty(self: ReturnStatementDO) -> int;
```
## ReturnStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ReturnStatementDO;
```
