# FileSha256SumDO

Primary key: `file_oid: int`

```rust
schema FileSha256SumDO {
  value: string,
  @primary file_oid: int
}
```
## FileSha256SumDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: FileSha256SumDO) -> string;
```
## FileSha256SumDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FileSha256SumDO;
```
