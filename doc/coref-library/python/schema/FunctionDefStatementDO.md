# FunctionDefStatementDO

Primary key: `element_oid: int`

```rust
schema FunctionDefStatementDO {
  name: string,
  @primary element_oid: int,
}
```
## FunctionDefStatementDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: FunctionDefStatementDO) -> string;
```
## FunctionDefStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *FunctionDefStatementDO;
```
## FunctionDefStatementDO::is\<T\>

```rust
pub fn is<T>(self: FunctionDefStatementDO) -> bool;
```
## FunctionDefStatementDO::to\<T\>

```rust
pub fn to<T>(self: FunctionDefStatementDO) -> <any>;
```
## FunctionDefStatementDO::key\_neq

```rust
pub fn key_neq(self: FunctionDefStatementDO, object: <any>) -> bool;
```
## FunctionDefStatementDO::key\_eq

```rust
pub fn key_eq(self: FunctionDefStatementDO, object: <any>) -> bool;
```
## FunctionDefStatementDO::to\_set

```rust
pub fn to_set(self: FunctionDefStatementDO) -> *FunctionDefStatementDO;
```
