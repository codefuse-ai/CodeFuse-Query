# IfStatementDO

Primary key: `id: int`

```rust
schema IfStatementDO {
  @primary id: int,
}
```
## IfStatementDO::getAlternateHashId

```rust
pub fn getAlternateHashId(self: IfStatementDO) -> int;
```
## IfStatementDO::getConditionHashId

```rust
pub fn getConditionHashId(self: IfStatementDO) -> int;
```
## IfStatementDO::getConsequentHashId

```rust
pub fn getConsequentHashId(self: IfStatementDO) -> int;
```
## IfStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IfStatementDO;
```
