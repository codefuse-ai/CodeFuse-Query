# AsyncFunctionDefStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncFunctionDefStatementDO {
  name: string,
  @primary element_oid: int,
}
```
## AsyncFunctionDefStatementDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: AsyncFunctionDefStatementDO) -> string;
```
## AsyncFunctionDefStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AsyncFunctionDefStatementDO;
```
## AsyncFunctionDefStatementDO::is\<T\>

```rust
pub fn is<T>(self: AsyncFunctionDefStatementDO) -> bool;
```
## AsyncFunctionDefStatementDO::to\<T\>

```rust
pub fn to<T>(self: AsyncFunctionDefStatementDO) -> <any>;
```
## AsyncFunctionDefStatementDO::key\_neq

```rust
pub fn key_neq(self: AsyncFunctionDefStatementDO, object: <any>) -> bool;
```
## AsyncFunctionDefStatementDO::key\_eq

```rust
pub fn key_eq(self: AsyncFunctionDefStatementDO, object: <any>) -> bool;
```
## AsyncFunctionDefStatementDO::to\_set

```rust
pub fn to_set(self: AsyncFunctionDefStatementDO) -> *AsyncFunctionDefStatementDO;
```
