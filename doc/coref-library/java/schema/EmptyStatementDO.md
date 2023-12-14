# EmptyStatementDO

Primary key: `element_hash_id: int`

```rust
schema EmptyStatementDO {
  @primary element_hash_id: int,
}
```
## EmptyStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EmptyStatementDO;
```
## EmptyStatementDO::is\<T\>

```rust
pub fn is<T>(self: EmptyStatementDO) -> bool;
```
## EmptyStatementDO::to\<T\>

```rust
pub fn to<T>(self: EmptyStatementDO) -> <any>;
```
## EmptyStatementDO::key\_neq

```rust
pub fn key_neq(self: EmptyStatementDO, object: <any>) -> bool;
```
## EmptyStatementDO::key\_eq

```rust
pub fn key_eq(self: EmptyStatementDO, object: <any>) -> bool;
```
## EmptyStatementDO::to\_set

```rust
pub fn to_set(self: EmptyStatementDO) -> *EmptyStatementDO;
```
