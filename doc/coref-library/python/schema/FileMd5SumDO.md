# FileMd5SumDO

Primary key: `file_oid: int`

```rust
schema FileMd5SumDO {
  value: string,
  @primary file_oid: int,
}
```
## FileMd5SumDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: FileMd5SumDO) -> string;
```
## FileMd5SumDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FileMd5SumDO;
```
