# ComprehensionDO

Primary key: `element_oid: int`

```rust
schema ComprehensionDO {
  parent_oid: int,
  element_index: int,
  printable_text: string,
  iter_expr_oid: int,
  target_expr_oid: int,
  @primary element_oid: int,
}
```
## ComprehensionDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ComprehensionDO) -> string;
```
## ComprehensionDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getIterExprOid

```rust
/**
     * @brief gets the iter expr oid of this element.
     * @return int
     */
```
```rust
pub fn getIterExprOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getTargetExprOid

```rust
/**
     * @brief gets the target expr oid of this element.
     * @return int
     */
```
```rust
pub fn getTargetExprOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ComprehensionDO;
```
## ComprehensionDO::is\<T\>

```rust
pub fn is<T>(self: ComprehensionDO) -> bool;
```
## ComprehensionDO::to\<T\>

```rust
pub fn to<T>(self: ComprehensionDO) -> <any>;
```
## ComprehensionDO::key\_neq

```rust
pub fn key_neq(self: ComprehensionDO, object: <any>) -> bool;
```
## ComprehensionDO::key\_eq

```rust
pub fn key_eq(self: ComprehensionDO, object: <any>) -> bool;
```
## ComprehensionDO::to\_set

```rust
pub fn to_set(self: ComprehensionDO) -> *ComprehensionDO;
```
