# TryStatementDO

Primary key: `id: int`

```rust
schema TryStatementDO {
  @primary id: int
}
```
## TryStatementDO::getFinallyBlockHashId

```rust
pub fn getFinallyBlockHashId(self: TryStatementDO) -> int;
```
## TryStatementDO::getTryBlockHashId

```rust
pub fn getTryBlockHashId(self: TryStatementDO) -> int;
```
## TryStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TryStatementDO;
```
