# ExprContextDO

Primary key: `element_oid: int`

```rust
schema ExprContextDO {
  printable_text: string,
  parent_oid: int,
  @primary element_oid: int,
}
```
## ExprContextDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ExprContextDO) -> string;
```
## ExprContextDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ExprContextDO) -> int;
```
## ExprContextDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ExprContextDO;
```
## ExprContextDO::is\<T\>

```rust
pub fn is<T>(self: ExprContextDO) -> bool;
```
## ExprContextDO::to\<T\>

```rust
pub fn to<T>(self: ExprContextDO) -> <any>;
```
## ExprContextDO::key\_neq

```rust
pub fn key_neq(self: ExprContextDO, object: <any>) -> bool;
```
## ExprContextDO::key\_eq

```rust
pub fn key_eq(self: ExprContextDO, object: <any>) -> bool;
```
## ExprContextDO::to\_set

```rust
pub fn to_set(self: ExprContextDO) -> *ExprContextDO;
```
