# FileSha256SumDO

Primary key: `file_oid: int`

```rust
schema FileSha256SumDO {
  value: string,
  @primary file_oid: int,
}
```
## FileSha256SumDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: FileSha256SumDO) -> string;
```
## FileSha256SumDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *FileSha256SumDO;
```
## FileSha256SumDO::is\<T\>

```rust
pub fn is<T>(self: FileSha256SumDO) -> bool;
```
## FileSha256SumDO::to\<T\>

```rust
pub fn to<T>(self: FileSha256SumDO) -> <any>;
```
## FileSha256SumDO::key\_neq

```rust
pub fn key_neq(self: FileSha256SumDO, object: <any>) -> bool;
```
## FileSha256SumDO::key\_eq

```rust
pub fn key_eq(self: FileSha256SumDO, object: <any>) -> bool;
```
## FileSha256SumDO::to\_set

```rust
pub fn to_set(self: FileSha256SumDO) -> *FileSha256SumDO;
```
