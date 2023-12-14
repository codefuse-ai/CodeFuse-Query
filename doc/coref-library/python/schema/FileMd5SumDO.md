# FileMd5SumDO

Primary key: `file_oid: int`

```rust
schema FileMd5SumDO {
  value: string,
  @primary file_oid: int,
}
```
## FileMd5SumDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: FileMd5SumDO) -> string;
```
## FileMd5SumDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *FileMd5SumDO;
```
## FileMd5SumDO::is\<T\>

```rust
pub fn is<T>(self: FileMd5SumDO) -> bool;
```
## FileMd5SumDO::to\<T\>

```rust
pub fn to<T>(self: FileMd5SumDO) -> <any>;
```
## FileMd5SumDO::key\_neq

```rust
pub fn key_neq(self: FileMd5SumDO, object: <any>) -> bool;
```
## FileMd5SumDO::key\_eq

```rust
pub fn key_eq(self: FileMd5SumDO, object: <any>) -> bool;
```
## FileMd5SumDO::to\_set

```rust
pub fn to_set(self: FileMd5SumDO) -> *FileMd5SumDO;
```
