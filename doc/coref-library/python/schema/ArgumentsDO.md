# ArgumentsDO

Primary key: `element_oid: int`

```rust
schema ArgumentsDO {
  printable_text: string,
  parent_oid: int,
  @primary element_oid: int,
}
```
## ArgumentsDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ArgumentsDO) -> string;
```
## ArgumentsDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ArgumentsDO) -> int;
```
## ArgumentsDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ArgumentsDO;
```
## ArgumentsDO::is\<T\>

```rust
pub fn is<T>(self: ArgumentsDO) -> bool;
```
## ArgumentsDO::to\<T\>

```rust
pub fn to<T>(self: ArgumentsDO) -> <any>;
```
## ArgumentsDO::key\_neq

```rust
pub fn key_neq(self: ArgumentsDO, object: <any>) -> bool;
```
## ArgumentsDO::key\_eq

```rust
pub fn key_eq(self: ArgumentsDO, object: <any>) -> bool;
```
## ArgumentsDO::to\_set

```rust
pub fn to_set(self: ArgumentsDO) -> *ArgumentsDO;
```
