# ClassDefStatementDO

Primary key: `element_oid: int`

```rust
schema ClassDefStatementDO {
  name: string,
  @primary element_oid: int,
}
```
## ClassDefStatementDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ClassDefStatementDO) -> string;
```
## ClassDefStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ClassDefStatementDO;
```
## ClassDefStatementDO::is\<T\>

```rust
pub fn is<T>(self: ClassDefStatementDO) -> bool;
```
## ClassDefStatementDO::to\<T\>

```rust
pub fn to<T>(self: ClassDefStatementDO) -> <any>;
```
## ClassDefStatementDO::key\_neq

```rust
pub fn key_neq(self: ClassDefStatementDO, object: <any>) -> bool;
```
## ClassDefStatementDO::key\_eq

```rust
pub fn key_eq(self: ClassDefStatementDO, object: <any>) -> bool;
```
## ClassDefStatementDO::to\_set

```rust
pub fn to_set(self: ClassDefStatementDO) -> *ClassDefStatementDO;
```
